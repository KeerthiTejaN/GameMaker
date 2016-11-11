package dragtree;


import java.awt.dnd.DnDConstants;
import java.awt.dnd.DragGestureEvent;
import java.awt.dnd.DragGestureListener;
import java.awt.dnd.DragSource;
import java.awt.dnd.DragSourceDragEvent;
import java.awt.dnd.DragSourceDropEvent;
import java.awt.dnd.DragSourceEvent;
import java.awt.dnd.DragSourceListener;

import javax.swing.JComponent;

import models.Sprites;

public abstract class DragSourceComponent extends Sprites implements DragGestureListener, DragSourceListener{

	private DragSource dragSource;
	private TransfrableObject transfrableObject;

	public TransfrableObject getTransfrableObject() {
		return transfrableObject;
	}

	public void setTransfrableObject(TransfrableObject transfrableObject) {
		
		this.transfrableObject 		= 	new TransfrableObject(null);
		this.transfrableObject  	=	transfrableObject;
		
	}

	public DragSourceComponent(JComponent parentPanel){
		super();
		this.dragSource = new DragSource();
	    this.dragSource.createDefaultDragGestureRecognizer(parentPanel, DnDConstants.ACTION_COPY_OR_MOVE, this);
	}

	public void dragGestureRecognized(DragGestureEvent dge) {

		dragSource.startDrag(dge, DragSource.DefaultMoveDrop, transfrableObject, this);
			
	}
	
	public void dragEnter(DragSourceDragEvent dsde) {
		// TODO No functionality required here , might be used in future
	}

	public void dragOver(DragSourceDragEvent dsde) {
		// TODO No functionality required here , might be used in future
		
	}

	public void dropActionChanged(DragSourceDragEvent dsde) {
		// TODO No functionality required here , might be used in future

	}

	public void dragExit(DragSourceEvent dse) {
		// TODO No functionality required here , might be used in future

	}

	public void dragDropEnd(DragSourceDropEvent dsde) {
		// TODO No functionality required here , might be used in future
	}
	

}
