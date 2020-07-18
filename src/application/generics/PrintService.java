package application.generics;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {

	private List<T> values = new ArrayList<>();

	public PrintService() {

	}

	public PrintService(List<T> values) {
		this.values = values;
	}

	public void addValue(T value) {
		this.values.add(value);
	}

	public T first() {
		if (values.isEmpty()) {
			throw new IllegalStateException("Lista Vazia");
		}
		return this.values.get(0);
	}

	public void print() {
		System.out.print("[ ");
		if (!this.values.isEmpty()) {
			System.out.print(this.values.get(0));
		}
		for (int i=1; i<this.values.size(); i++) {
			System.out.print(", " + this.values.get(i));
		}
		System.out.println(" ]");
		
	}
}
