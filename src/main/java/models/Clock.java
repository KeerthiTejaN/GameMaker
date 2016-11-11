package models;

import javax.swing.JButton;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Clock extends JPanel{

	public Clock(JPanel parentPanel) {
		// TODO Auto-generated constructor stub
	
		JButton tempButton = new JButton("clock");
		this.add(tempButton);
	}
}
