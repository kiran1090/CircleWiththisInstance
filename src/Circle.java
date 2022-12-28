package PACKAGE_NAME;
public class Circle {
  // Instance variable
private double radius;

/** Constructs a Circle instance with the given radius and default color */
public Circle(double radius) {
   this.radius = radius;   // "this.radius" refers to the instance variable
                           // "radius" refers to the method's parameter
   color = "red";
}

/** Sets the radius to the given value */
public void setRadius(double radius) {
   this.radius = radius;   // "this.radius" refers to the instance variable
                           // "radius" refers to the method's argument
}
}
