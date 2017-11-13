package gui.controller;

import gui.view.GUIFrame;

public class GUIAppController
{

	private GUIFrame appFrame;
	
	public GUIAppController()
	{
		appFrame = new GUIFrame(this);	//link to itself to access itself with 'this'
	}


	public void start()
	{
		
	}
	
}
