package services;

import helpers.Constants;
import models.Sprites;

public class MoveVertical implements Movable{

	public int moveTheSprite(Sprites sprites) {
		// TODO Auto-generated method stub
		
		sprites.setY(sprites.getY()+sprites.getDy());
		if(sprites.getY() < 0){
			sprites.setY(0);
			sprites.setDy(-sprites.getDy());
		}
		
		if( sprites.getY() >= sprites.getParentPanel().getWidth()-sprites.getHeight()){
			sprites.setY(sprites.getParentPanel().getWidth()-sprites.getHeight());
			sprites.setDy(-sprites.getDy());
		}else if(sprites.getY() <= 0){
			sprites.setY(0);
			sprites.setDy(-sprites.getDy());
		}
		return Constants.ZERO;
	}

}
