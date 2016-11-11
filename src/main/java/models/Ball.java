package models;

import javax.swing.ImageIcon;

import javax.swing.JPanel;

import dragtree.DragSourceComponent;
import dragtree.TransfrableObject;
import helpers.Constants;

public class Ball extends DragSourceComponent implements Constants {
	public Ball(String ballImage, JPanel parentParel) {

		super(parentParel);
		
		this.dx = Constants.TWO;
		this.dy = Constants.TWO;

		this.imagePath = ballImage;

		this.setImage(new ImageIcon(this.getClass().getResource(this.imagePath)).getImage());

		this.height = Constants.BALL_DEFAULT_HEIGHT;
		this.width = Constants.BALL_DEFAULT_WIDTH;

		this.spriteType = Constants.BALL;
		super.setTransfrableObject(new TransfrableObject(this));
		super.resetCoordinate(this);

	}

	public Ball() {
		super(null);
	}

	public void reset() {
		x = GAMEMAKER_PANEL_WIDTH / 2;
		y = GAMEMAKER_PANEL_HEIGHT / 2;

	}

	@Override
	public int move() {

		this.controlHandler.controlledMove();
		return Constants.ZERO;
	}

}
