package services;


import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import models.Sprites;

public class KeyboardControll extends KeyAdapter implements Controllable{

	
	public KeyboardControll(Sprites sprite) {
		super();
		this.sprite = sprite;
	}
	private Sprites sprite;
	
    public Sprites getSprite() {
		return sprite;
	}

	public void setSprite(Sprites sprite) {
		this.sprite = sprite;
	}

	public void controlSprite(Sprites sprite, int x, int y) {
		// TODO Auto-generated method stub
		
		try {
				Movable movement = (Movable) Class.forName("services."+this.sprite.getUserOption()).newInstance();
				movement.moveTheSprite(this.sprite);
				
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

	// Start moving when left or right keys are pressed.
    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_LEFT) {
        	this.sprite.setDx(-2);
        	controlSprite(sprite, this.sprite.getDx(), this.sprite.getDy());
       }
        if (key == KeyEvent.VK_RIGHT){
        	this.sprite.setDx(2);
        	controlSprite(sprite, this.sprite.getDx(), this.sprite.getDy());
        }
    }
    
    // Stop moving when left or right keys are released.
    @Override
    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_LEFT) {
        	this.sprite.setDx(0);
        	controlSprite(sprite, this.sprite.getDx(), this.sprite.getDy());
        }
        if (key == KeyEvent.VK_RIGHT) {
        	this.sprite.setDx(0);
        	controlSprite(sprite, this.sprite.getDx(), this.sprite.getDy());
        }
    }

	public void controlledMove() {
		// TODO Auto-generated method stub
		
	}

}
