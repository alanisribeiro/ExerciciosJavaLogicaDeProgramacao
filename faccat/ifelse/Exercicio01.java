package faccat;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero");
		int numero = sc.nextInt();
		if (numero>10) {
			System.out.println("O valor digitado � maior que 10");
		}else {
			System.out.println("O valor digitado � menor que 10");
			
			sc.close();
		}

	}
}
