
public class Vehicle {
int maxSpeed = 120; 
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
