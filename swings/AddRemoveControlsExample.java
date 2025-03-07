package swings;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class AddRemoveControlsExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Add & Remove Controls");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // 1️⃣ Main Panel to Hold Dynamic Components
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        
        // 2️⃣ List to Keep Track of Added Labels
        ArrayList<JLabel> labels = new ArrayList<JLabel>();

        // 3️⃣ Buttons Panel
        JPanel buttonsPanel = new JPanel();

        buttonsPanel.setLayout(new FlowLayout());
        //yha humne multiple panel bnaye h jo UI ko better krta h or complex ui me usefull h 

        // 4️⃣ Add Button
        JButton addButton = new JButton("Add Label");
        // addButton.setBounds(100, 20, 78, 30);
        addButton.setLayout(null);

        addButton.setBackground(Color.PINK);
        // addButton.setBounds(40);

        addButton.addActionListener(e -> {
            JLabel label = new JLabel("Label " + (labels.size() + 1));
            labels.add(label);
            panel.add(label);
            panel.revalidate(); // Refresh layout
            panel.repaint(); // Redraw UI
        });

        // 5️⃣ Remove Button
        JButton removeButton = new JButton("Remove Label");
        removeButton.addActionListener(e -> {
            if (!labels.isEmpty()) {
                JLabel lastLabel = labels.remove(labels.size() - 1);
                panel.remove(lastLabel);
                panel.revalidate();
                panel.repaint();
            }
        });

        // Add Buttons to Buttons Panel
        buttonsPanel.add(addButton);
        buttonsPanel.add(removeButton);

        panel.setBackground(Color.LIGHT_GRAY);
        buttonsPanel.setBackground(Color.gray);

        // Add Panels to Frame
        frame.add(panel, BorderLayout.CENTER);
        frame.add(buttonsPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}

