package ServicesTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import helpers.Constants;
import models.Ball;
import models.UserOption;

import static org.mockito.Mockito.*;

public class UserOptionTest {

	UserOption userOption;
	
	@Before
	public void setUp() {
		
		userOption = new UserOption();
		
	}
	
	@Test
	public void spriteMovementTest(){
		
		Ball mockBall = mock(Ball.class);
		Assert.assertEquals(Constants.ZERO,mockBall.move());
	}
}
