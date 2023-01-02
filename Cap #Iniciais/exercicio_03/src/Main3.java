import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int tipo = sc.nextInt();

		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;

		while (tipo != 4 || tipo < 1 || tipo > 4) {
			if (tipo == 1) {
				alcool =  alcool + 1;
			} else if (tipo == 2) {
				gasolina = gasolina + 1;
			}
			else if (tipo == 3) {
				diesel = diesel + 1;
			}
			else {
				System.out.println("Numero invalido, digite entre 1 e 3 para adicionar e 4 para sair");
				tipo = sc.nextInt();
			}
			System.out.println("Adicionado, continue");
			tipo = sc.nextInt();
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		sc.close();

	}

}
