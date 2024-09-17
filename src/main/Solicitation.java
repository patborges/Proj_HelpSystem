package main;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Solicitation {

	public static void main(String[] args) {
	
		 JFrame frame = new JFrame("Solicitation Form");
	     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     
	     // Date Created
	     JLabel dateLabel = new JLabel("Date Created:");
	     SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	     JLabel dateValueLabel = new JLabel(dateFormat.format(new Date()));
	     
	     // Priority
	     JCheckBox priorityCheckBox = new JCheckBox("Urgent");
	     
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

	     // Date Created
         gbc.gridx = 0;
         gbc.gridy = 0;
         panel.add(dateLabel, gbc);
         gbc.gridx = 1;
         panel.add(dateValueLabel, gbc);
         
         // Priority
         gbc.gridx = 0;
         gbc.gridy = 1;
         panel.add(priorityCheckBox, gbc);
	     
	     // Department
         gbc.gridx = 0;
         gbc.gridy = 2;
         panel.add(departmentLabel, gbc);
	     gbc.gridx = 1;
         panel.add(departmentComboBox, gbc);

         // Description
         gbc.gridx = 0;
         gbc.gridy = 3;
         panel.add(descriptionLabel, gbc);
         gbc.gridx = 1;
         panel.add(descriptionField, gbc);

         // Message
         gbc.gridx = 0;
         gbc.gridy = 4;
         gbc.gridwidth = 2; // Span across both columns
         panel.add(messageLabel, gbc);
         gbc.gridy = 5; // Place scrollPane below the message label
         gbc.gridwidth = 2; // Span across both columns
         gbc.fill = GridBagConstraints.BOTH; // Ensure scrollPane fills the cell
         panel.add(scrollPane, gbc);
         
         
	     frame.getContentPane().add(panel, BorderLayout.CENTER);
	     //frame.setSize(400, 300);
	     frame.pack();
	     frame.setVisible(true);
	}

}
