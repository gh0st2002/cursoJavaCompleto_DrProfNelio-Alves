package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.print("Qual a quantidade de funcionários? ");
		int n = sc.nextInt();

		List<Employee> list = new ArrayList<>();

		for (int i=1; i<=n; i++) {
			System.out.println("Employee #" + i + " data:");
			System.out.print("Terceirizado (S/N)? ");
			char c = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double value = sc.nextDouble();
			if(c=='s') {
				System.out.print("Valor adicional: ");
				double valorAdicional = sc.nextDouble();
				Employee emp = new OutsourcedEmployee(name, hours, value, valorAdicional);
				list.add(emp);
			}
			else {
				Employee emp2 = new Employee(name, hours, value);
				list.add(emp2);
				// list.add(new Employee(name, hours, value););
			}
		}
		
		System.out.println();
		System.out.print("Payments:");
		
		for(Employee emp : list) {
			System.out.println(emp.getName() + "- $ " + String.format("%.2f", emp.payment()));
		}
		sc.close();

	}

}
