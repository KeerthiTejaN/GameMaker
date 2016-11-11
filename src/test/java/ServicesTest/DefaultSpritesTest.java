package ServicesTest;

import org.junit.Assert;

import org.junit.Before;
import org.junit.Test;

import dragtree.DragSourceComponent;
import helpers.Constants;
import models.UserOption;
import services.DefaultSprites;
import views.ComponentPanel;
import static org.mockito.Mockito.*;

import java.awt.dnd.DragSource;

import javax.swing.JPanel;

public class DefaultSpritesTest {
	
	UserOption userOption;
	JPanel panel;
	
	@Before
	public void setUp() {
		
	
		userOption = new UserOption();
		panel = new JPanel();
		
	}
	
	@Test
	public void repaintCompomentTest(){
		DragSourceComponent dragSourceComponent = mock(DragSourceComponent.class);
		ComponentPanel componentPanel = new ComponentPanel();
		DefaultSprites defaultSprites = new DefaultSprites(panel, userOption);	
		defaultSprites.setParentPanel(panel);
		Assert.assertEquals(Constants.ZERO, defaultSprites.repaintComponent(componentPanel, dragSourceComponent));
	}
	

	
	
}
