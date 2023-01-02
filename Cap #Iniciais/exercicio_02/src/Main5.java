import java.util.Locale;
import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//%f = ponto flutuante
		//%d = inteiro
		//%s = texto
		//%n = quebra de linha
		
		
		int cod = sc.nextInt();
		int quantidade = sc.nextInt();
		double total = 0;
		
		if(cod == 1)
			total = quantidade * 4.00;
		else if(cod == 2) {
			total = quantidade * 4.50;
		}
		else if (cod == 3) {
			total = quantidade * 5.00;
		}
		else if (cod == 4) {
			total = quantidade * 2.00;
		}
		else if (cod == 5) {
			total = quantidade * 1.50;
		}
		
		System.out.printf(("Total: R$ %.2f"), total);
		
		
		
			
		
		
		sc.close();
	}

}
