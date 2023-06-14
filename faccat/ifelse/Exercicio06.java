package faccat;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o 1º número");
		int numero1 = sc.nextInt();
		System.out.println("Digite o 2º número");
		int numero2 = sc.nextInt();
		
		if (numero1>numero2) {
			System.out.println(numero1+" é maior que "+numero2);
			
		} else {
			System.out.println(numero2+" é maior que "+numero1);

		}
		sc.close();

	}

}
