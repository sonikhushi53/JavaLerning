package swings;

import javax.swing.*;

public class DialogBoxExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Show Dialog Box
        JOptionPane.showMessageDialog(frame, "Hello! This is a simple dialog box.", "Message", JOptionPane.INFORMATION_MESSAGE);
    }
}

