public class Circle extends GeometricObject {

  private double radius;

  public Circle() {}

  public Circle(double radius) {
    this.radius = radius;
  }

  public Circle(double radius, String color, boolean filled) {
    this.radius = radius;
    setColor(color);
    setFilled(filled);
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public double getArea() {
    return Math.PI * radius * radius;
  }

  public double getPerimeter() {
    return Math.PI * (2 * radius);
  }

  public double getDiameter() {
    return 2 * radius;
  }

  public void printCircle() {
    System.out.println(
      "The circle is created " +
      getDateCreated() +
      " and the radius is " +
      radius
    );
  }
}
