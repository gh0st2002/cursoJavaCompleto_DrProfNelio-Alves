package util;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
 
	public static double DolarinReal(double dolarQuant, double dolarPrice){
		return dolarQuant * dolarPrice * (1 + IOF);
	}
}
