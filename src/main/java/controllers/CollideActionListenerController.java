package controllers;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JPanel;

import models.UserOption;

public class CollideActionListenerController implements ActionListener{
	private JComboBox<String> combo;
	public JComboBox<String> getCombo() {
		return combo;
	}

	public void setCombo(JComboBox<String> combo) {
		this.combo = combo;
	}
	
	private JPanel spritesPanel;
	public JPanel getSpritesPanel() {
		return spritesPanel;
	}

	public void setSpritesPanel(JPanel spritesPanel) {
		this.spritesPanel = spritesPanel;
	}

	public UserOption getUserOption() {
		return userOption;
	}

	public void setUserOption(UserOption userOption) {
		this.userOption = userOption;
	}

	private UserOption userOption;
	public CollideActionListenerController(JComboBox<String> combo,UserOption userOption) {
		this.combo = combo;
		this.userOption = userOption;
	}
	
	public CollideActionListenerController(JComboBox<String> combo,JPanel spritesPanel) {
		this.combo = combo;
		this.spritesPanel = spritesPanel;
	}

	public void actionPerformed(ActionEvent e) {
	
       String selectedAction = (String) this.combo.getSelectedItem();
       this.userOption.setCollideAction(selectedAction.replaceAll(" ","")); 
	}

}
