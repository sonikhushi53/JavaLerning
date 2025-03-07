package swings;

import javax.swing.*;

public class InputDialogExample {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null, "Enter your name:");
        // It give ok and cancel button 
        // If click on cancel it return null
        JOptionPane.showMessageDialog(null, "Hello, " + name + "!");
    }
}

