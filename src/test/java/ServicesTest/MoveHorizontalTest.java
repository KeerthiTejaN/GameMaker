package ServicesTest;

import static org.mockito.Mockito.mock;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import helpers.Constants;
import models.Ball;
import services.Bounce;
import services.MoveHorizontal;

public class MoveHorizontalTest {

	MoveHorizontal moveHorizontal;
		
		@Before
		public void setUp() {
			moveHorizontal = new MoveHorizontal();
			}
		@Test
		public void bounceTest(){
//			Ball mockBall = mock(Ball.class);
//			MoveHorizontal.setSprite(mockBall);
//			Assert.assertEquals(Constants.ZERO, MoveHorizontal.moveTheSprite());
//		
	}
}
