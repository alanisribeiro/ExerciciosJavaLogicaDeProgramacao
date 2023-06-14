package manzano;

public class Exercicio26 {

	public static void main(String[] args) {
		int contador=1;
		int soma=0;
		
		do {
			if (contador % 2 ==0) {
				soma=soma+contador;
				System.out.println("A soma entre: "+contador+" e os seus antecessores pares é: " +soma);
				
			}
			contador++;
			
		} while (contador<=500);

	}

}
