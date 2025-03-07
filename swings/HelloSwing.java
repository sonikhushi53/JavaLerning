package swings;

import javax.swing.*;
import java.awt.*;

public class HelloSwing {
    public static void main(String[] args) {
        // Create a new frame (window)
        JFrame frame = new JFrame("Hello Swing");

        // Create a label
        JLabel label = new JLabel("Hello, Swing!", SwingConstants.CENTER);

        
          // Change text color and font size
        //   label.setBounds(10,10,5,5);
            label.setFont(new Font("Arial", Font.BOLD, 24)); // Set font
            label.setForeground(Color.white); // Set text color to red

            /*
             * JFrame has only one contentPane
             * But, we can use multiple JPanels inside the contentPane to organize UI elements. 
             */
            frame.getContentPane().setBackground(Color.black);
        
        // Set frame properties
        // frame.set
        frame.add(label);
        frame.setSize(700, 700); // Set width and height
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true); // Make the frame visible
    }
}

