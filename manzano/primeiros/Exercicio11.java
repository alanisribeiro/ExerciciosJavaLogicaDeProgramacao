package manzano;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da atual cota��o do dolar");
		float cotacao = sc.nextFloat();
		System.out.println("Digite a quantidade de reais que voc� possui");
        float reais = sc.nextFloat();
        float dolar = reais/cotacao;
        
        System.out.println("O valor em dolar �: "+dolar+"$");
        sc.close();
	}

}
