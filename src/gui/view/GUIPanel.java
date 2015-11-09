package gui.view;

import gui.view.GUIFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPanel;
import gui.controller.GuiAppController;

public class GUIPanel extends JPanel
{
	private GuiAppController baseController;
	private JButton firstButton;
	private JTextField firstTextField;
	
	public GUIPanel (GuiAppController baseController)
	{
		this.baseController = baseController;
		
		firstButton = new JButton("Please do not click the button");
		firstTextField = new JTextField("Words can be typed here");
		
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		
	
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
	
	
}


