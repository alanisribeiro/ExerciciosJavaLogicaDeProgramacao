package manzano;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite o raio da lata");
	double raio = sc.nextDouble();
	System.out.println("Digite a altura da lata");
	double altura = sc.nextDouble();
	double volume = Math.PI*raio*raio*altura;
	System.out.println("O volume da lata é: "+volume);
	
	sc.close();
	
	}

}
