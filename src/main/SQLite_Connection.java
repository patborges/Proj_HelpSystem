package main;

import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.SQLException;  

public class SQLite_Connection {
	
   /** 
   * Connect to a sample database 
   */  
	
   public static void  SQLite_Connection() {   
	
	  Connection conn = null;  
      
	  try {  
          // db parameters  
          String url = "jdbc:sqlite:/home/kali/Desktop/HelpSystem_DB.db";  
          // create a connection to the database  
          conn = DriverManager.getConnection (url);  
            
          System.out.println("Connection to SQLite has been established.");  
            
      } catch (SQLException e) {  
          System.out.println(e.getMessage());  
      } finally {  
          try {  
              if (conn != null) {  
                  conn.close();  
              }  
          } catch (SQLException ex) {  
              System.out.println(ex.getMessage());  
          }  
      }  
  }  
  /** 
   * @param args the command line arguments 
   */  
  public static void main(String[] args) {  
	  SQLite_Connection();  
  }  
}
