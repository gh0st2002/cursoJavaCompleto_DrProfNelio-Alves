package application;

import java.util.Locale;
import java.util.Scanner;

import entities.notas;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// %f = ponto flutuante
		// %d = inteiro
		// %s = texto
		// %n = quebra de linha
		
		
		notas not = new notas();
		
		System.out.println("Digite seu nome seguido de suas 3 notas: ");
		not.nome = sc.nextLine();
		not.nota1 = sc.nextDouble();
		not.nota2 = sc.nextDouble();
		not.nota3 = sc.nextDouble();
		
		System.out.printf(("FINAL GRADE = %.2f\n"), not.resnota());
		if(not.resnota() < 60 ) {
			System.out.println("FAILED");
			System.out.printf("Missing %.2f POINTS", not.cu());
		}
		else {
			System.out.println("PASS");
		}
		

	}

}
