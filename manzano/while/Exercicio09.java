package manzano;

public class Exercicio22 {

	public static void main(String[] args) {
	
		float contador=50;
		float par=0;
		float par2=0;
		float media=0;
		
		while (contador<=70) {
			if (contador % 2 == 0) {
				par=contador+par;
				par2=contador;
				System.out.println("Os números pares são: "+par2);
				
			}
			contador++;
			
			
		}
		media=par/10;
		System.out.println("A média aritmética é: "+media);
	
	}
	

}
