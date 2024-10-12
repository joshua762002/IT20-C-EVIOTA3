package topic_3_stack_calculator;
/**
 *
 * @author joshua
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

public class StackCalculatorGUI extends JFrame implements ActionListener {
    private Stack<Integer> numberStack = new Stack<>(); // Stack to hold numbers
    private JTextArea displayArea; // Area to display stack and results

    public StackCalculatorGUI() {
        // Set up the JFrame
        setTitle("Stack Calculator");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));
        setResizable(false);
        
        // Create a header label
        JLabel headerLabel = new JLabel("Stack Calculator", SwingConstants.CENTER);
        headerLabel.setFont(new Font("Arial", Font.BOLD, 24));
        headerLabel.setForeground(new Color(70, 130, 180)); // Steel blue color
        add(headerLabel, BorderLayout.NORTH);

        // Display area for the stack
        displayArea = new JTextArea(5, 20);
        displayArea.setEditable(false);
        displayArea.setFont(new Font("Courier New", Font.PLAIN, 16));
        displayArea.setMargin(new Insets(10, 10, 10, 10)); 
        displayArea.setBackground(new Color(240, 248, 255)); 
        displayArea.setForeground(Color.BLACK); 
        JScrollPane scrollPane = new JScrollPane(displayArea);
        add(scrollPane, BorderLayout.CENTER);

        // Panel for buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 4, 10, 10)); // Adjusted layout to fit more buttons
        buttonPanel.setBackground(new Color(255, 255, 255)); 

        // Number buttons (0-9)
        for (int i = 1; i <= 9; i++) {
            createButton(buttonPanel, String.valueOf(i), new Color(173, 216, 230)); // Light blue
        }

        // Add zero button
        createButton(buttonPanel, "0", new Color(173, 216, 230)); 

        // Operation buttons
        String[] operations = {"+", "-", "*", "/"};
        Color[] opColors = {
            new Color(135, 206, 250), // Light sky blue for addition
            new Color(255, 99, 71),   // Tomato red for subtraction
            new Color(144, 238, 144), // Light green for multiplication
            new Color(255, 215, 0)    // Gold for division
        };

        for (int i = 0; i < operations.length; i++) {
            createButton(buttonPanel, operations[i], opColors[i]);
        }

        // Clear and Exit buttons
        createButton(buttonPanel, "Clear", new Color(255, 165, 0)); // Orange for Clear
        createButton(buttonPanel, "Exit", new Color(255, 0, 0)); // Red for Exit

        add(buttonPanel, BorderLayout.SOUTH);
    }

    private void createButton(JPanel panel, String text, Color bgColor) {
        JButton button = new JButton(text);
        button.setFont(new Font("Arial", Font.BOLD, 18)); 
        button.setBackground(bgColor); 
        button.setForeground(Color.BLACK); 
        button.addActionListener(this);
        button.setFocusPainted(false); 
        button.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1)); 
        panel.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if ("0123456789".contains(command)) {
            int number = Integer.parseInt(command);
            numberStack.push(number);
            displayCurrentStack();
        } else if (command.equals("Clear")) {
            numberStack.clear();
            displayArea.setText("Stack cleared.\n");
        } else if (command.equals("Exit")) {
            System.exit(0);
        } else {
            switch (command) {
                case "+":
                    performAddition();
                    break;
                case "-":
                    performSubtraction();
                    break;
                case "*":
                    performMultiplication();
                    break;
                case "/":
                    performDivision();
                    break;
            }
        }
    }

    private void performAddition() {
        if (numberStack.size() < 2) {
            displayArea.append("Error: Need at least two numbers to add.\n");
            return;
        }
        int secondNumber = numberStack.pop();
        int firstNumber = numberStack.pop();
        int result = firstNumber + secondNumber;
        numberStack.push(result);
        displayArea.append("Performed addition: " + firstNumber + " + " + secondNumber + " = " + result + "\n");
        displayCurrentStack();
    }

    private void performSubtraction() {
        if (numberStack.size() < 2) {
            displayArea.append("Error: Need at least two numbers to subtract.\n");
            return;
        }
        int secondNumber = numberStack.pop();
        int firstNumber = numberStack.pop();
        int result = firstNumber - secondNumber;
        numberStack.push(result);
        displayArea.append("Performed subtraction: " + firstNumber + " - " + secondNumber + " = " + result + "\n");
        displayCurrentStack();
    }

    private void performMultiplication() {
        if (numberStack.size() < 2) {
            displayArea.append("Error: Need at least two numbers to multiply.\n");
            return;
        }
        int secondNumber = numberStack.pop();
        int firstNumber = numberStack.pop();
        int result = firstNumber * secondNumber;
        numberStack.push(result);
        displayArea.append("Performed multiplication: " + firstNumber + " * " + secondNumber + " = " + result + "\n");
        displayCurrentStack();
    }

    private void performDivision() {
        if (numberStack.size() < 2) {
            displayArea.append("Error: Need at least two numbers to divide.\n");
            return;
        }
        int secondNumber = numberStack.pop();
        int firstNumber = numberStack.pop();
        if (secondNumber == 0) {
            displayArea.append("Error: Cannot divide by zero.\n");
            numberStack.push(firstNumber); 
            numberStack.push(secondNumber);
            return;
        }
        int result = firstNumber / secondNumber;
        numberStack.push(result);
        displayArea.append("Performed division: " + firstNumber + " / " + secondNumber + " = " + result + "\n");
        displayCurrentStack();
    }

    private void displayCurrentStack() {
        displayArea.setText("Current Stack: " + numberStack + "\n"); 
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            StackCalculatorGUI calculator = new StackCalculatorGUI();
            calculator.setVisible(true);
        });
    }
}
