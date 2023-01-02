package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		int[] numeros = new int[n];
		
		for(int i = 0; i<n; i++) {
			System.out.print("Digite um numero: ");
			numeros[i] = sc.nextInt();
		}
		System.out.println();
		System.out.println("Numeros Pares:");
		int par = 0;
		for(int i = 0; i<n; i++) {
			if(numeros[i] % 2 == 0) {
				System.out.printf("%d " , numeros[i]);
				par++;
			}
		}
		System.out.println();
		System.out.println("QUANTIDADE DE PARES = " + par);
		sc.close();

	}

}
