package services;

import helpers.Constants;
import models.Sprites;

public class BlowUp implements Collidable{

	private Sprites sprite;
	public Sprites getSprite() {
		return sprite;
	}
	public void setSprite(Sprites sprite) {
		this.sprite = sprite;
	}
	public int actionAfterCollision() {
		// TODO Auto-generated method stub
		if(this.sprite.isSpecialBrick()){
			this.sprite.setSpecialBrick(false);
		}else{
		this.sprite.setDestroyed(true);
		}
	return Constants.ONE;
	}

}
