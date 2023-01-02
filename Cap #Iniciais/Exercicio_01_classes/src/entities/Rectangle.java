package entities;

public class Rectangle {
	
		public double largura;
		public double altura;
		
		public double area () {
			return altura * largura;
		}
		
		public double perimenter() {
			return (2 * (largura + altura));
		}
		
		public double diagonal() {
			return Math.sqrt(largura * largura + altura * altura);
			}

}
