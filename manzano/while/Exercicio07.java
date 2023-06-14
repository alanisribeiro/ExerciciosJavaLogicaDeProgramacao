package manzano;

public class Exercicio20 {

	public static void main(String[] args) {
		
		int anterior=1;
		int posterior=1;
		int contador=1;
		int soma;
		
		while (contador<=15) {
			
			System.out.println(anterior);
			soma=anterior+posterior;
			anterior=posterior;
			posterior=soma;
			contador++;
			
		}

	}

}
