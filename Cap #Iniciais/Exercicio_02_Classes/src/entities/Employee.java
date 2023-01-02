package entities;

public class Employee {

	public String nome;
	public double salario;
	public double imposto;

	public double dif() {
		return salario - imposto;
	}
	
	public void increaseSalary(double percentage) {
		salario += salario * percentage / 100;
	}

	public String toString() {
		return nome + ", $ " + String.format("%.2f", dif());
	}

}
