package manzano;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int contador=1;
		float potencia=1;
		
		System.out.println("Digite o valor da base da potência");
		float base = sc.nextFloat();
		System.out.println("Digite o valor do expoente da potência");
		float expoente = sc.nextFloat();
		
		while (contador<=expoente) {
			potencia=potencia*base;
			contador++;
			
		}
		
		System.out.println(+base+" elevado a "+expoente+" = "+potencia);
		sc.close();
	}
	


}
