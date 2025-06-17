import javax.swing.*;
public class Login {
    public static void main(String[] args) {
        // Simple login frame (placeholder)
        JFrame frame = new JFrame("Login");
        JLabel userLabel = new JLabel("Username:");
        JLabel passLabel = new JLabel("Password:");
        JTextField userText = new JTextField();
        JPasswordField passText = new JPasswordField();
        JButton loginBtn = new JButton("Login");
        
        userLabel.setBounds(20, 20, 100, 25);
        passLabel.setBounds(20, 60, 100, 25);
        userText.setBounds(120, 20, 150, 25);
        passText.setBounds(120, 60, 150, 25);
        loginBtn.setBounds(120, 100, 80, 25);
        
        frame.add(userLabel); frame.add(userText);
        frame.add(passLabel); frame.add(passText);
        frame.add(loginBtn);
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}