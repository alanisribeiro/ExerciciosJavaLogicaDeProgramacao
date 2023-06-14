package manzano;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o 1º número");
		int numero1 = sc.nextInt();
		System.out.println("Digite o 2º número");
		int numero2 = sc.nextInt();
		int resultado=(numero1-numero2)*(numero1-numero2);
		System.out.println("O quadrado da diferença do valor é: "+resultado);
		
		sc.close();

	}

}
