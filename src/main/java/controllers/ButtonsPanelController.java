package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;

import services.GameStatus;
import views.GamePanelView;

public class ButtonsPanelController implements ActionListener{
	
	GamePanelView gamePanelView;
	JComboBox<String> buttonsList;

	public ButtonsPanelController(GamePanelView gamePanelView, JComboBox<String> buttonsList) {
		super();
		this.gamePanelView = gamePanelView;
		this.buttonsList = buttonsList;
	}
	
	public void actionPerformed(ActionEvent e) {
		String stringName = (String) this.buttonsList.getSelectedItem();
		if(stringName == "Start Button"){
			JButton start = new JButton("Start");
			gamePanelView.add(start);
			start.addActionListener(new ActionListener(){

				public void actionPerformed(ActionEvent e) {
					GameStatus.setGameStarted(true);
				}
				
			});
		}
			
		else if(stringName == "Stop Button"){
			JButton stop = new JButton("Stop");
			gamePanelView.add(stop);
			stop.addActionListener(new ActionListener(){

				public void actionPerformed(ActionEvent e) {
					GameStatus.setGameStopped(true);
				}
				
			});
			
		}
		
	}

}
