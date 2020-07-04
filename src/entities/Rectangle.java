package entities;

public class Rectangle {
	
	public double width;
	public double height;
	
	public double area() {
		return this.height * this.width;
	}
	
	public double perimeter() {
		return 2 * (this.height + this.width);
	}
	
	public double diagonal() {
		return Math.sqrt((this.height * this.height) + (this.width * this.width));
	}
}
