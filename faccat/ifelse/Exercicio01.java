package faccat;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número");
		int numero = sc.nextInt();
		if (numero>10) {
			System.out.println("O valor digitado é maior que 10");
		}else {
			System.out.println("O valor digitado é menor que 10");
			
			sc.close();
		}

	}
}
