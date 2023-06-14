package manzano;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a atual cotação do dolar");
		float cotacao = sc.nextFloat();
		System.out.println("Digite quantos doláres você possui");
		float dolar = sc.nextFloat();
		float reais=dolar*cotacao;
		
		System.out.println("O valor convertido para real é: "+reais+"R$");
		
		sc.close();

	}

}
