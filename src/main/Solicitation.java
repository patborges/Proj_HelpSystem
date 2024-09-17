package main;

import javax.swing.*;
import java.awt.*;

public class Solicitation {

	public static void main(String[] args) {
	
		 JFrame frame = new JFrame("Solicitation Form");
	     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     
	     // Department
	     JLabel departmentLabel = new JLabel("Department:");
	     String[] departments = {"---", "Human Resources", "Information Technology", "Finance", "Marketing", "Collaborator"};
	     JComboBox<String> departmentComboBox = new JComboBox<>(departments);
	     
	     // Description
         JLabel descriptionLabel = new JLabel("Title:");
	     JTextField descriptionField = new JTextField(30);
	     
         // Message
         JLabel messageLabel = new JLabel("Message:");
	     JTextArea messageArea = new JTextArea(10, 30);
	     JScrollPane scrollPane = new JScrollPane(messageArea);
	     
	     JPanel panel = new JPanel(new GridBagLayout());
	     GridBagConstraints gbc = new GridBagConstraints();
	     
	     gbc.insets = new Insets(5, 5, 5, 5);

	     // Department
         gbc.gridx = 0;
         gbc.gridy = 0;
         panel.add(departmentLabel, gbc);
	     gbc.gridx = 1;
         gbc.gridy = 0;
         panel.add(departmentComboBox, gbc);

         // Description
         gbc.gridx = 0;
         gbc.gridy = 1;
         panel.add(descriptionLabel, gbc);
         gbc.gridx = 1;
         gbc.gridy = 1;
         panel.add(descriptionField, gbc);

         // Message
         gbc.gridx = 0;
         gbc.gridy = 2;
         gbc.gridwidth = 2; // Span across both columns
         panel.add(messageLabel, gbc);
         gbc.gridx = 3;
         panel.add(scrollPane, gbc);
	     
	     frame.getContentPane().add(panel, BorderLayout.CENTER);
	     //frame.setSize(400, 300);
	     frame.pack();
	     frame.setVisible(true);
	}

}
