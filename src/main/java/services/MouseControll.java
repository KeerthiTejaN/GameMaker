package services;


import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import models.Sprites;

public class MouseControll extends MouseAdapter implements Controllable{

	public MouseControll() {
		super();
	}

	private Sprites sprite;
	
	@Override
    public void mouseMoved(MouseEvent e) {
     
		 int mouseX = e.getX();
		 int mouseY = e.getY();
		 controlSprite(this.sprite, mouseX, mouseY);
    }

	public void controlSprite(Sprites sprite, int x, int y) {
		// TODO Auto-generated method stub
		if(this.sprite.getUserOption().getMovement().equals("MoveHorizontal")){
			this.sprite.setX(x);
		}else if (this.sprite.getUserOption().getMovement().equals("MoveVertical")){
			this.sprite.setY(y);
		}else{
			this.sprite.setX(x);
			this.sprite.setY(y);
		}
	}

	public void setSprite(Sprites sprite) {
		// TODO Auto-generated method stub
		this.sprite = sprite;
	}

	public Sprites getSprite() {
		// TODO Auto-generated method stub
		return this.sprite;
	}

	public void controlledMove() {
		// TODO Auto-generated method stub
		
	}

}
