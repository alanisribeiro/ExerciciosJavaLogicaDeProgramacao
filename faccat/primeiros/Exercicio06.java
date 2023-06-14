package faccat;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número");
		int numero = sc.nextInt();
		int sucessor=numero+1;
		System.out.println("O sucessor do número é: "+sucessor);
		
		sc.close();
		

	}

}
