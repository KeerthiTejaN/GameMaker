package services;

import helpers.Constants;
import models.Sprites;

public class Bounce implements Collidable{

	private Sprites sprite;
	public Sprites getSprite() {
		return sprite;
	}
	public void setSprite(Sprites sprite) {
		this.sprite = sprite;
	}
	public int actionAfterCollision() {
		// TODO Auto-generated method stub

		this.sprite.setDx(-this.sprite.getDx());
		this.sprite.setDy(-this.sprite.getDy());
		return Constants.ZERO;
		
	}

}
