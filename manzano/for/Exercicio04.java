package manzano;

public class Exercicio33 {

	public static void main(String[] args) {
		
		int soma = 0;
		
		for (int contador = 1; contador <=500; contador++) {
			if (contador % 2 == 0) {
				soma=soma+contador;
				System.out.println(soma);
				
			}
			
		}

	}

}
