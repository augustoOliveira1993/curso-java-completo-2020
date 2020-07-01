package util;

public class CurrencyConverter {
	
	public static double converterReal(double dollar, double qtdDollar) {
		double totReal = dollar * qtdDollar;
		return totReal += totReal * 6 / 100;
	}
}
