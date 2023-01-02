package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Program {

	// %f = ponto flutuante
	// %d = inteiro
	// %s = texto
	// %n = quebra de linha

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Employee emp = new Employee();

		System.out.print("Name: ");
		emp.nome = sc.nextLine();
		System.out.print("Gross salary: ");
		emp.salario = sc.nextDouble();
		System.out.print("Tax: ");
		emp.imposto = sc.nextDouble();

		System.out.println();
		System.out.println("Employee: " + emp);
		
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double porcentagem = sc.nextDouble();
		
		emp.increaseSalary(porcentagem);
		
		System.out.println("Updated data: " + emp);
		sc.close();
	}

}
