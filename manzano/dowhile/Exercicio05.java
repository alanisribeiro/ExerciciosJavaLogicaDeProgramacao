package manzano;

import java.util.Scanner;

public class Exercicio29 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int contador=0;
		int media=0;
		int soma=0;
		int mediaFinal=0;
		int numero;
		
		do {
			System.out.println("Digite um número positivo (Negativo para parar)");
	        numero = sc.nextInt();
			media=media+numero;
			soma=soma+numero;
			
		} while (numero>0);
		mediaFinal=media/(contador-1);
		System.out.println("Foram digitados "+ (contador-1)+ "numeros");
		System.out.println("A média dos números digitados é: "+mediaFinal);
		System.out.println("O somatório dos números digitados é: "+soma);
		
		sc.close();

	}


}
