package main;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Register {

	private static void register() {
		
		JPanel panel = new JPanel(new GridLayout(2, 2, 10, 10));
		
		//String user = JOptionPane.showInputDialog(null, "Enter Username: ", "Register", JOptionPane.PLAIN_MESSAGE);

		// Username input
		JTextField usernameField = new JTextField(20);
		panel.add(new JLabel("Username:"));
        panel.add(usernameField);
	    
		// Password input
	    JPasswordField passwordField = new JPasswordField(20);
	    panel.add(new JLabel("Password:"));  // Adding label
	    panel.add(passwordField); 
	    
	    int action = JOptionPane.showConfirmDialog(null, panel, "Register", JOptionPane.OK_CANCEL_OPTION);
	    
	    if (action == JOptionPane.OK_OPTION) {
	    	String password = new String(passwordField.getPassword()); // Get the entered password securely
            //if (authenticateUser(loginUser, password)) {
                JOptionPane.showMessageDialog(null, "Register successful for user: ", "Register", JOptionPane.INFORMATION_MESSAGE);
            //} else {
            //    JOptionPane.showMessageDialog(null, "Invalid username or password.", "Register Error", JOptionPane.ERROR_MESSAGE);
            //}
	    }
    
	}
	
	public static void main(String[] args) {
		register();
	}

}
