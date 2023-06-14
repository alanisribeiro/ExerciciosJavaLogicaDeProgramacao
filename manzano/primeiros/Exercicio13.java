package manzano;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o 1º valor");
		int valor1 = sc.nextInt();
		System.out.println("Digite o 2º valor");
		int valor2 = sc.nextInt();
		System.out.println("Digite o 3º valor");
		int valor3 = sc.nextInt();
		
		int soma = valor1+valor2+valor3;
		int resultado = soma*soma;
		
		System.out.println("O quadrado da soma desses 3 números é: "+resultado);
		
		sc.close();

	}

}
