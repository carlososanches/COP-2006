import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
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
// Carlos Sanchez
// A program integrating skills learned in COP 2006
// Variable is a location in memory
// Scope means a variable is only accessible in the method it was declared.

// A constructor is a method that doesn't have a return type, name is always same as class name.

public class Main {
  // this is a header, top line of a method, Identified a header

  // method call is using an object we can call a method from another class, identified method call

  // public is an access modifier

  // void is the return type, means method shouldn't return method names

  // Operator precedence evaluates and resolves several operators in an order.

  // Created a method with arguments and return values

  // parameters, variables passed, identified: side1 and side2, needs to be multiplied.
  // used * sign

  // Arguments are the actual values that are passed in when method is invoked. Argument Identified

	// Java program to demonstrate working of method 
	// overloading in Java. 

	public class Sum { 

		// Overloaded sum(). This sum takes two int parameters 
		public int sum(int x, int y) 
		{ 
			return (x + y); 
		} 

		// Overloaded sum(). This sum takes three int parameters 
		public int sum(int x, int y, int z) 
		{ 
			return (x + y + z); 
		} 

		// Overloaded sum(). This sum takes two double parameters 
		public double sum(double x, double y) 
		{ 
			return (x + y); 
		} 

		
	} 


  public static double calculateTwoTimes(double side1, double side2) {
    double total;
    total = side1 * side2;
    return total;
  }

  public static void main(String[] args) {

	  
    System.out.println("This is my integration project.");
    System.out.println("A collection of excercises I've used through this semester.");

    // Used a Math class
    //We can use the Math class without intializing it, here I'll use the power function to square the number seven
    System.out.println(Math.pow(7, 2));

    // if else
    // Compare two springs with == sign.
    // The == checks if both objects point to the same memory location.
    String s1 = "String1";
    String s2 = "String2";
    if (s1 == s2) {

      System.out.println("String 1 is equal to string 2");
    } else if (s1.equals(s2)) {
      System.out.println("String 1 are still equal to string 2");
    }
    // compareTo with two objects
    System.out.println(s1.compareTo(s2));


    int grade = 90;

    char finalLetter = (grade >= 90) ? 'A' : 'B';
    // ? is ternary operator
    // variable x = (expression) ? value if true: value if false
    if (grade >= 90) {
      finalLetter = 'A';
    } else if (grade >= 80) {
      finalLetter = 'B';
    } else if (grade >= 70) {
      finalLetter = 'C';
    } else if (grade >= 60) {
      finalLetter = 'D';
    } else {
      finalLetter = 'F';
    }

    // Use conditional Operators &&, ||
    // used == sign
    // The == works with objects because it is used to compare two operands to see if the two are equal.
    int years = 5;
    int days = 7;
    if ((years == 5) && (days == 7))
      System.out.println("My favorite numbers are 5 and 7!");
    if ((years == 5) || (days == 8))
      System.out.println("My favorite number may be five or eight");

    // Used switch
    // Used break in a loop
    // break is used when the loop is ended and then it resumes the next statement following the
    // loop

    Scanner input = new Scanner(System.in);
    System.out.println("please enter a command:  ");
    String text = input.nextLine();

    switch (text) {
      case "start":
        System.out.println("Machine started!");
        break;

      case "stop":
        System.out.println("Machine stopped. ");
        break;

      default:
        System.out.println("Command not recognized");
    }
    // Used continue in a loop
    // continue means that it'll skip to the next iteration of the loop.
    
    int[] numbers = {1, 2, 3, 4, 5};

    for (int x : numbers) {
      if (x == 3) {
        continue;
      }
      System.out.print(x);
      System.out.print("\n");
    }

    int thisNumber = 2;
    System.out.println(--thisNumber);
    // Output will be 1

    // Rolling a dice six times to get six random numbers,
    // assignment "Random"
    // used random class
    // used ++ sign
    // Used While loops
    // Used for loops
    int num = 0;
    int numberOfTimesRandomNumberPickedAndPrinted = 0;

    Random randomGen = new Random();

    while (numberOfTimesRandomNumberPickedAndPrinted < 5) {
      System.out.println(randomGen.nextInt(53));
      numberOfTimesRandomNumberPickedAndPrinted++;
    }

    for (int numberOfTimes = 0; numberOfTimes < 5; numberOfTimes++) {
      System.out.println(randomGen.nextInt(53));
      numberOfTimesRandomNumberPickedAndPrinted++;
    }

    int number;
    for (int counter = 1; counter <= 6; counter++) {
      number = 1 + randomGen.nextInt(6);
      System.out.println(1 + randomGen.nextInt(6));

    }

    // Used do while loops
    int counter1 = 0;

    do {
      System.out.println(counter1);
      counter1++;
    } while (counter1 <= 17);
    
    // Used % sign
    
    int women, men, people1;
    women = 11;
    men = 3;
    people1 = women % men;
    System.out.println(people1);
    // Output is 2

    // Used of basic operators "+" and "+="
    System.out.println("22"+2);
    // Output is 222

    double number6 = 6;
    number6 += 7;
    System.out.println(number6);
    // Output will be 13

    boolean whenAcurrate = true;
    boolean notAcurrate = false;
    int howFast = 40;
    double doubleSpeed = 2.0;
    String Car1 = "Mazda";

    System.out.println(whenAcurrate);

    System.out.println(notAcurrate);

    System.out.println(Car1
        + " going 40 mph, if the speed doubles in one minute how fast is it going?");
    System.out.println(calculateTwoTimes(howFast, doubleSpeed));

    final double valuePi = Math.PI;
    // When a variable is declared with final keyword, its value can’t be modified, so for Pi it's
    // always 3.14

    Object anObject = "I'm going to type this casting";
    String aString = (String) anObject;
    // Casting is taking an Object of one particular type and “turning it into” another Object type.

    System.out.println("Top  \"Middle\" " + "bottom " + Car1);
    // Static means belonging to a class not an object

   // Bulk of PSI 3 is here, I overload a method at the top.

    // Inheritance is the process where a class acquires properties (methods and fields) of another.
    // You can reuse the fields and methods of the existing class without having to write and debug
    // them yourself.

    // 1-D array
    int[] anArray = {1, 2, 3, 4, 5};
    for (int i = 0; i < anArray.length; i++) {
      System.out.println(anArray[i]);
      //manually find the smallest value in an array
      System.out.println(anArray[0]);
    }
    
    // Get a sum of values in an array using accumulator
    int someArray[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int sum = 0;

    for (int t : someArray)
        sum += t;
    int[] ta = new int[101];
    for (int t = 0; t < ta.length; t++) ta[t] = t;
       for (int e : ta) sum += e;
    System.out.println(sum);
    
    // Declare and use an ArrayList
    ArrayList<Integer>theNumbers= new ArrayList<Integer>();
    
    theNumbers.add(10);
    theNumbers.add(20);
    theNumbers.add(30);
    
    System.out.println(theNumbers.get(0));
    
    // multi-dimensional array (3 dimensions)
    
    int[] values = {4, 7, 17};
    
    System.out.println(values[2]);
    
    int[][][] arr = new int[10][20][30]; 
    arr[0][0][0] = 1; 

    System.out.println("arr[0][0][0] = " + arr[0][0][0]);   
    
    // Searched a two-dim array
    // create and use the enhanced for loop

    int[][] points = new int[1][10];

    int totalPoints = 0;
    for (int team = 0; team < points.length; team++) {
      for (int inning = 0; inning < points[team].length; inning++) {
        points[team][inning] = 2;
      }
    }
    for (int team = 0; team < points.length; team++) {
      for (int inning = 0; inning < points[team].length; inning++) {
        totalPoints += points[team][inning];
        System.out.println("The total number of points is " + totalPoints);
      }
    }
    //Searching through an array for an index
    Integer[] array = {1,2,3,4,5,6};
    Arrays.asList(array).indexOf(4);
    // Effectively utilize exception handling for user input of an int
    try {
      System.out.println("Enter first number");
      double num1 = input.nextDouble();
      System.out.println("Enter second number");
      double num2 = input.nextDouble();
      System.out.println("Result = " + num1 / num2);

    } catch (ArithmeticException ex) {
      System.out.println("Try again, remember not to divide by 0");
    }
    //overload is inserted here from the top function
    Sum s = new Sum(); 
	System.out.println(s.sum(10, 20)); 
	System.out.println(s.sum(10, 20, 30)); 
	System.out.println(s.sum(10.5, 20.5)); 
	//Overloaded in driver class
	Bus small = new Bus(); 
		small.display(); 
  }

  // Make a class in separate file with private fields, public getters and setters, a constructor
  // with
  // and without parameters.
  public class Book {
	  private String author;
	  private String Genre;
	 //My Gets and Sets
	  public void setAuthor(String newAuthor) { //Use of "this"
	    this.author = newAuthor;
	  }
	  
	  public String getAuthor() {
	    return author;
	  }
	  public void setGenre(String newGenre) {
	    Genre = newGenre;
	  }
	  
	  public String getGenre(String newGenre) {
	    return Genre;
	  }
	  
	   // My constructor with Parameters text and SeriesNumber
	   public void publish(String author, String Genre) {
	     
	   System.out.println("This Book is" + author + "The "+Genre + "genre");
	 }
	}



    // constructor with parameters
    public Book(String Author) { // header for constructor
      // called automatically when objects created
      author = getAuthor;
    }

    // Constructor without parameters
    public Book() {
      Genre = Horror;
    }

  }

  // Develop code that makes use of polymorphism
  //Use of parent and overload
  //Parent class
  class Vehicle 
  { 
  	int maxSpeed = 120; 
  } 

  //Bus extends vehicle, its parent
  class Bus extends Vehicle 
  { 
  	int maxSpeed = 180; 

  	void display() 
  	{ 
  		
  		System.out.println("Maximum Speed: " + super.maxSpeed); 
  	} 
  } 
   
  		
  	
	



}
