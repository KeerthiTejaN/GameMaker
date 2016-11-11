package models;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import dragtree.DragSourceComponent;
import dragtree.TransfrableObject;
import helpers.Constants;

public class Brick extends DragSourceComponent implements Constants {

	public Brick() {
		super(null);
	}

	public Brick(String pic, JPanel parentParel) {
		super(parentParel);
		super.setTransfrableObject(new TransfrableObject(this));
		this.imagePath = pic;

		setImage(new ImageIcon(this.getClass().getResource(this.imagePath)).getImage());
		destroyed = false;
		this.spriteType = Constants.BRICK;
	}

	public void copy(Brick brick) {

		this.dx = brick.dx;
		this.dy = brick.dy;
		this.height = brick.height;
		this.image = brick.image;
		this.destroyed = brick.destroyed;
		this.width = brick.width;
		this.x = brick.x;
		this.y = brick.y;
	}

	@Override
	public int move() {
		// TODO Auto-generated method stub

		this.controlHandler.controlledMove();
		
		return Constants.ONE;

	}
}
