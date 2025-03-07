package swings.createFrame;

// By creating the object of Frame class (association)
// Java program to create frames 
// using association
/*
 * 🔹 Best for: Separating logic, keeping main clean.
❌ Downside: Less flexibility than extending JFrame
 */

import javax.swing.*;
public class FirstWay
{
	JFrame frame;

	FirstWay()
	{
		// creating instance of JFrame with name "first way"
		frame=new JFrame("first way");
		
		// creates instance of JButton
		JButton button = new JButton("let's see");

		button.setBounds(200, 150, 90, 50);
		
		// setting close operation
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// adds button in JFrame
		frame.add(button);

		// sets 500 width and 600 height
		frame.setSize(500, 600);
		
		// uses no layout managers
		frame.setLayout(null);
		
		// makes the frame visible
		frame.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new FirstWay();
	}
}

