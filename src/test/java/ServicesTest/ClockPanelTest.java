package ServicesTest;


import javax.swing.JLabel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import helpers.Constants;
import models.ClockPanel;
import views.GamePanelView;
import static org.mockito.Mockito.*;

public class ClockPanelTest {
	

	@Before
	public void setUp(){
		
	}
	
	@Test
	public void displayTimeTest(){
		
		GamePanelView gamePanelView = mock(GamePanelView.class);
		ClockPanel clockPanel= new ClockPanel(gamePanelView);
		Assert.assertEquals(Constants.ZERO, clockPanel.addTimerLabel());
		
	}
	
	@Test
	public void showTimeTest(){
		
		GamePanelView gamePanelView = mock(GamePanelView.class);
		ClockPanel clockPanel= new ClockPanel(gamePanelView);
		JLabel lable = new JLabel();
		int milliSecCounter = Constants.ZERO;
		int secCounter      = Constants.ZERO;
		int minCounter      = Constants.ZERO;
		int hrCounter       = Constants.ZERO;
		clockPanel.setLabel(lable);
		clockPanel.setMilliSecCounter(milliSecCounter);
		clockPanel.setSecCounter(secCounter);
		clockPanel.setMinCounter(minCounter);
		clockPanel.setHrCounter(hrCounter);
		Assert.assertEquals(Constants.ZERO, clockPanel.showTime());
		
	}
}
