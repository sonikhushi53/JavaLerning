package swings;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.Border;

public class SimpleForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("User Form");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(5, 2, 10, 10)); // 5 Rows, 2 Columns, Padding

        // Name Field
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField(15);

        // Gender (Radio Buttons)
        JLabel genderLabel = new JLabel("Gender:");
        JRadioButton maleRadio = new JRadioButton("Male");
        JRadioButton femaleRadio = new JRadioButton("Female");

        // Grouping Gender Buttons (Only one selection)
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadio);
        genderGroup.add(femaleRadio);

        JPanel genderPanel = new JPanel(); // Panel for Gender Buttons
        genderPanel.add(maleRadio);
        genderPanel.add(femaleRadio);

        // Country Selection (List)
        JLabel countryLabel = new JLabel("Select Country:");
        String[] countries = {"India", "USA", "UK", "Canada", "Australia"};
        JComboBox<String> countryList = new JComboBox<>(countries); // Dropdown instead of list

        // Terms & Conditions Checkbox
        JCheckBox termsCheckBox = new JCheckBox("I agree to the terms & conditions");

        // Submit Button
        JButton submitButton = new JButton("Submit");

        // submitButton.setBorder(new Border(20));
        // Submit Button Click Event
        submitButton.addActionListener(e -> {
            String name = nameField.getText();
            String gender = maleRadio.isSelected() ? "Male" : (femaleRadio.isSelected() ? "Female" : "");
            String country = (String) countryList.getSelectedItem();
            boolean agreed = termsCheckBox.isSelected();

            // Validation
            if (name.isEmpty() || gender.isEmpty() || !agreed) {
                JOptionPane.showMessageDialog(frame, "Please fill all details and agree to the terms!", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                // Show Details in Dialog
                int option = JOptionPane.showConfirmDialog(frame,
                        "Name: " + name + "\nGender: " + gender + "\nCountry: " + country,
                        "Form Details",
                        JOptionPane.OK_CANCEL_OPTION);

                // Reset Form if OK is clicked
                if (option == JOptionPane.OK_OPTION) {
                    nameField.setText("");
                    genderGroup.clearSelection();
                    countryList.setSelectedIndex(0);
                    termsCheckBox.setSelected(false);
                }
            }
        });

        // Add Components to Frame (Each in a Separate Row)
        frame.add(nameLabel);
        frame.add(nameField);
        // frame.add(new JLabel()); // Empty space for alignment

        frame.add(genderLabel);
        frame.add(genderPanel);
        // frame.add(new JLabel()); // Empty space for alignment

        frame.add(countryLabel);
        frame.add(countryList);
        frame.add(new JLabel()); // Empty space for alignment
        frame.add(termsCheckBox);
        frame.add(new JLabel()); // Empty space for alignment
        frame.add(submitButton);

        frame.setVisible(true);
    }
}
