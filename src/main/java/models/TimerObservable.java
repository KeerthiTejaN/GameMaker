package models;

import java.util.ArrayList;
import java.util.Timer;
import java.util.concurrent.CountDownLatch;

import controllers.GameLogicController;
import helpers.Constants;

public class TimerObservable {
	
	private Timer timer;
	private ClockPanel clockPanel;
	private ArrayList<Sprites> observerList;
	
	public TimerObservable(ClockPanel clockPanel, ArrayList<Sprites> observerList){
		this.clockPanel = clockPanel;
		this.timer = new Timer();
		this.observerList = observerList;
	}
	
	public void register()
	{};
	public void unRegister()
	{};
	
	public int updateObservers(){
		CountDownLatch latch = new CountDownLatch(2);
		timer.schedule(new ClockObserver(clockPanel,latch), 17);
		timer.schedule(new GameLogicController(observerList,clockPanel.gamePanelView, latch), 17);

		
		try {
			latch.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return Constants.ONE;
	}


}
