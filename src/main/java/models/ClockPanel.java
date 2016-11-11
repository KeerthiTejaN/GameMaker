package models;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import helpers.Constants;
import services.GameStatus;


@SuppressWarnings("serial")
public class ClockPanel extends JPanel{

	private JLabel label;
	private int milliSecCounter;
	private int secCounter;
	private int minCounter;
	private int hrCounter;
	JPanel gamePanelView;
	
	public ClockPanel(JPanel gamePanelView) {
		
		this.milliSecCounter = Constants.ZERO;
		this.secCounter      = Constants.ZERO;
		this.minCounter      = Constants.ZERO;
		this.hrCounter       = Constants.ZERO;
		this.gamePanelView = gamePanelView;
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(Constants.GAME_PANEL_WIDTH, Constants.GAME_PANEL_HEIGHT/10));
		addTimerLabel();
		this.setOpaque(false);
		setDoubleBuffered(true);
		setFocusable(true);

	}

	public int addTimerLabel() {
		label = new JLabel();
		label.setFont(new Font("Arial", Font.BOLD, 24));
		label.setText(" CLOCK    "+hrCounter+":"+minCounter+":"+secCounter);
		add(label);
		
		return Constants.ZERO;
		
	}
    
	public int displayTime(int msCounter) {
		milliSecCounter += msCounter;
		if(GameStatus.isClockAdded()){
			this.setVisible(true);
		}
		if(GameStatus.isGameStarted()==true  && GameStatus.isGameStopped() == false){
			showTime();
		}
		return Constants.ONE;
	}
	
	public synchronized JLabel getLabel() {
		return label;
	}

	public synchronized void setLabel(JLabel label) {
		this.label = label;
	}

	public synchronized int getMilliSecCounter() {
		return milliSecCounter;
	}

	public synchronized void setMilliSecCounter(int milliSecCounter) {
		this.milliSecCounter = milliSecCounter;
	}

	public synchronized int getSecCounter() {
		return secCounter;
	}

	public synchronized void setSecCounter(int secCounter) {
		this.secCounter = secCounter;
	}

	public synchronized int getMinCounter() {
		return minCounter;
	}

	public synchronized void setMinCounter(int minCounter) {
		this.minCounter = minCounter;
	}

	public synchronized int getHrCounter() {
		return hrCounter;
	}

	public synchronized void setHrCounter(int hrCounter) {
		this.hrCounter = hrCounter;
	}

	public synchronized JPanel getGamePanelView() {
		return gamePanelView;
	}

	public synchronized void setGamePanelView(JPanel gamePanelView) {
		this.gamePanelView = gamePanelView;
	}

	public int showTime(){
		if(milliSecCounter >= Constants.MAX_MILLISEC){
			secCounter++;
			milliSecCounter = Constants.ZERO;
		}
		if(secCounter >= Constants.MAX_SEC){
			minCounter++;
			secCounter  = Constants.ZERO;
		}
		if(minCounter >= Constants.MAX_MIN){
			hrCounter++;
			minCounter  = Constants.ZERO;
		}
		label.setText(" Clock     "+hrCounter+":"+minCounter+":"+secCounter);
		
		return Constants.ZERO;
		
	}

	
}
