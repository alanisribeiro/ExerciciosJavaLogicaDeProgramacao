package manzano;



public class Exercicio16 {

	public static void main(String[] args) {
		
		int contador=0;
		int soma=0;
		
		while (contador<=500) {
			contador++;
			if (contador % 2==0) {
				soma=soma+contador;
				
			}
		}
		
		System.out.println("A soma dos valores pares de 1 a 500 é: "+soma);
	

	}

}
