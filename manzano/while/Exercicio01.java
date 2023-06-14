package manzano;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número e receba sua tabuada");
		int numero = sc.nextInt();
		int contador=0;
		
		while (contador<10) {
			contador++;
			
		int resultado=contador*numero;
		
		System.out.println(+numero+" x "+contador+" = "+resultado);
		
		sc.close();
			
		}

	}

}
