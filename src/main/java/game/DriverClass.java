package game;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.io.IOException;

import javax.swing.JFrame;

import helpers.Constants;
import views.GameMakerView;
import views.GamePanelView;

public class DriverClass {

	
	public static void main(String args[]){
		
		try {
		JFrame mainFrame = new JFrame("Game Maker");
		
		mainFrame.setLayout(new GridLayout(1, 2));
		
		GamePanelView gamePanelView = new GamePanelView();
		GameMakerView gameMakerView = new GameMakerView(gamePanelView);
		GameLoopTask gameLoopTask = new GameLoopTask(gamePanelView);
		
		gameMakerView.addShapes();
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.add(gameMakerView);
		mainFrame.add(gamePanelView);
		
		mainFrame.setPreferredSize(new Dimension(Constants.FRAME_WIDTH, Constants.FRAME_HEIGHT));
		mainFrame.setResizable(true);
		mainFrame.setBackground(Color.WHITE);
		mainFrame.pack();
		mainFrame.setVisible(true) ;
		mainFrame.setLocationRelativeTo(null);
		gameLoopTask.startGame();
		
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
