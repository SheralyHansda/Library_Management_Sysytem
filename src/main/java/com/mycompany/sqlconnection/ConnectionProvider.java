/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sqlconnection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author shera
 */
public class ConnectionProvider {
    public static Connection getCon(){
            
   // public String url = "jdbc:mysql://localhost:3306/test";
  //  public String user = "root";
   // public String passowrd = "123456789";
            
    try{
          Class.forName("com.mysql.cj.jdbc.Driver");
          Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","123456789");
          return con;
        }  
        catch(Exception e)
        {
            System.out.println(e);
            return null;
        }
    }

}

        

