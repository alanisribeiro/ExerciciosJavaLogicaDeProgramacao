package manzano;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite a temperatura em graus celsius");
	double celsius = sc.nextDouble();
	double fahrenheit = (9*celsius+160)/5;
	System.out.println("A temperatura em fahrenheit é: "+fahrenheit+"º");
	
	sc.close();
	

	}

}
