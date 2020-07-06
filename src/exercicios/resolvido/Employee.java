package exercicios.resolvido;

public class Employee {
	
	private String name;
	private Integer hours;
	private Double valueHour;
	
	public Employee() {
		
	}

	public Employee(String name, Integer hours, Double valueHour) {
		this.name = name;
		this.hours = hours;
		this.valueHour = valueHour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public Double getValueHour() {
		return valueHour;
	}

	public void setValueHour(Double valueHour) {
		this.valueHour = valueHour;
	}
	
	public Double payment() {
		return this.valueHour * this.hours;
	}
	
}
