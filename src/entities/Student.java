package entities;

public class Student {
	
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double mediaFinal() {
		return this.nota1 + this.nota2 + this.nota3;
	}
	
	public void avaliarAluno() {
		if (this.mediaFinal() >= 60.0) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			double falta = 60.00 - this.mediaFinal();
			System.out.printf("MISSING %.2f POINTS", falta);
		}
	}
}
