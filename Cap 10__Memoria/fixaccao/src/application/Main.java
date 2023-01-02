package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rent [] rooms = new Rent[10];
		
		System.out.print("How many rooms will be rented?");
		int n = sc.nextInt();
		
		for(int i = 1; i<n; i++) {
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Room: ");
			int number = sc.nextInt();
			
			rooms [number] = new Rent (name, email);
		}
		
		sc.close();

	}

}
