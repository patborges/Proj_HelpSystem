package main;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.GridLayout;

public class Login {

	private static void login() {
	
		//String loginUser = JOptionPane.showInputDialog(null, "Enter Username: ", "Login", JOptionPane.PLAIN_MESSAGE);
		
		JPanel panel = new JPanel(new GridLayout(2, 2, 10, 10));
		
		// Username input
		JTextField usernameField = new JTextField(20);
		panel.add(new JLabel("Username:"));
        panel.add(usernameField);
	    
		// Password input
	    JPasswordField passwordField = new JPasswordField(20);
	    panel.add(new JLabel("Password:"));  // Adding label
	    panel.add(passwordField); 
	    
	    int action = JOptionPane.showConfirmDialog(null, panel, "Login", JOptionPane.OK_CANCEL_OPTION);
	    
	    if (action == JOptionPane.OK_OPTION) {
	    	String password = new String(passwordField.getPassword()); // Get the entered password securely
            //if (authenticateUser(loginUser, password)) {
                JOptionPane.showMessageDialog(null, "Login successful for user: ", "Login", JOptionPane.INFORMATION_MESSAGE);
            //} else {
            //    JOptionPane.showMessageDialog(null, "Invalid username or password.", "Login Error", JOptionPane.ERROR_MESSAGE);
            //}
	    }
	    
	    // Query for login
	    //String query ="select * from login where username ='" + username + "' and password = '"+password+"'";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		login();
	}

}
