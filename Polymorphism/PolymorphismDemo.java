package Polymorphism;

/*
  Need to add a constructor for Circle and Rectangle classes
*/

public class PolymorphismDemo {
  /** Main method */
  public static void main(String[] args) {
    // Display circle and rectangle properties
      // creating "anonymous objects"
      // did not give the new Circle and Rectangle objects a name
      // did not say: Circle c1 = new Circle(1, "red", false);
      // and then displayObject(c1);
      
    displayObject(new Circle(1, "red", false));
    displayObject(new Rectangle(1, 1, "black", true));
    
    Circle myCircle = new Circle (1, "red", false);
    displayObject(myCircle);
    System.out.println(myCircle.toString());
  }

  /** Display geometric object properties */
  // dynamic binding --> this displayObject method knows which toString method
  // to call at runtime
  public static void displayObject(GeometricObject object) {
    System.out.println(object.toString()+ "\n");
    //object.setColor("blue"); // will change color of objects passed to it
  }
}
