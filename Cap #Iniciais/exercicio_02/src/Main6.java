import java.util.Locale;
import java.util.Scanner;

public class Main6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		float num = sc.nextFloat();
		
		
		if(num < 0.0 || num > 100.0) {
			System.out.println("Fora de intervalo");
		}
		else if(num <= 25.00) {
			System.out.println("Intervalo (0, 25]");
		}
		else if(num <= 50){
			System.out.println("Intervalo (25, 50]");
		}
		else if (num <= 75){
			System.out.println("Intervalo (50, 75]");
		}
		else {
			System.out.println("Intervalo (75, 100]");
		}
		sc.close();
	}

}
