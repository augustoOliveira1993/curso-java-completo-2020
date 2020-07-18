package application.interfaces.refactore;

import application.abstracts.metodos.Color;

public class Circle extends AbstractShape{
	
	private Double radius;

	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	@Override
	public Double area() {
		return Math.PI * this.radius * this.radius;
	}
}
