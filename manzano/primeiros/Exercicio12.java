package manzano;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o 1º valor");
		int valor1 = sc.nextInt();
		System.out.println("Digite o 2º valor");
		int valor2 = sc.nextInt();
		System.out.println("Digite o 3º valor");
		int valor3 = sc.nextInt();
		
		int resultado = (valor1*valor1)+(valor2*valor2)+(valor3*valor3);
		
		System.out.println("O valor da soma do quadrado desses 3 valores é: "+resultado);
		
		
		sc.close();

	}

}
