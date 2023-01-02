import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite dois numeros inteiros:");
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(A % B == 0 || B % A == 0 ) {
			System.out.println("São Multiplos");
		}
		else {
			System.out.println("Nao são Multiplos");
		}
		

	}

}
