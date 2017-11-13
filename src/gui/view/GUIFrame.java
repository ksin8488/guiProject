package gui.view;

import gui.controller.GUIAppController;
import javax.swing.JFrame;

public class GUIFrame extends JFrame
{
	private GUIAppController appController;
	
	public GUIFrame(GUIAppController appController)
	{
		super();		//first line MUST be this the super class constructor when using a subclass
		this.appController = appController;
	}
	
	private void setupFrame()	//private helper method to add info for the frame class
	{
		this.setTitle("ndow title will go here");
		this.setSize(500, 500);
		
		this.setVisible(true);	//you MUST have this as the last line else the program crashes
	}
}
