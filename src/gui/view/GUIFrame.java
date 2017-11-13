package gui.view;

import gui.controller.GUIAppController;
import javax.swing.JFrame;

public class GUIFrame extends JFrame
{
	private GUIAppController appController;
	private GUIPanel appPanel;
	
	public GUIFrame(GUIAppController appController)
	{
		super();		//first line MUST be this the super class constructor when using a subclass
		this.appController = appController;
		this.appPanel = new GUIPanel(appController);
		
		setupFrame();
	}
	
	private void setupFrame()	//private helper method to add info for the frame class
	{
		this.setContentPane(appPanel);	//not required
		this.setTitle("wndow title will go here");
		this.setSize(500, 500);
		this.setResizable(false);	//makes it so you can't resize a window popup
		this.setVisible(true);	//you MUST have this as the last line else the program crashes
	}
}
