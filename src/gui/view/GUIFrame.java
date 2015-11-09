package gui.view;

import javax.swing.JFrame;
import gui.controller.GuiAppController;

public class GUIFrame extends JFrame
{
	private GuiAppController baseController;
	
	public GUIFrame(GuiAppController baseController)
	{
		this.baseController = baseController;
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setSize(400, 400);
		this.setVisible(true);
	}
	
}
