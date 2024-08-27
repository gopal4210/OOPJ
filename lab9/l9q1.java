package lab9;

import javax.swing.*;
import java.awt.*;

class RegistrationForm extends JFrame {
    private JLabel nameLabel, emailLabel, addressLabel;
    private JTextField nameField, emailField;
    private JTextArea addressArea;
    private JCheckBox agreeCheckBox;
    private JRadioButton maleRadioButton, femaleRadioButton;
    private ButtonGroup genderGroup;
    private JButton submitButton;
    private ImageIcon imageIcon;

    public RegistrationForm() {
        setTitle("Registration Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 500);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        nameLabel = new JLabel("Name:");
        nameField = new JTextField(20);

        emailLabel = new JLabel("Email:");
        emailField = new JTextField(20);

        addressLabel = new JLabel("Address:");
        addressArea = new JTextArea(5, 20);
        addressArea.setLineWrap(true);
        JScrollPane addressScrollPane = new JScrollPane(addressArea);

        agreeCheckBox = new JCheckBox("I agree to the terms and conditions");

        maleRadioButton = new JRadioButton("Male");
        femaleRadioButton = new JRadioButton("Female");
        genderGroup = new ButtonGroup();
        genderGroup.add(maleRadioButton);
        genderGroup.add(femaleRadioButton);

        submitButton = new JButton("Submit");

        // Adding components to the frame
        add(nameLabel);
        add(nameField);
        add(emailLabel);
        add(emailField);
        add(addressLabel);
        add(addressScrollPane);
        add(agreeCheckBox);
        add(maleRadioButton);
        add(femaleRadioButton);
        add(submitButton);

        // Load image
        imageIcon = new ImageIcon("your_image_path_here.jpg"); // Change this to the path of your image
        JLabel imageLabel = new JLabel(imageIcon);
        add(imageLabel);

        // Frame visibility
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(RegistrationForm::new);
    }
}