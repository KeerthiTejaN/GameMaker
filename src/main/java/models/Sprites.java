package models;

import java.awt.Image;

import java.awt.Rectangle;
import java.awt.event.MouseMotionListener;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JPanel;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonSubTypes;
import org.codehaus.jackson.annotate.JsonSubTypes.Type;

import helpers.Constants;

import org.codehaus.jackson.annotate.JsonTypeInfo;

import services.Collidable;
import services.Controllable;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({ @Type(value = Ball.class, name = "ball"), @Type(value = Brick.class, name = "brick"),
		@Type(value = Paddle.class, name = "paddle") })
public abstract class Sprites {

	protected int x;
	protected int y;
	protected int width;
	protected int height;
	protected int dx;
	protected int dy;
	protected boolean destroyed = false;

	public boolean isDestroyed() {
		return destroyed;
	}

	public void setDestroyed(boolean destroyed) {
		this.destroyed = destroyed;
	}

	protected UserOption userOption;
	protected JPanel parentPanel;

	public JPanel getParentPanel() {
		return parentPanel;
	}

	public void setParentPanel(JPanel parentPanel) {
		this.parentPanel = parentPanel;
	}

	protected boolean specialBrick = false;

	public synchronized boolean isSpecialBrick() {
		return specialBrick;
	}

	public synchronized void setSpecialBrick(boolean specialBrick) {
		this.specialBrick = specialBrick;

	}

	protected Controllable controlHandler; // Instance of the mouse event
											// handler

	protected Collidable collideAction;

	public Collidable getCollideAction() {
		return collideAction;
	}

	@JsonIgnore
	public void setCollideAction(Collidable collideAction) {
		this.collideAction = collideAction;
		this.getCollideAction().setSprite((Sprites) this);
	}

	public Controllable getControlHandler() {
		return controlHandler;
	}

	@JsonIgnore
	public void setControlHandler(Controllable controlHandler) {
		this.controlHandler = controlHandler;
		this.getControlHandler().setSprite((Sprites) this);
		this.parentPanel.addMouseMotionListener((MouseMotionListener) this.getControlHandler());
	}

	public UserOption getUserOption() {
		return userOption;
	}

	public void setUserOption(UserOption userOption) {
		this.userOption = userOption;
	}

	protected Image image;

	public Sprites() {

		x = Constants.ZERO;
		y = Constants.ZERO;
		dx = Constants.ONE;
		dy = Constants.ONE;

	}

	public abstract int move();

	protected String imagePath;

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public int getSpriteType() {
		return spriteType;
	}

	public void setSpriteType(int spriteType) {
		this.spriteType = spriteType;
	}

	public int getSpriteSubType() {
		return spriteSubType;
	}

	public void setSpriteSubType(int spriteSubType) {
		this.spriteSubType = spriteSubType;
	}

	protected int spriteType;
	protected int spriteSubType;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getDx() {
		return dx;
	}

	public void setDx(int dx) {
		this.dx = dx;
	}

	public int getDy() {
		return dy;
	}

	public void setDy(int dy) {
		this.dy = dy;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {

		this.image = image;
	}

	public void playCollisionSound() {
		try {

			if (this.getUserOption().getSound() != null) {
				AudioInputStream audioIn = AudioSystem
						.getAudioInputStream(this.getClass().getResource(this.getUserOption().getSound()));
				Clip clip = AudioSystem.getClip();
				clip.open(audioIn);
				clip.start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Rectangle intersectRect() {

		return new Rectangle(x, y, image.getWidth(null), image.getHeight(null));
	}

	public void resetCoordinate(Sprites sprite) {

		this.x = sprite.getX();
		this.y = sprite.getY();
		this.dx = sprite.getDx();
		this.dy = sprite.getDy();
		this.width = sprite.getWidth();
		this.height = sprite.getHeight();
		this.imagePath = sprite.getImagePath();
		this.image = sprite.image;
		this.userOption = sprite.getUserOption();
		this.specialBrick = sprite.isSpecialBrick();
	}
}
