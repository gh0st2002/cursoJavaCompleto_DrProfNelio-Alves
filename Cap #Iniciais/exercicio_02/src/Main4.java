import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		float ini = sc.nextFloat();
		float fin = sc.nextFloat();
		float horas;
		
		if(ini < fin){
			horas = fin - ini;
		}
		else {
			horas = 24 - ini + fin;
		}
		
		System.out.printf("O JOGO DUROU %.0f HORA(S)\n", horas);

	}

}
