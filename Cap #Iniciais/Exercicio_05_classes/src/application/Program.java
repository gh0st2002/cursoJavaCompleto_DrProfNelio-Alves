package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Rectangle rectangle = new Rectangle();

		System.out.println("Digite a largura e altura de um retângulo:");
		rectangle.largura = sc.nextDouble();
		rectangle.altura = sc.nextDouble();
		
		System.out.println("SEGUE RESULTADOS:");
		System.out.printf("AREA: %.2f\n", rectangle.area());
		System.out.printf("Perimetro: %.2f\n", rectangle.perimenter());
		System.out.printf("Diagonal: %.2f", rectangle.diagonal());

	}

}
