package com.rudysorto.patrones;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestOdbc {
	
	public static void main(String[] args){
	      Connection con=null;
	    /*  try{
	         //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	         Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver");
	         //com.microsoft.sqlserver.jdbc.SQLServerDriver 
	     //    con=DriverManager.getConnection("jdbc:odbc:YourDataSource");
	         con=DriverManager.getConnection("jdbc:sqlserver://172.31.240.90:1433"+";databaseName=testdb");
	         System.out.println("Connected");
	         }catch(Exception e){
	          System.out.println(e.getMessage());
	         }*/
	      
	      try{
	          
	          Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	          con=DriverManager.getConnection("jdbc:odbc:Driver={SQL Server};Server=172.31.240.90;database=testdb;Uid=usaid;Pwd=usaid;charset=utf-8");
	          //PDO("odbc:Driver={SQL Server};Server=192.168.16.3\SILDEGRA;Database=".$db.";Uid=".$uid.";Pwd=".$pass.";charset=utf-8");
	          System.out.println("Connected");
	          }catch(Exception e){
	        	  
	           System.out.println("ERROR "+ e.getMessage());
	          }
	}

}
