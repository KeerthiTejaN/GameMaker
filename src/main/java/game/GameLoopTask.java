package game;

import models.ClockPanel;
import models.TimerObservable;
import views.GamePanelView;

public class GameLoopTask {
	
	private TimerObservable timerObserver;
	private ClockPanel clockPanel;
	public GameLoopTask(GamePanelView gamePanelView) {
		super();
		
		clockPanel = new ClockPanel(gamePanelView);
		gamePanelView.add(clockPanel);
		clockPanel.setVisible(false);
		timerObserver = new TimerObservable(clockPanel, gamePanelView.getObserverList());
	}

	public void startGame(){
		while(true){
			
			timerObserver.updateObservers();
		}
	}

}
