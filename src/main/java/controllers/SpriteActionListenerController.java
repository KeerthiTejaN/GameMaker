package controllers;

import java.awt.event.ActionEvent;


import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JPanel;

import models.UserOption;
import services.DefaultSprites;

public class SpriteActionListenerController implements ActionListener{
	private JComboBox<String> combo;


	private JPanel spritesPanel;
	private UserOption userOption;

	public UserOption getUserOption() {
		return userOption;
	}

	public void setUserOption(UserOption userOption) {
		this.userOption = userOption;
	}

	public SpriteActionListenerController(JComboBox<String> combo) {
		this.combo = combo;
	}
	
	public SpriteActionListenerController(JComboBox<String> combo,JPanel spritesPanel,UserOption userOption) {
		this.userOption = userOption;
		this.combo = combo;
		this.spritesPanel = spritesPanel;
	}

	public void actionPerformed(ActionEvent e) {
	
        String stringName = (String) this.combo.getSelectedItem();
        if(stringName == "Select Sprite"){
        	
		}
        
        else if(stringName == "Brick"){
        	
         	new DefaultSprites(this.spritesPanel,this.userOption).getAllBricks();
        	this.spritesPanel.revalidate();
       		this.spritesPanel.repaint();
			
		}
        
        else if(stringName == "Ball"){
        	
        	new DefaultSprites(this.spritesPanel,this.userOption).getAllBalls();
        	this.spritesPanel.revalidate();
       		this.spritesPanel.repaint();
		
		}
        else if(stringName == "Paddle"){
 			
        	new DefaultSprites(this.spritesPanel,this.userOption).getAllPaddles();
        	this.spritesPanel.revalidate();
       		this.spritesPanel.repaint();
		}
        
        else if(stringName == "SpecialBrick"){
        	new DefaultSprites(this.spritesPanel,this.userOption).getAllspecialBricks();
        	this.spritesPanel.revalidate();
       		this.spritesPanel.repaint();
        }
        
        else if(stringName == "Clock"){
        	new DefaultSprites(this.spritesPanel,this.userOption).getClock();
        	this.spritesPanel.revalidate();
       		this.spritesPanel.repaint();
        }
      
	}

}
