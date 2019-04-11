
public class Van extends Vehicle{
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
