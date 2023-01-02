import java.util.Locale;
import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		//%f = ponto flutuante
		//%d = inteiro
		//%s = texto
		//%n = quebra de linha
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero do funcionário: ");
		int funcnumber = sc.nextInt();
		System.out.println("Digite o numero de horas trabalhadas por este funcionário: ");
		int funchoras = sc.nextInt();
		System.out.println("Digite o valor que recebe por hora: ");
		double funcvalor = sc.nextDouble();
		
		double salario = funchoras * funcvalor;
		
		System.out.println("NUMBER = " + funcnumber);
		System.out.printf("SALARY = U$ %.2f", salario);
		


		sc.close();
	}

}
