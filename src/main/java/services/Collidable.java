package services;

import models.Sprites;

public interface Collidable {

	public int actionAfterCollision();
	public void setSprite(Sprites sprite);
	public Sprites getSprite();
}
