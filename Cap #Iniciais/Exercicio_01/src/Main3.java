import java.util.Locale;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		//%f = ponto flutuante
		//%d = inteiro
		//%s = texto
		//%n = quebra de linha
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 4 valores inteiros: ");
		
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		
		int diferenca = A * B - C * D;
		
		System.out.println("DIFERENCA = " + diferenca);

		
	}

}
