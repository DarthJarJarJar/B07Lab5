public class Circle {
	Point center;
	double radius;
  static double pi = 3.1415;
	
	public Circle(Point center, double radius) {
		this.center = center;
		this.radius = radius;
	}
	
	public double perimeter() {
		return 2 * Circle.pi * this.radius;
	}
	
	public double area() {
    return Circle.pi * this.radius * this.radius;
	}
}

