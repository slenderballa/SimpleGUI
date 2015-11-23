package gui.view;

import gui.view.GUIFrame;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.SpringLayout; //For Layout
import gui.controller.GuiAppController;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUIPanel extends JPanel
{
	private GuiAppController baseController;
	private JButton firstButton;
	private JTextField firstTextField;
	private SpringLayout baseLayout;
	
	public GUIPanel (GuiAppController baseController)
	{
		setBackground(Color.CYAN);
		this.baseController = baseController;

		baseLayout = new SpringLayout();
		firstButton = new JButton("Please do not click the button");
		
		firstTextField = new JTextField("Words can be typed here");
		
		
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	/**
	 * Helper method to load alGUI components into the panel
	 */
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(firstButton);
		this.add(firstTextField);
	
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, firstButton, 100, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, firstButton, -59, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, firstTextField, 35, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, firstTextField, 139, SpringLayout.WEST, this);
	}
	
	private void setupListeners()
	{
		firstButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				firstTextField.setText("Wow this is the most amazing click event ever!");
			}
		});
	}
	
	
}


