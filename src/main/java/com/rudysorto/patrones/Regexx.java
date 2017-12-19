package com.rudysorto.patrones;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Regexx {

	   public static void main( String args[] ) {
		   
		   String line = "301Ñ&&";
		   Pattern pat = Pattern.compile("[^A-Za-z0-9]");
			 Matcher mat = pat.matcher(line);
			

	      if (mat.find()) {
	         System.out.println("Found value: " + mat.group(0) );
	     
	      }else {
	         System.out.println("NO MATCH");
	      }
	   }

}

