package application.hascodeequals;

public class Program {
	
	public static void main(String[] args) {
		
		String a = "Maria";
		String b = "Alex";
		
		System.out.println("Equals()");
		System.out.println(a.equals(b));
		
		System.out.println();
		System.out.println("hasCode()");
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		
		System.out.println();
		System.out.println("Clintes");
		Cliente c1 = new Cliente("Maria", "maria@gmail.com");
		Cliente c2 = new Cliente("Maria", "maria@gmail.com");
		
		String s1 = new String("Test");
		String s2 = new String("Test");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));// true
		System.out.println(c1 == c2);// false
		System.out.println(s1 == s2);// false
	}
}
