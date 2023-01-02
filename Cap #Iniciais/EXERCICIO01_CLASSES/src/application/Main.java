package application;

import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price? ");
		double dolarPrice = sc.nextDouble();
		System.out.println("How many dollars will be bought? ");
		double dolarQuant = sc.nextDouble();
		
		double result = CurrencyConverter.DolarinReal(dolarQuant, dolarPrice);
		System.out.printf("Amount to be paid in Reais = %.2f", result);
		
		sc.close();

	}

}
