package lab9;
// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

// class CalculatorGUI extends JFrame implements ActionListener {
//     // Components
//     private JLabel firstNumberLabel, secondNumberLabel, resultLabel;
//     private JTextField firstNumberField, secondNumberField, resultField;
//     private JButton addButton, subButton, multiplyButton, resetButton;

//     public CalculatorGUI() {
//         // Frame setup
//         setTitle("Simple Calculator");
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setSize(400, 300);
//         setLocationRelativeTo(null);
//         setLayout(new GridLayout(4, 2));

//         // Components initialization
//         firstNumberLabel = new JLabel("Enter the First Number:");
//         firstNumberField = new JTextField(10);

//         secondNumberLabel = new JLabel("Enter the Second Number:");
//         secondNumberField = new JTextField(10);

//         resultLabel = new JLabel("Result:");
//         resultField = new JTextField(10);
//         resultField.setEditable(false);

//         addButton = new JButton("Add");
//         subButton = new JButton("Subtract");
//         multiplyButton = new JButton("Multiply");
//         resetButton = new JButton("Reset");

//         // Adding action listeners to buttons
//         addButton.addActionListener(this);
//         subButton.addActionListener(this);
//         multiplyButton.addActionListener(this);
//         resetButton.addActionListener(this);

//         // Adding components to the frame
//         add(firstNumberLabel);
//         add(firstNumberField);
//         add(secondNumberLabel);
//         add(secondNumberField);
//         add(resultLabel);
//         add(resultField);
//         add(addButton);
//         add(subButton);
//         add(multiplyButton);
//         add(resetButton);

//         // Frame visibility
//         setVisible(true);
//     }

//     @Override
//     public void actionPerformed(ActionEvent e) {
//         double num1, num2, result;
//         try {
//             num1 = Double.parseDouble(firstNumberField.getText());
//             num2 = Double.parseDouble(secondNumberField.getText());
//         } catch (NumberFormatException ex) {
//             JOptionPane.showMessageDialog(this, "Invalid input. Please enter valid numbers.");
//             return;
//         }

//         if (e.getSource() == addButton) {
//             result = num1 + num2;
//             resultField.setText(String.valueOf(result));
//         } else if (e.getSource() == subButton) {
//             result = num1 - num2;
//             resultField.setText(String.valueOf(result));
//         } else if (e.getSource() == multiplyButton) {
//             result = num1 * num2;
//             resultField.setText(String.valueOf(result));
//         } else if (e.getSource() == resetButton) {
//             firstNumberField.setText("");
//             secondNumberField.setText("");
//             resultField.setText("");
//         }
//     }

//     public static void main(String[] args) {
//         SwingUtilities.invokeLater(CalculatorGUI::new);
//     }
// }


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class box extends JFrame implements ActionListener {
    JTextField firstNumberField, secondNumberField, resultField;

    public box() {
        setTitle("Simple Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLayout(new GridLayout(5, 2, 10, 10));

        // Labels
        JLabel firstNumberLabel = new JLabel("Enter the First Number:");
        JLabel secondNumberLabel = new JLabel("Enter the Second Number:");
        JLabel resultLabel = new JLabel("Result:");

        // Text Fields
        firstNumberField = new JTextField();
        secondNumberField = new JTextField();
        resultField = new JTextField();
        resultField.setEditable(false); // Make result field read-only

        // Buttons
        JButton addButton = new JButton("Add");
        JButton subButton = new JButton("Subtract");
        JButton multiplyButton = new JButton("Multiply");
        JButton resetButton = new JButton("Reset");

        // Adding action listeners to buttons
        addButton.addActionListener(this);
        subButton.addActionListener(this);
        multiplyButton.addActionListener(this);
        resetButton.addActionListener(this);

        // Adding components to the frame
        add(firstNumberLabel);
        add(firstNumberField);
        add(secondNumberLabel);
        add(secondNumberField);
        add(resultLabel);
        add(resultField);
        add(addButton);
        add(subButton);
        add(multiplyButton);
        add(resetButton);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double num1, num2, result;
        try {
            num1 = Double.parseDouble(firstNumberField.getText());
            num2 = Double.parseDouble(secondNumberField.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (e.getActionCommand().equals("Add")) {
            result = num1 + num2;
            resultField.setText(String.valueOf(result));
        } else if (e.getActionCommand().equals("Subtract")) {
            result = num1 - num2;
            resultField.setText(String.valueOf(result));
        } else if (e.getActionCommand().equals("Multiply")) {
            result = num1 * num2;
            resultField.setText(String.valueOf(result));
        } else if (e.getActionCommand().equals("Reset")) {
            firstNumberField.setText("");
            secondNumberField.setText("");
            resultField.setText("");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new box();
        });
    }
}