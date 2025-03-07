package swings;

import javax.swing.*;
import java.awt.*;

public class TwoContainersExample {
    public static void main(String[] args) {
        // 1️⃣ Create a JFrame (Main Window)
        JFrame frame = new JFrame("Two Containers Example");
        frame.setSize(500, 400);
        frame.setLayout(null); // Disable default layout for manual positioning
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 2️⃣ Create First Container (Panel 1 - Red)
        JPanel panel1 = new JPanel();
        panel1.setBounds(50, 50, 180, 200); // x=50, y=50, width=180, height=200
        panel1.setBackground(Color.RED); // Set background color to RED

        // 3️⃣ Create Second Container (Panel 2 - Blue)
        JPanel panel2 = new JPanel();
        panel2.setBounds(250, 50, 180, 200); // x=250, y=50, width=180, height=200
        panel2.setBackground(Color.BLUE); // Set background color to BLUE

        // 4️⃣ Add Panels to Frame
        frame.add(panel1);
        frame.add(panel2);

        // 5️⃣ Make the Window Visible
        frame.setVisible(true);
    }
}

