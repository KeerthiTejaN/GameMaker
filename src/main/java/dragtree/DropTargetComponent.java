package dragtree;

import java.awt.Component;

import java.awt.Point;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetDragEvent;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.dnd.DropTargetEvent;
import java.awt.dnd.DropTargetListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JPanel;

import models.Ball;
import models.Sprites;
import models.UserOption;
import services.Collidable;
import services.Controllable;

@SuppressWarnings("serial")
public class DropTargetComponent extends JPanel implements DropTargetListener {

	private ArrayList<Sprites> observerList;
	private JPanel parentPanel;

	public JPanel getParentPanel() {
		return parentPanel;
	}

	public void setParentPanel(JPanel parentPanel) {
		this.parentPanel = parentPanel;
	}

	public synchronized ArrayList<Sprites> getObserverList() {
		return observerList;
	}

	public synchronized void setObserverList(ArrayList<Sprites> observerList) {
		this.observerList = observerList;
	}

	public DropTargetComponent() {
		// TODO Auto-generated constructor stub

		new DropTarget(this, DnDConstants.ACTION_COPY_OR_MOVE, this);
		observerList = new ArrayList<Sprites>();
	}

	public void dragEnter(DropTargetDragEvent dtde) {
		// TODO No functionality required here , might be used in future

	}

	public void dragOver(DropTargetDragEvent dtde) {
		// TODO No functionality required here , might be used in future
	}

	public void dropActionChanged(DropTargetDragEvent dtde) {
		// TODO No functionality required here , might be used in future
	}

	public void dragExit(DropTargetEvent dte) {
		// TODO No functionality required here , might be used in future
	}

	public void drop(DropTargetDropEvent dtde) {

		dtde.acceptDrop(DnDConstants.ACTION_COPY_OR_MOVE);
		try {
			if (dtde.getTransferable() != null) {

				@SuppressWarnings("unused")
				DataFlavor SPRITE_FLAVOR = new DataFlavor(Ball.class,
						"application/x-java-serialized-object; class=<representation class>");

				Object comp;

				Sprites dropedSprite = (Sprites) dtde.getTransferable().getTransferData(new DataFlavor(Sprites.class,
						"application/x-java-serialized-object; class=<representation class>"));
				comp = Class.forName(dropedSprite.getClass().getName()).newInstance();
				UserOption userOptionWithSprite = new UserOption();
				userOptionWithSprite.setControl(dropedSprite.getUserOption().getControl());
				userOptionWithSprite.setMovement(dropedSprite.getUserOption().getMovement());
				userOptionWithSprite.setSound(dropedSprite.getUserOption().getSound());
				userOptionWithSprite.setCollideAction(dropedSprite.getUserOption().getCollideAction());

				((Sprites) comp).resetCoordinate(dropedSprite);
				((Sprites) comp).setUserOption(userOptionWithSprite);
				((Sprites) comp).setParentPanel(this.parentPanel);
				((Sprites) comp).setControlHandler((Controllable) Class
						.forName("services." + ((Sprites) comp).getUserOption().getControl()).newInstance());
				((Sprites) comp).setCollideAction((Collidable) Class
						.forName("services." + ((Sprites) comp).getUserOption().getCollideAction()).newInstance());

				DropTarget test = (DropTarget) dtde.getSource();
				Component ca = (Component) test.getComponent();
				Point dropPoint = ca.getMousePosition();
				((Sprites) comp).setX((int) dropPoint.getX());
				((Sprites) comp).setY((int) dropPoint.getY());

				this.observerList.add((Sprites) comp);
				this.validate();
				this.repaint();
			}

		} catch (UnsupportedFlavorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
