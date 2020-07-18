package application.interfaces.refactore;

import application.abstracts.metodos.Color;

public class Rectangle extends AbstractShape{

	public double width;
	public double height;
	
	public Rectangle(Color color, double width, double height) {
		super(color);
		this.width = width;
		this.height = height;
	}

	public Double area() {
		return this.height * this.width;
	}
	
	public double perimeter() {
		return 2 * (this.height + this.width);
	}
	
	public double diagonal() {
		return Math.sqrt((this.height * this.height) + (this.width * this.width));
	}
}
