package manzano;

public class Exercicio38 {

	public static void main(String[] args) {
		
		int numero1=1;
		int numero2=1;
		
		for (int contador = 1; contador <=15; contador++) {
			System.out.println(numero1);
			int soma=numero1+numero2;
			numero1=numero2;
			numero2=soma;
			
		}
	}

}
