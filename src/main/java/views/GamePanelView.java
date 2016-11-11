package views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.util.Iterator;

import javax.swing.ImageIcon;

import controllers.GameLogicController;
import dragtree.DropTargetComponent;
import helpers.Constants;
import models.Ball;
import models.Brick;
import models.Paddle;
import models.Sprites;

@SuppressWarnings("serial")
public class GamePanelView extends DropTargetComponent {
	
	Ball ball;
	Brick brick;
	Paddle paddle;
	Image backGround;
	GameLogicController gamePanelSpriteController;
	
	public GamePanelView(){
		super();
		super.setParentPanel(this);
		this.setPreferredSize(new Dimension(Constants.GAME_PANEL_WIDTH, Constants.GAME_PANEL_HEIGHT));
		this.setBounds(Constants.FRAME_WIDTH/Constants.TWO, Constants.ZERO, Constants.GAME_PANEL_WIDTH, Constants.GAME_PANEL_HEIGHT);
		this.setBackground(Color.WHITE);
		super.setParentPanel(this);
		backGround = new ImageIcon(this.getClass().getResource(Constants.PIC_BACKGROUND)).getImage();

	}
	
	public Image getBackGround() {
		return backGround;
	}

	public void setBackGround(Image backGround) {
		this.backGround = backGround;
	}

	
	@Override
	public void paintComponent(Graphics g) {
		   g.setColor(getBackground());
	        Rectangle r = g.getClipBounds();
	        g.fillRect(r.x, r.y, r.width, r.height);

		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		g2d.drawImage(backGround, Constants.ZERO, Constants.ZERO, this.getWidth(), this.getHeight(), this);
		
		Iterator<Sprites> iterator = this.getObserverList().iterator();
		while(iterator.hasNext()){
			Sprites sprite = iterator.next();
				if((sprite).isDestroyed() == true){
					//Removes the Brick from the iterator and the ObserverList
					iterator.remove();
			}
		}
		
		for(Sprites obj : this.getObserverList()){
		
			g2d.drawImage(obj.getImage(), obj.getX(), obj.getY(), this);
		}
	
	}
}
