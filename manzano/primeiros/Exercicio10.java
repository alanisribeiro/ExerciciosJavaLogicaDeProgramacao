package manzano;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a atual cota��o do dolar");
		float cotacao = sc.nextFloat();
		System.out.println("Digite quantos dol�res voc� possui");
		float dolar = sc.nextFloat();
		float reais=dolar*cotacao;
		
		System.out.println("O valor convertido para real �: "+reais+"R$");
		
		sc.close();

	}

}
