package swings.createFrame;

// By extending Frame class (inheritance)
/*
 * In this example, we will be inheriting JFrame class to create JFrame window and hence it won’t be required to create an instance of JFrame class explicitly.
 * 
 * 🔹 Best for: Large projects, reusable GUI components, more   scalability .
❌ Downside: Slightly more code than create direct obj in main like 3rd metho 
 */
import javax.swing.*;

// inheriting JFrame
public class SecondWay extends JFrame
{
	JFrame frame;
	SecondWay()
	{
		setTitle("this is also a title");

		// create button
		JButton button = new JButton("click");

		button.setBounds(165, 135, 115, 55);
		
		// adding button on frame
		add(button);

		// setting close operation
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setSize(400, 500);
		setLayout(null);
		setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new SecondWay();
	}
}

