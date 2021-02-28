/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my_package;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*; 

/**
 *
 * @author nikitapatil15
 */
public class MyConnection {
    
    
    // create a function to connect with mysql database
    
    public static Connection getConnection(){
        Connection con = null;
     try{  
         Class.forName("com.mysql.jdbc.Driver");  
                System.out.println("Connecting to database...");
                
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbchinmay","root","");   
        }catch(Exception e)
	{
        	System.out.println(e);
        }
       System.out.println("Getting connection");
     return con;
    }    
}    
