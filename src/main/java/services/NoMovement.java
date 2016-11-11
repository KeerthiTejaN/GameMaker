package services;

import helpers.Constants;
import models.Sprites;

public class NoMovement implements Movable{

	public int moveTheSprite(Sprites sprites) {
		// TODO Auto-generated method stub
		
		//These kind of sprites do not move
		return Constants.ZERO;
	}

}
