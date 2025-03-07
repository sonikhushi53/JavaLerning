package swings;

import javax.swing.*;

public class ConfirmDialogExample {
    public static void main(String[] args) {
        int choice = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Confirm", JOptionPane.YES_NO_OPTION);
// Return 0 for yes and 1 for no
        if (choice == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "You chose YES.");
        } else {
            JOptionPane.showMessageDialog(null, "You chose NO." + choice);
        }
    }
}

