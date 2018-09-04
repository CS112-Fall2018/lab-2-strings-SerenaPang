/** 

Shows examples of how to use String methods.

@author Serena Pang

@version 1.0


*/


public class StringFun {



	/**
	This is my main method.
	*/
    public static void main(String[] args) {

    	if (args.length != 3) {

    		System.out.println("You have to provide 3 parameters");
    		return;

    	} 


    	String s = args[0];
    	String otherString =args[1];
        String subString =args[2];

    	System.out.println("First argument " + s);
    	System.out.println("Second argument " + otherString);
    	System.out.println("Third argument " + subString);

    	for (int i = 0; i < args.length; i++) {
    		System.out.println(i + " - " + args[i]);



    	        /* The two other string method I piked are String.toUpperCase and String.toLowerCase, 
        these two string methods return the string that's converted to Lowercase letters or uppercase letters. 
        If there is nothing needs to be converted, it's going to return the original string. */


    			

    		}


    	System.out.println("---------------------------------");

        System.out.println("Length = " + s.length());
        System.out.println("euqals = " + s.equals("otherString"));
        System.out.println("substring = " + s.substring(0,1));
        System.out.println(" trim = " + s.trim());
        System.out.println("index of i is   = " + s.indexOf("i"));
        System.out.println("last Index Of i is = " + s.lastIndexOf("i"));
        System.out.println("char at 0 is= " + s.charAt(0));
        System.out.println("uppercase= " + s.toUpperCase());
        System.out.println("uppercase= " + s.toLowerCase());


    	System.out.println("----------------------------------");

        System.out.println("Length = " + otherString.length( ));
        System.out.println("equal= " + otherString.equals("otherString"));
        System.out.println("substring = " + otherString.substring(0,1));
        System.out.println(" trim = " + otherString.trim());
        System.out.println("index of i is   = " + otherString.indexOf("i"));
        System.out.println("last Index Of i is = " + otherString.lastIndexOf("i"));
        System.out.println("char at 0 is= " + otherString.charAt(0));
        System.out.println("uppercase= " + otherString.toUpperCase());
        System.out.println("uppercase= " + otherString.toLowerCase());


        System.out.println("----------------------------------");

        System.out.println("Length = " + subString.length( ));
        System.out.println("equal= " + subString.equals("otherString"));
        System.out.println("substring = " + otherString.substring(0,1));
        System.out.println(" trim = " + otherString.trim());
        System.out.println("index of i is   = " + otherString.indexOf("i"));
        System.out.println("last Index Of i is = " + otherString.lastIndexOf("i"));
        System.out.println("char at 0 is= " + otherString.charAt(0));
        System.out.println("uppercase= " + subString.toUpperCase());
        System.out.println("uppercase= " + subString.toLowerCase());


  
    }
}

