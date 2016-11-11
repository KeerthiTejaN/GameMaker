package controllers;

import java.awt.event.ActionEvent;


import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JPanel;

import models.UserOption;

public class ControllActionListenerController implements ActionListener{
	private JComboBox<String> combo;

	public JComboBox<String> getCombo() {
		return combo;
	}

	public void setCombo(JComboBox<String> combo) {
		this.combo = combo;
	}

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

	private JPanel spritesPanel;
	private UserOption userOption;
	public ControllActionListenerController(JComboBox<String> combo,UserOption userOption) {
		this.combo = combo;
		this.userOption = userOption;
	}
	
	public ControllActionListenerController(JComboBox<String> combo,JPanel spritesPanel) {
		this.combo = combo;
		this.spritesPanel = spritesPanel;
	}

	public void actionPerformed(ActionEvent e) {
	
       String selectedAction = (String) this.combo.getSelectedItem();
       this.userOption.setControl(selectedAction.replaceAll(" ","")); 
	}
}
