package gui.view;

import javax.swing.JPanel;
import gui.controller.GUIAppController;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SpringLayout;

public class GUIPanel extends JPanel
{
	private GUIAppController appController;
	private JButton firstButton;
	private SpringLayout appLayout;
	
	public GUIPanel(GUIAppController appController)
	{
		super();
		this.appController = appController;
		firstButton = new JButton("Click on the button");
		appLayout = new SpringLayout();

		
		setupPanel();
	}

	/**
	 * Used to add all components to the screen and install a layout manager.
	 * Also set color :D
	 */
	private void setupPanel()
	{
		this.setBackground(Color.YELLOW);
		this.setLayout(appLayout);		//allows you to decide how the app is laid out rather than default
		this.add(firstButton);
	}
	
	/**
	 * Used to hold the constraint positioning for SpringLayout.
	 * AKA a giant dumping ground for all the xxxx.putConstraint(....) lines.
	 */
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.WEST, firstButton, 140, SpringLayout.WEST, this);	//spingLayout lets the buttons shift in size
		appLayout.putConstraint(SpringLayout.SOUTH, firstButton, -131, SpringLayout.SOUTH, this);
	}
	
	private void setupListeners()
	{
		
	}
}
