package gui.controller;

import gui.view.GUIFrame;

/**
 * AppController for the simple GUI application
 * @author gswe4645
 *
 */
public class GuiAppController
{
	/**
	 * Reference to the GUIFrame object for internal use.
	 */
	private GUIFrame baseFrame;
	/**
	 * Creates a GUIAppController and initializes the GUIFrame.
	 */
	public GUIAppController()
	{
		baseFrame = new GUIFrame(this);
	}
	
	public void start()
	{}
}
