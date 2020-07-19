package application.coringadelimitado;

import java.util.ArrayList;
import java.util.List;

import application.coringadelimitado.entities.Circle;
import application.coringadelimitado.entities.Rectangle;
import application.coringadelimitado.entities.Shape;

public class Program {

	public static void main(String[] args) {
		
		List<Shape> myShapes = new ArrayList<>();
		
		myShapes.add(new Rectangle(3.0, 2.0));
		myShapes.add(new Circle(2.0));
		
		List<Circle> myCircles = new ArrayList<>();
		myCircles.add(new Circle(2.0));
		myCircles.add(new Circle(3.0));
		
		System.out.println("Total area: " + String.format("%.2f", totalArea(myShapes)));
		System.out.println("Total area: " + String.format("%.2f", totalArea(myCircles)));
	}
	
	public static double totalArea(List<? extends Shape> list) {
		double sum = 0.0;
		for (Shape s : list) {
			sum += s.area();
		}
		return sum;
	}
}