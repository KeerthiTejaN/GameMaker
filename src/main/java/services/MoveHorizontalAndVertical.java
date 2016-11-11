package services;

import helpers.Constants;
import models.Sprites;

public class MoveHorizontalAndVertical implements Movable{

	public int moveTheSprite(Sprites sprites) {
		// TODO Auto-generated method stub
		
		sprites.setX(sprites.getX()+sprites.getDx());
		sprites.setY(sprites.getY()+sprites.getDy());
		if(sprites.getX() < 0){
			sprites.setX(0);
			sprites.setDx(-sprites.getDx());
		}
		if(sprites.getY() < 0){
			sprites.setY(0);
			sprites.setDy(-sprites.getDy());
		}
		
		if( sprites.getX() >= sprites.getParentPanel().getWidth()-sprites.getWidth()){
			sprites.setX(sprites.getParentPanel().getWidth()-sprites.getWidth());
			sprites.setDx(-sprites.getDx());
		}else if(sprites.getX() <= 0){
			sprites.setX(0);
			sprites.setDx(-sprites.getDx());
		}
		if( sprites.getY() >= sprites.getParentPanel().getHeight()-sprites.getHeight()){
			sprites.setY(sprites.getParentPanel().getHeight()-sprites.getHeight());
			sprites.setDy(-sprites.getDy());
		}else if(sprites.getY() <= 0){
			sprites.setY(0);
			sprites.setDy(-sprites.getDy());
		}
		return Constants.ZERO;
		
	}


}
