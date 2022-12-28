

public class Circle {
  // Instance variable
double radius;
String color;

/** Constructs a Circle instance with the given radius and default color */
public Circle(double radius, String Color) {
   this.radius = radius;   // "this.radius" refers to the instance variable
                           // "radius" refers to the method's parameter
   color = "red";
}

/** Sets the radius to the given value */
public void setRadius(double radius) {
   this.radius = radius;   // "this.radius" refers to the instance variable
                           // "radius" refers to the method's argument
}
public void SetColor(String color)
{
    this.color= color;
}
    public double getRadius()
    {
        return this.radius;
    }
    public String getColor()
    {
        return this.color;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
