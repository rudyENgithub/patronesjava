package com.rudysorto.patrones;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches {

  /* public static void main( String args[] ) {
      // String to be scanned to find the pattern.
      String line = "This order was placed for QT3000! OK?";
      String pattern = "(.*)(\\d+)(.*)(A-Z)";

      // Create a Pattern object
      Pattern r = Pattern.compile(pattern);

      // Now create matcher object.
      Matcher m = r.matcher(line);
      if (m.find( )) {
         System.out.println("Found value: " + m.group(0) );
         System.out.println("Found value: " + m.group(1) );
         System.out.println("Found value: " + m.group(2) );
         System.out.println("Found value: " + m.group(3) );
      }else {
         System.out.println("NO MATCH");
      }
   }*/
	
	 public static void main(String[] args) {
		 	String manifest = "1 2017";
		    String text = "This is a testWithSome!DataInBetween_test.";
		    Pattern p = Pattern.compile("test([_A-Za-z0-9 !]*)test");
		    Pattern pman = Pattern.compile("^([0-9]*)$");
		    Matcher m = p.matcher(text);
		    Matcher mman = pman.matcher(manifest);
		    if (mman.find()) {
		     // System.out.println("Matched: " + m.group(1));
		      System.out.println("Matched: " + mman.group(1));
		    } else {
		      System.out.println("No match.");
		    }
		  }
}
