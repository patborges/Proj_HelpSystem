package main;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class register {

	private static void register() {
		
		String user = JOptionPane.showInputDialog(null, "Enter Username: ", "Register", JOptionPane.PLAIN_MESSAGE);
		
		// Password -----
        JPasswordField passwordField = new JPasswordField(20);
        JPanel panel1 = new JPanel();
        panel1.add(new JLabel("Enter Password:"));  // Adding label
        panel1.add(passwordField); 
        
        int action = JOptionPane.showConfirmDialog(null, panel1, "Register", JOptionPane.OK_CANCEL_OPTION);
        
        if (action == JOptionPane.OK_OPTION) {
        	String password = "";
            password = new String(passwordField.getPassword()); // Get the entered password securely
            //if (password != null) {
            JOptionPane.showMessageDialog(null, "Registration successful for user: " + user, "Register", JOptionPane.PLAIN_MESSAGE); 
            //}
        }
        // --------------
	}
	
	public static void main(String[] args) {
		register();
	}

}
