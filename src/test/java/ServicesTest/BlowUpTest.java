package ServicesTest;

import static org.mockito.Mockito.mock;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import helpers.Constants;
import models.Ball;
import models.Brick;
import models.Paddle;
import services.BlowUp;

public class BlowUpTest {
	
	BlowUp blowUp;
	
	@Before
	public void setUp(){
		
		blowUp = new BlowUp();
	}
	
	@Test
	public void actionAfterCollisionTest(){
		
		Brick mockBrick = mock(Brick.class);
		blowUp.setSprite(mockBrick);
		Assert.assertEquals(Constants.ONE, blowUp.actionAfterCollision());
		
	}
	
	@Test
	public void ballActionAfterCollisionTest(){
		
		Ball mockBall = mock(Ball.class);
		blowUp.setSprite(mockBall);
		Assert.assertEquals(Constants.ONE, blowUp.actionAfterCollision());
		
	}
	
	@Test
	public void paddleActionAfterCollisionTest(){
		
		Paddle mockPaddle = mock(Paddle.class);
		blowUp.setSprite(mockPaddle);
		Assert.assertEquals(Constants.ONE, blowUp.actionAfterCollision());
		
	}
	

}
