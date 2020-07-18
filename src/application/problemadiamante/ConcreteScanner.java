package application.problemadiamante;

public class ConcreteScanner extends Device implements Scanner{
	
	public ConcreteScanner(String serialNumer) {
		super(serialNumer);
	}
	
	@Override
	public void processDoc(String doc) {
		System.out.println("Scanner processing: " + doc);
	}
	
	@Override
	public String scan() {
		return "Scanned content";
	}

}
