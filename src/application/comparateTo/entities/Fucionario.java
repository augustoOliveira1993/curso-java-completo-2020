package application.comparateTo.entities;

public class Fucionario implements Comparable<Fucionario>{
	
	private String name;
	private Double salary;
	
	public Fucionario(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Fucionario outroFunc) {
		return -this.salary.compareTo(outroFunc.getSalary());
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.name);
		sb.append(", ");
		sb.append(this.salary);
		return sb.toString();
	}
	
}
