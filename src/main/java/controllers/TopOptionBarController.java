package controllers;

import java.io.File;

import java.io.IOException;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import helpers.Constants;

import models.Sprites;
import services.Collidable;
import services.Controllable;
import views.GamePanelView;

public class TopOptionBarController {

	
	
	public int saveGameMaker(ArrayList<Sprites> sprites){
		
		try {
		ObjectMapper mapper = new ObjectMapper();
		Sprites[] jsonTobeStored = new Sprites[sprites.size()];
		int index = 0;
		for(Sprites obj : sprites){
			
			Sprites jsonSprite = (Sprites) Class.forName(obj.getClass().getName()).newInstance();
			jsonSprite.setDx(obj.getDx());
			jsonSprite.setDy(obj.getDy());
			jsonSprite.setHeight(obj.getHeight());
			jsonSprite.setWidth(obj.getHeight());
			jsonSprite.setX(obj.getX());
			jsonSprite.setY(obj.getY());
			jsonSprite.setSpriteSubType(obj.getSpriteSubType());
			jsonSprite.setSpriteType(obj.getSpriteType());
		    jsonSprite.setImagePath(obj.getImagePath());
		    jsonSprite.setUserOption(obj.getUserOption());
		    jsonSprite.setSpecialBrick(obj.isSpecialBrick());
		    jsonSprite.setDestroyed(obj.isDestroyed());
		    
			jsonTobeStored[index++] = jsonSprite;
		}
		
			mapper.writeValue(new File(Constants.SAVED_GAME_PATH),jsonTobeStored );
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return Constants.OK;
	}

	public ArrayList<Sprites> loadGameMaker(ArrayList<Sprites> sprites,GamePanelView gamePanelView){
		
		sprites.removeAll(sprites);
		ObjectMapper mapper = new ObjectMapper();
		ArrayList<Sprites> restoredSprites = new ArrayList<Sprites>();
		Sprites[] storedJson;
		try {
			storedJson = mapper.readValue(new File(Constants.SAVED_GAME_PATH), Sprites[].class);

			for(Sprites obj : storedJson){
				Object comp = Class.forName(obj.getClass().getName()).newInstance();
				
				((Sprites) comp).resetCoordinate(obj);
				((Sprites) comp).setImage(new ImageIcon(comp.getClass().getResource(((Sprites) comp).getImagePath())).getImage());
				
				((Sprites)comp).setParentPanel(gamePanelView);
				((Sprites)comp).setControlHandler((Controllable) Class.forName("services."+((Sprites)comp).getUserOption().getControl()).newInstance());
				((Sprites)comp).setCollideAction((Collidable) Class.forName("services."+((Sprites)comp).getUserOption().getCollideAction()).newInstance());
				restoredSprites.add((Sprites) comp);

			}
		
		} catch (JsonParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (JsonMappingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return restoredSprites;
		
	}
	
}
