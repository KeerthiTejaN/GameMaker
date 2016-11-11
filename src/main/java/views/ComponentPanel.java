package views;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JPanel;

import dragtree.DragSourceComponent;
import helpers.Constants;

@SuppressWarnings("serial")
public class ComponentPanel extends JPanel{

	private DragSourceComponent draggableComponent;
	
	public DragSourceComponent getDraggableComponent() {
		return draggableComponent;
	}

	public void setDraggableComponent(DragSourceComponent draggableComponent) {
		this.draggableComponent = draggableComponent;
	}

	public ComponentPanel() {
		// TODO Auto-generated constructor stub
		
		FlowLayout flowLayOutSpritesPanel = new FlowLayout();
		this.setLayout(flowLayOutSpritesPanel);
		this.setPreferredSize(new Dimension(Constants.SPRITES_PARENT_WIDTH, Constants.SPRITES_PARENT_HEIGHT));
		this.setOpaque(false);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		int x = 10, y = 10;
	
			g2d.drawImage(this.draggableComponent.getImage(),Constants.TEN,Constants.TEN,this);

		
	}
}
