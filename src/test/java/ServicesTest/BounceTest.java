package ServicesTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import helpers.Constants;
import models.Ball;
import models.Brick;
import models.Paddle;
import services.Bounce;

import static org.mockito.Mockito.*;


public class BounceTest {
	Bounce bounce;
	
	@Before
	public void setUp() {
		bounce = new Bounce();
		}
	
	@Test
	public void bounceTest(){
		Ball mockBall = mock(Ball.class);
		bounce.setSprite(mockBall);
		Assert.assertEquals(Constants.ZERO, bounce.actionAfterCollision());
	
}
	
	@Test
	public void bounceTest1(){
		Brick mockBall = mock(Brick.class);
		bounce.setSprite(mockBall);
		Assert.assertEquals(Constants.ZERO, bounce.actionAfterCollision());
	
}
	@Test
	public void bounceTest2(){
		Paddle mockBall = mock(Paddle.class);
		bounce.setSprite(mockBall);
		Assert.assertEquals(Constants.ZERO, bounce.actionAfterCollision());
	
}
	
}