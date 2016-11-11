package models;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import dragtree.DragSourceComponent;
import dragtree.TransfrableObject;
import helpers.Constants;
public class Paddle extends DragSourceComponent implements Constants {
	
    public Paddle(){
    	super(null);
    }
	public Paddle(String paddlePic, JPanel parentParel) {
	
        super(parentParel);
        this.parentPanel = parentParel;
        this.imagePath = paddlePic;
        this.setImage(new ImageIcon(this.getClass().getResource(this.imagePath)).getImage());
        this.spriteType = Constants.PADDLE;
        this.height = Constants.PADDLE_HEIGHT;
		this.width = Constants.PADDLE_WIDTH;
        super.setTransfrableObject(new TransfrableObject(this));
   
    	this.x = Constants.GAME_PANEL_WIDTH /Constants.THREE;
    	this.y = Constants.GAME_PANEL_HEIGHT - Constants.FIFTY;
           }
	 
	 @Override
	 public int move() {

			this.controlHandler.controlledMove();
			
			return Constants.ONE;
	    }
  
}

