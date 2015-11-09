package gui.view;

import gui.view.GUIFrame;
import javax.swing.JPanel;
import gui.controller.GuiAppController;

public class GUIPanel extends JPanel
{
	private GuiAppController baseController;
	
	public GUIPanel (GuiAppController baseController)
	{
		this.baseController = baseController;
	}
	
}
