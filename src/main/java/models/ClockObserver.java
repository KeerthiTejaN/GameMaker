package models;

import java.util.TimerTask;
import java.util.concurrent.CountDownLatch;

import helpers.Constants;

public class ClockObserver extends TimerTask {

	public ClockPanel clockPanel;
	private final CountDownLatch latch;
	public ClockObserver(ClockPanel clockPanel,CountDownLatch latch) {
		super();
		this.clockPanel = clockPanel;
		this.latch      = latch;

	}

	@Override
	public void run() {

			clockPanel.displayTime(Constants.CLOCK_INTERVAL);

		latch.countDown();
	}

}
