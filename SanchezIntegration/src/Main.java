import java.util.Scanner;

//Carlos Sanchez
//A program integrating skills learned in COP 2006
/*LIST OF JAVA BUILT IN DATA TYPES-
 * BYTE-Minimum value of -128 and maximum value of 127. Useful for saving memory in large arrays, where memory saving actually matters.
 * SHORT-This is 16bit it has a minimum value of -32,768 and a max of 32,767. same guidelines apply as byte, you can use a short to save memory in large array, in situations where memory actually matters!
 * LONG- In Java SE 8 and further you can use the long data type to represent an unsigned  64-bit long, which has a minimum value of 0 and max of 2^64-1. Use when you need larger data types than that of int. 
 * DOUBLE- double-precision 64-bit IEEE 754 floating point. For decimal values, this data type is generally the default choice. Never use for precise values like currency
 * FLOAT - Single precision 32-bit IEEE 754 floating point. Use a float (instead of double) if you need to save memory in large arrays of floating point numbers. 
 * INT-minimum value of -2^31 and maximum of value of 2^31-1. In Java SE 8 and further you can use the int data type to represent unasigneed 32-bit integer, which has a minimum value of 0 and max value of 2^32-1.
 * CHAR-  Minimum value of '\u0000'(or0) and a maximum value of '\uffff' (or 65,535 inclusive)
 * STRING- String objects are immutable, meaning once created, the value cannot be changed!
The String class is not a primitive data type
 * BOOLEAN- Typically used as a true or false statement, represents one bit of info and default value is false 
 
 */
public class Main {

	
	
	
	
	
	
	
	

   public static void main(String[] args) {
	   
	   boolean trueOrFalse = true;
	   int wholeNumber = 2;
	   double rationNumber = 2.0;
	   String radical = "Awesome";
	   
	   if (trueOrFalse == true)
	  System.out.println(wholeNumber + rationNumber + " " + radical); 
	   
	   //VARIABLE- A VARIABLE IS A LOCATION IN MEMORY THAT WE CAN ASSIGN VALUES TO.
	   //SCOPE- A VARIABLE IS ONLY ACCESSIBLE IN THE METHOD IT WAS DECLARED.
	   
	   
	   System.out.println("Greetings, this is my Integration Project");
	   System.out.println("The Greatest project ever");

	    final int fiveGuys = 5;
	    
	   // When a variable is declared with final keyword, its value can’t be modified. This means that you must initialize a final variable. 
	    
	    Object castedObject = "This will be casted";
	    String bigString = (String)castedObject;
	    
	    //CASTING-  to make java to temporarily treat the variable like another data type.
	    
	    //THIS LAST PART IS MY ESCAPE SEQUENCE!
	    System.out.println("This\nis\nawesome");
	   
	  	   
	   
	   
	   
	   
	   
	   
	  	

    } 
}


