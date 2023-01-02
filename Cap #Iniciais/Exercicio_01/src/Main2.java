 // questão 2

import java.util.Locale;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o raio do círculo: ");
		
		double R = sc.nextDouble();
		double A = R * R * 3.14159;
		
		System.out.printf("O valor da área do círculo é: %.4f\n", A);
		sc.close();

	}

}
