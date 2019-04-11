
public class ExceptionTest {
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
