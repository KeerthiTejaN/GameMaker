package services;


import javax.swing.JPanel;

import dragtree.DragSourceComponent;
import helpers.Constants;
import models.Ball;
import models.Brick;
import models.Clock;
import models.Paddle;
import models.UserOption;
import views.ComponentPanel;

public class DefaultSprites {

	private JPanel parentPanel;
	private UserOption userOption;
	public UserOption getUserOption() {
		return userOption;
	}
	public void setUserOption(UserOption userOption) {
		this.userOption = userOption;
	}
	public DefaultSprites(JPanel parenParent,UserOption userOption) {
		
		this.parentPanel = parenParent;
		this.userOption = userOption;
		//super();
		}

	
	public JPanel getParentPanel() {
		return parentPanel;
	}
	public void setParentPanel(JPanel parentPanel) {
		this.parentPanel = parentPanel;
	}
	public int repaintComponent(ComponentPanel component,DragSourceComponent sprite){
		
		component.setDraggableComponent(sprite);
		component.revalidate();
		component.repaint();
		this.parentPanel.add(component);
		return Constants.ZERO;
	}
	public int getAllBalls(){
				
		this.parentPanel.removeAll();
		ComponentPanel componentPanelBall1 = new ComponentPanel();
		Ball ball1 = new Ball(Constants.PIC_BALL2, componentPanelBall1);
		
		ball1.setUserOption(this.userOption);
		ball1.setSpriteSubType(Constants.ONE);
		repaintComponent(componentPanelBall1, ball1);
		
		ComponentPanel componentPanelBall2 = new ComponentPanel();
		Ball ball2 = new Ball(Constants.PIC_BALL7, componentPanelBall2);
		ball2.setUserOption(this.userOption);
		ball2.setSpriteSubType(Constants.TWO);
		repaintComponent(componentPanelBall2, ball2);

		ComponentPanel componentPanelBall3 = new ComponentPanel();
		Ball ball3 = new Ball(Constants.PIC_BALL4, componentPanelBall3);
		ball3.setUserOption(this.userOption);
		ball3.setSpriteSubType(Constants.THREE);
		repaintComponent(componentPanelBall3, ball3);

		ComponentPanel componentPanelBall4 = new ComponentPanel();
		Ball ball4 = new Ball(Constants.PIC_BALL5, componentPanelBall4);
		ball4.setUserOption(this.userOption);
		ball4.setSpriteSubType(Constants.FOUR);
		repaintComponent(componentPanelBall4, ball4);
		
		return Constants.ONE;
		
	}
	
	public int getAllPaddles(){
		
		this.parentPanel.removeAll();
		ComponentPanel componentPanelPaddle11 = new ComponentPanel();
		Paddle paddle1 = new Paddle(Constants.PIC_PADDLE, componentPanelPaddle11);
		paddle1.setUserOption(this.userOption);
		paddle1.setSpriteSubType(Constants.ONE);
		repaintComponent(componentPanelPaddle11, paddle1);
		
		ComponentPanel componentPanelPaddle12 = new ComponentPanel();
		Paddle paddle2 = new Paddle(Constants.PIC_PADDLE2, componentPanelPaddle12);
		paddle2.setUserOption(this.userOption);
		paddle2.setSpriteSubType(Constants.TWO);
		repaintComponent(componentPanelPaddle12, paddle2);

		ComponentPanel componentPanelPaddle13 = new ComponentPanel();
		Paddle paddle3 = new Paddle(Constants.PIC_PADDLE3, componentPanelPaddle13);
		paddle3.setUserOption(this.userOption);
		paddle3.setSpriteSubType(Constants.THREE);
		repaintComponent(componentPanelPaddle13, paddle3);

		ComponentPanel componentPanelPaddle14 = new ComponentPanel();
		Paddle paddle4 = new Paddle(Constants.PIC_PADDLE4, componentPanelPaddle14);
		paddle4.setUserOption(this.userOption);
		repaintComponent(componentPanelPaddle14, paddle4);	
		
		return Constants.ONE;
	}
	
public int getAllBricks(){
		
	this.parentPanel.removeAll();
	ComponentPanel componentPanelBrick1 = new ComponentPanel();
	Brick brick1 = new Brick(Constants.PIC_BRICK1, componentPanelBrick1);
	brick1.setUserOption(this.userOption);
	brick1.setSpriteSubType(Constants.ONE);
	repaintComponent(componentPanelBrick1, brick1);
	
	ComponentPanel componentPanelBrick2 = new ComponentPanel();
	Brick brick2 = new Brick(Constants.PIC_BRICK2, componentPanelBrick2);
	brick2.setUserOption(this.userOption);
	brick2.setSpriteSubType(Constants.TWO);
	repaintComponent(componentPanelBrick2, brick2);
	
	ComponentPanel componentPanelBrick3 = new ComponentPanel();
	Brick brick3 = new Brick(Constants.PIC_BRICK3, componentPanelBrick3);
	brick3.setUserOption(this.userOption);
	brick3.setSpriteSubType(Constants.THREE);
	repaintComponent(componentPanelBrick3, brick3);
	
	ComponentPanel componentPanelBrick4 = new ComponentPanel();
	Brick brick4 = new Brick(Constants.PIC_BRICK4, componentPanelBrick4);
	brick4.setUserOption(this.userOption);
	brick4.setSpriteSubType(Constants.FOUR);
	repaintComponent(componentPanelBrick4, brick4);
	
	return Constants.ONE;
			
	}

public int getAllspecialBricks(){
	
	this.parentPanel.removeAll();
	ComponentPanel componentPanelspecialBrick1 = new ComponentPanel();
	Brick specialBrick1 = new Brick(Constants.PIC_SPECIALBRICK1, componentPanelspecialBrick1);
	specialBrick1.setUserOption(this.userOption);
	specialBrick1.setSpriteSubType(Constants.ONE);
	specialBrick1.setSpecialBrick(true);
	repaintComponent(componentPanelspecialBrick1, specialBrick1);
	
	ComponentPanel componentPanelspecialBrick2 = new ComponentPanel();
	Brick specialBrick2 = new Brick(Constants.PIC_SPECIALBRICK7, componentPanelspecialBrick2);
	specialBrick2.setUserOption(this.userOption);
	specialBrick2.setSpriteSubType(Constants.TWO);
	specialBrick2.setSpecialBrick(true);
	repaintComponent(componentPanelspecialBrick2, specialBrick2);
	
	ComponentPanel componentPanelspecialBrick3 = new ComponentPanel();
	Brick specialBrick3 = new Brick(Constants.PIC_SPECIALBRICK6, componentPanelspecialBrick3);
	specialBrick3.setUserOption(this.userOption);
	specialBrick3.setSpriteSubType(Constants.THREE);
	specialBrick3.setSpecialBrick(true);
	repaintComponent(componentPanelspecialBrick3, specialBrick3);
	
	ComponentPanel componentPanelspecialBrick4 = new ComponentPanel();
	Brick specialBrick4 = new Brick(Constants.PIC_SPECIALBRICK5, componentPanelspecialBrick4);
	specialBrick4.setUserOption(this.userOption);
	specialBrick4.setSpriteSubType(Constants.FOUR);
	specialBrick4.setSpecialBrick(true);
	repaintComponent(componentPanelspecialBrick4, specialBrick4);
			
	return Constants.ONE;
	
	}

public void getClock(){
	
	this.parentPanel.removeAll();
	ComponentPanel componentPanelClock = new ComponentPanel();
	Clock clock = new Clock(componentPanelClock);
	componentPanelClock.add(clock);
	
}
	
}