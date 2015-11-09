package gui.view;

import javax.swing.JFrame;
import gui.controller.GuiAppController;

public class GUIFrame extends JFrame
{
	private GuiAppController baseController;
	private GUIPanel basePanel;
	
	public GUIFrame(GuiAppController baseController)
	{
		this.baseController = baseController;
		basePanel = new GUIPanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);; //Must be first line of set up Frame!
		this.setSize(800, 1200);// Find aod size for the app.
		JFrame frame = new JFrame("Garret is Amazing");
		this.setTitle("Garrett is Amazing");
		
		this.setVisible(true); //Must be last line of set upFrame!
	}
	
	public GuiAppController getBaseController()
	{
		return baseController;
	}
	
	
	
	
	
}
