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




  
  //SubClass

  private class ExceptionTest {
    
    static int divdeByZero(int a, int b) {
      
      int k = a/b;
      
      return k;
    }
    static int computeDivision(int a, int b) {
      int res =0;
      
      try {
        res = divideByZero(a,b);
      }
      catch(NumberFormatExeption ex)
      {
        System.out.println("NumberFormatException has occured");
      }
      return res;
    }
  }

  private class Van extends Vehicle{
    int maxSpeed = 180;
    
    @Override
    public void prndl() {
      System.out.println("This car is in prndl");
      
    }
    void display()
    //Use of Super
    {
      System.out.println("Maximum Speed:" + super.maxSpeed);
    }
    
  }
  
  //Parent
  private class Vehicle {
    int maxSpeed = 120;
    
    public void prndl() {
      System.out.println("This car is in park");
    }
    
  }
  
class Book {
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
     
  
  public static void main(String[] args) {

    System.out.println("This is my Integration Project");
    System.out.println("The Greatest project ever");



    // example of declaring a final
    final double SALES_TAX_RATE = .065;
    // SALEX_TAX_RATE = .075 Java will stop you from declaring this!!

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

    // IGNORE CODE
    int int1 = 2;
    double double1 = 2.0;
    String string1 = "2";

    int int2 = 2;
    double double2 = 2.0;
    String string2 = "2";
    /* Print the sum of both integer variables on a new line. */
    System.out.println("The result of + integer " + (int1 + int2));
    /* Print the sum of the double variables on a new line. */
    System.out.println("The result of + double " + (double1 + double2));

    /* Concatenate and print the String variables on a new line. */
    System.out.println("The result of + string " + (string1 + string2));

// PSI III STARTS HERE
    
    Book HarryPotter = new Book();
    HarryPotter.publish("Deathly Hallows", "Horror");
  
  /*Inheritance is a mechanic that allows an object to have all the properties and behavior of
  it's parent class or when a class wants to use existing features of another class; Bike would
  be the parent of the mountain bike or unicycle(polymorphism)*/
   /*
  int[] myIntArray = new int[3];
  
//declares an Array of integers. 
  
  int[] myIntArray = {10,20,30};
      
  for (int i = 0; i < myIntArray.length; i++)  {
     System.out.println("Element at index " + i +  
                                  " : "+ myIntArray[i]);
  }
  
  int a =1;
  int b =0;
  
  try
  {
    int k = computeDivision(a,b);
  }
  
  catch(ArithmeticException ex)
  {
    System.out.println(ex.getMessage());
  }
  */
  }
  }
  
