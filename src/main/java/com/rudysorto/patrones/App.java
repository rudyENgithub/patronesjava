package com.rudysorto.patrones;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
        System.out.println(56); // 56
        System.out.println(0b1011); // 3  //solo se eleva por la posicion la base 2 y se hace la suma el prim de la der es pos 0
        System.out.println(0217); // de derecha a izqu. la primera posicion sin base, segunda posicion (8 o base^1)* num en ese caso 1 = 8
        //, tercera pos.(8 o base^2)* num en ese caso 128 y se suman  7+8+128 = 143
        System.out.println(0x1A1F); //  // 15+ (16^1*1)=16+ (16^2*10) = 2560 + (16^3*1) = 4096
        
        //System.out.println("explodeDM()"+explodeDM("2015.01.4"));
       // explodeDM("2015.01.4.3556");
        String[] result = explodeDM("2015.01.4.4854");
        if(result != null){
        	System.out.println(result[0] + " " + result[1] + " " + result[2] + " " + result[3] );
        }else {
        	System.out.println("El formato de la DM es incorrecto, el formato es el siguiente AÑO.ADUANA.SERIAL.NoDM");
        }
        //"jdbc:sqlserver://172.31.240.90:1433"
        //jdbc:sqlserver://[serverName[\instanceName][:portNumber]][;property=value[;property=value]]
      String url =  "jdbc:odbc:Driver={SQL Server};Server=172.31.240.90;database=testdb;Uid=usaid;Pwd=usaid;charset=utf-8";
      String sql = "select id, nombre from testdb.dbo.tabledb"; 
      Database daba = new Database("testdb", url);
      try {
    	  ResultSet resultSet =  daba.runSql(sql);
    	  while (resultSet.next()) {
              System.out.println("Printing result...");

              // Now we can fetch the data by column name, save and use them!
              String id = resultSet.getString("id");
              String nombre = resultSet.getString("nombre");
            

              System.out.println("\tid: " + id + 
                      ", nombre: " + nombre );
          }

      } catch (SQLException e) {
          e.printStackTrace();
      } /*finally {
          // We have to close the connection and release the resources used.
          // Closing the statement results in closing the resultSet as well.
          try {
              statement.close();
          } catch (SQLException e) {
              e.printStackTrace();
          }

          try {
              connect.close();
          } catch (SQLException e) {
              e.printStackTrace();
          }
*/
    }
    
    
   
    
    public static String[] explodeDM(String decmer){
		//String[] result = null;
		String[] result = decmer.split("\\.");
		
		if(result.length == 4){
			return result;
		}
		return null;
		
		/*String string = "123.654321";
		String[] parts = string.split("\\.");
		String part1 = parts[0]; // 123
		String part2 = parts[1]; // 654321
		System.out.println("inter"+part2.toString());*/
		
		/* String diasPunto = "Lunes.Martes.Miercoles.Jueves.Viernes.Sabado.Domingo";
		    String diaPuntoArray[] = diasPunto.split("\\.");

		    System.out.println("--Ejemplo 2--");
		    for(String diaPunto : diaPuntoArray){
			System.out.println(diaPunto);
		    }*/
		
	}
}
