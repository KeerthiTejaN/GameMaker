package services;

import helpers.Constants;
import models.Sprites;

public class MoveHorizontal implements Movable{

	public int moveTheSprite(Sprites sprites) {
		// TODO Auto-generated method stub
		
		sprites.setX(sprites.getX()+sprites.getDx());
		if(sprites.getX() < 0){
			sprites.setX(0);
			sprites.setDx(-sprites.getDx());
		}
		
		if( sprites.getX() >= sprites.getParentPanel().getWidth()-sprites.getWidth()){
			sprites.setX(sprites.getParentPanel().getWidth()-sprites.getWidth());
			sprites.setDx(-sprites.getDx());
		}else if(sprites.getX() <= 0){
			sprites.setX(0);
			sprites.setDx(-sprites.getDx());
			
		}
		return Constants.ZERO;
	}
	

}
