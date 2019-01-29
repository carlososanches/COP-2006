import java.util.Scanner;

//Carlos Sanchez
//A program integrating skills learned in COP 2006
public class Main {

	
	
	
	
	
	
	
	

   public static void main(String[] args) {
	   
	   System.out.println("This is my Integration Project");
	   System.out.println("The Greatest project ever");

	   
	  	   
	   
	   
	   
	   
	   
	   
	  	   //example of declaring a final
	   final double SALES_TAX_RATE = .065;
	   //SALEX_TAX_RATE = .075 Java will stop you from declaring this!!
	   
	   Scanner scan = new Scanner(System.in);
	   System.out.println("Enter an integer");
       int i = scan.nextInt();
       scan.nextLine();
       System.out.println("enter a string");
       String s = scan.nextLine();
       System.out.println("Enter a double");
       double d = scan.nextDouble();
      
// any time going from integers to strings , clear buffer
       System.out.println("String: " + s);
       System.out.println("Double: " + d);
       System.out.println("Int: " + i);
	   
	   
       
       
      
       
       
       
       
       
       
       
       //IGNORE CODE
      int int1 = 2;
      double double1 = 2.0;
      String string1 = "2";
         
     int int2 = 2;
      double double2 = 2.0;
      String string2 = "2";
        /* Print the sum of both integer variables on a new line. */
System.out.println("The result of + with ints is " + (int1 + int2));
        /* Print the sum of the double variables on a new line. */
System.out.println("The result of + with ints is " + (double1 + double2));

        /* Concatenate and print the String variables on a new line. */
System.out.println("The result of + with ints is " + (string1 + string2));
	

    } 
}


