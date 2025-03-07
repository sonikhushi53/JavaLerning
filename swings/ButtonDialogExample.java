package swings;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonDialogExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Dialog Box Example");
        frame.setSize(500, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JButton button = new JButton("Click Me");

        // Button Click Event
        button.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "Hello! You clicked the button.", "Message", JOptionPane.INFORMATION_MESSAGE);
        });

        frame.add(button);
        frame.setVisible(true);

        System.out.println(10/3);
    }
}

