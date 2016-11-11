package services;

import helpers.Constants;
import models.Sprites;

public class NoCollideAction implements Collidable{

	private Sprites sprite;
	public Sprites getSprite() {
		return sprite;
	}
	public void setSprite(Sprites sprite) {
		this.sprite = sprite;
	}
	public int actionAfterCollision() {
		// TODO Auto-generated method stub
		
		//These sprites do not have any effect upon collision
		return Constants.ONE;
	}

}
