
/*
 * 
 * TO BE ELIMINATED AFTER INFORMATION TAKEN
 * 
 * */



package main;

//import java.util.HashMap;
//import java.util.Map;

import javax.swing.ImageIcon;
//import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class GraphicInterface {

	//private static Map<String, String> registeredUsers = new HashMap<>();
	
	public static void main(String[]args) {
		// TODO Auto-generated constructor stub
		
		// Not working yet
		ImageIcon icon = new ImageIcon("~/Documents/logo.png");
		// ---------------
		
		String panel = JOptionPane.showInputDialog(null, "Welcome to Help System"
				+ "\n\n1 - Register"+ "\n2 - Login" + "\n3 - End" + "\n\nChoose your option:", "Menu", JOptionPane.PLAIN_MESSAGE);

		//panel.setIcon("home:\\kali\\Documents\\logo.png");
		
		
		switch(panel) {
			case "1":
				
				register();
				break;
				
			case "2":
				
				login();				
				break;
				
			case "3":	
				
				exitProgram();
				break;
				
			default:
                JOptionPane.showMessageDialog(null, "Invalid option. \nPlease choose option 1, 2, or 3. \nThanks");
                break;
		}
		
	}
	
	private static void register() {
		// To ask the username
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
	
	private static void login() {
		// To ask the username
		
		//JLabel username = new JLabel
		String loginUser = JOptionPane.showInputDialog(null, "Enter Username: ", "Login", JOptionPane.PLAIN_MESSAGE);
		
		// Password -----
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
	
	private static void exitProgram() {
		JOptionPane.showMessageDialog(null, "Program will exit.");
	    System.exit(0);
	}

}
