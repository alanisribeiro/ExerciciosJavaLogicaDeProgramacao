package manzano;

import java.util.Scanner;

public class Exercicio37 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da base da pot�ncia");
		int base = sc.nextInt();
		System.out.println("Digite o valor do expoente da pot�ncia");
		int expoente = sc.nextInt();
		int resultado=1;
		
		for (int contador = 1; contador <=expoente; contador++) {
			resultado=resultado*base;
			
		}
		
		System.out.println(base+" elevado � "+expoente+" = "+resultado);
		
		sc.close();

	}

}
