package entities;

public class notas {
	
	public String nome;
	
	public double nota1;
	public double nota2;
	public double nota3;
	public double resnota (){
		return nota1 + nota2 + nota3;
	}
	
	public double cu () {
		if(resnota() < 60) {
			return 60 - resnota();
		}
		else {
			return 0.00;
		}
	}
}
