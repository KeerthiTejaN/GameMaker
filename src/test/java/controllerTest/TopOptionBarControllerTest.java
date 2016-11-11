package controllerTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import game.TopOptionBarView;
import helpers.Constants;
import models.UserOption;
import views.GameMakerView;
import views.GamePanelView;

import static org.mockito.Mockito.*;

public class TopOptionBarControllerTest {

	UserOption userOption;
	
	@Before
	public void setUp() {
		
	}
	
	@Test
	public void spriteMovementTest(){
		
		GameMakerView mockGameMakerView = mock(GameMakerView.class);
		GamePanelView mockGamePanelView = mock(GamePanelView.class);
		TopOptionBarView topOptionBar = new TopOptionBarView(mockGameMakerView, mockGamePanelView);
		Assert.assertEquals(Constants.OK,topOptionBar.attachAction());
	}
}
