package services;


import models.Sprites;

public interface Controllable{
	public void setSprite(Sprites sprite);
	public Sprites getSprite();
	public void controlSprite(Sprites sprite,int x, int y);
	public void controlledMove();
}
