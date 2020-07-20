package application.maps;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		
		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("username", "Maria");
		cookies.put("email", "Maria@gmail.com");
		cookies.put("Phone", "997111234");
		
		cookies.remove("email");
		cookies.put("Phone", "99711133");
		
		System.out.println("Contains 'phone' key: " + cookies.containsKey("Phone"));
		System.out.println("Phone number: " + cookies.get("Phone"));
		System.out.println("Email: " + cookies.get("email"));
		System.out.println("Sizer: " + cookies.size());
		
		System.out.println();
		System.out.println("ALL COOKIES:");
		for (String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
	}
}
