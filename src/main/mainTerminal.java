
/*
 * 
 * TO BE ELIMINATED AFTER INFORMATION TAKEN
 * 
 * */


package main;

import java.util.Scanner;

public class mainTerminal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int stop = 0;
	
	Scanner scan = new Scanner(System.in);
	
	
	SQLite_Connection myConnection = new SQLite_Connection(); 
	
	do {
		System.out.println("                                       ");
		System.out.println("   #################################   ");
		System.out.println("  ######   Help System Menu   #######  ");
		System.out.println("   #################################   ");
		System.out.println("---------------------------------------");
		System.out.println("| 1 - Register                        |");
		System.out.println("| 2 - Login                           |");
		System.out.println("| 3 - End                             |");
		System.out.println("---------------------------------------");
		System.out.println("Choose your option:                    ");
	
		int num = scan.nextInt();
		
		switch(num) {
			case 1:
				System.out.println("Register");
			break;
		
			case 2:
				System.out.println("Login");
			break;
		
			case 3:
				stop=1;
		}
		
	} while(stop == 0);
		scan.close();
	}

	
	/*
	 * public static void graphicInterface() {
	 * 
	 * InterfaceGrafica panel = new InterfaceGrafica();
	 * 
	 * }
	 */
}
