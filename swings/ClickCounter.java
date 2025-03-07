package swings;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ClickCounter {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Click Counter");
        // frame.setSize(550, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // JLabel label = new JLabel("Button Clicked: 0 times");
        JButton button = new JButton("Click Me");

        JPanel panel  = new JPanel();
        // panel.setLayout(null);
        // panel.setBounds(100, 200, 500, 300);

        // Counter variable (use array to modify inside lambda)
        // bcoz Lambda ke andar local variable modify nahi ho sakta
        // Array ka reference same rehta hai, isliye modify ho sakta hai
        // 	Instance variables bhi modify ho sakte hain, lambda restrictions nahi
        // int[] count = {0};

        // // Button Click Event
        // button.addActionListener(e -> {
        //     count[0]++; // Increment count
        //     label.setText("Button Clicked: " + count[0] + " times");
        // });

        button.addActionListener(e -> {
            // System.out.println("Hello, button clicked.");
            JLabel label2 = new JLabel("Button Clicked");
            panel.add(label2);
            panel.revalidate();
            panel.repaint();
        });
        // frame.add(label);
        frame.add(panel);
        frame.add(button);
        frame.setVisible(true);
    }
}

