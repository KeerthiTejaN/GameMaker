package services;


import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import models.Sprites;

public class AutoControll extends MouseAdapter implements Controllable{

	public AutoControll() {
		super();
	}

	private Sprites sprite;

	
	@Override
    public void mouseMoved(MouseEvent e) {
     	
    }

	public void controlSprite(Sprites sprite, int x, int y) {
		// TODO Auto-generated method stub
	
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
		
		try {
			Movable movement = (Movable) Class.forName("services."+this.getSprite().getUserOption().getMovement()).newInstance();
		
			movement.moveTheSprite(this.getSprite());
			
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


}
