package application.problemadiamante;

public class ConcretePrinter extends Device implements Printer{

	public ConcretePrinter(String serialNumer) {
		super(serialNumer);
	}
	
	@Override
	public void processDoc(String doc) {
		System.out.println("Printer processing: " + doc);
	}
	
	@Override
	public void print(String doc) {
		System.out.println("Printing: " + doc);
	}

}
