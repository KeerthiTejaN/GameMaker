package dragtree;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import models.Sprites;

public class TransfrableObject implements Transferable{

	public TransfrableObject(Sprites draggableSprite) {
		super();
		this.draggableSprite = draggableSprite;
	}

	private Sprites draggableSprite;
	DataFlavor[] SUPPORTED_FLAVORS = new DataFlavor[1];
	DataFlavor SPRITE_FLAVOR = new DataFlavor(Sprites.class, "application/x-java-serialized-object; class=<representation class>");
	
	public boolean isDataFlavorSupported(DataFlavor flavor) {
		// TODO Auto-generated method stub
		return true;
	}
	
	public DataFlavor[] getTransferDataFlavors() {
		// TODO Auto-generated method stub
		return SUPPORTED_FLAVORS;
	}
	
	public Object getTransferData(DataFlavor flavor) throws UnsupportedFlavorException, IOException {
		// TODO Auto-generated method stub
		return draggableSprite;
	}

	public void resetCoordinates(Sprites sprite){
		
	  	this.draggableSprite.setX(sprite.getX());
	  	this.draggableSprite.setY(sprite.getY());
	  	this.draggableSprite.setDx(sprite.getDx());
	  	this.draggableSprite.setDy(sprite.getDy());
	  	this.draggableSprite.setWidth(sprite.getWidth());
	  	this.draggableSprite.setHeight(sprite.getHeight());
	  	this.draggableSprite.setImage(sprite.getImage());
		
	}

}
