package main;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class login {

	private static void login() {
	
		String loginUser = JOptionPane.showInputDialog(null, "Enter Username: ", "Login", JOptionPane.PLAIN_MESSAGE);
		
	    JPasswordField passwordField2 = new JPasswordField(20);
	    JPanel panel2 = new JPanel();
	    panel2.add(new JLabel("Enter Password:"));  // Adding label
	    panel2.add(passwordField2); 
	    
	    int action2 = JOptionPane.showConfirmDialog(null, panel2, "Login", JOptionPane.OK_CANCEL_OPTION);
	    
	    if (action2 == JOptionPane.OK_OPTION) {
	    	String password = new String(passwordField2.getPassword()); // Get the entered password securely
			/*
			 * if (registeredUsers.containsKey(loginUser) &&
			 * registeredUsers.get(loginUser).equals(password)) {
			 * JOptionPane.showMessageDialog(null, "Login successful for user: " +
			 * loginUser, "Login", JOptionPane.PLAIN_MESSAGE); } else {
			 * JOptionPane.showMessageDialog(null, "Invalid username or password", "Login",
			 * JOptionPane.ERROR_MESSAGE); }
			 */
	    	JOptionPane.showMessageDialog(null, "Login attempt for user: " + loginUser, "Login", JOptionPane.PLAIN_MESSAGE); 
	    }
		//String loginPassword = JOptionPane.showInputDialog(null, "Enter Password: ", "Login", JOptionPane.PLAIN_MESSAGE);
		
		//JOptionPane.showMessageDialog(null, "Login attempt for user: " + loginUser);
	    
	    
	    // Query for login
	    //String query ="select * from login where username ='" + username + "' and password = '"+password+"'";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		login();
	}

}
