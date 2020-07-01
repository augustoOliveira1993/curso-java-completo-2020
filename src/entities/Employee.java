package entities;

public class Employee {
	
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return this.grossSalary - this.tax;
	}
	
	public void increaseSalary(double porcentage) {
		this.grossSalary += this.grossSalary * porcentage / 100;
	}
	
	public String toString() {
		return this.name + ", $ " + String.format("%.2f", this.netSalary());
	}
}
