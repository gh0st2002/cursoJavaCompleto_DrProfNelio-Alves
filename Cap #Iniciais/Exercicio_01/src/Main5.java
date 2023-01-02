import java.util.Locale;
import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		//%f = ponto flutuante
		//%d = inteiro
		//%s = texto
		//%n = quebra de linha
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite o cód. da peça 1: ");
		double peca1 = sc.nextDouble();
		System.out.println("Digite a quantidade da peça 1: ");
		int 	qtd1 = sc.nextInt();
		System.out.println("Digite o preço da peça 1: ");
		double preco1 = sc.nextDouble();
		
		System.out.println("Digite o cód. da peça 2: ");
		double peca2 = sc.nextDouble();
		System.out.println("Digite a quantidade da peça 2: ");
		int 	qtd2 = sc.nextInt();
		System.out.println("Digite o preço da peça 2: ");
		double preco2 = sc.nextDouble();
		
		double soma = preco1 * qtd1 + preco2 *qtd2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", soma);

		
	}

}
