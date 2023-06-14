package manzano;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o comprimento da caixa");
		float comprimento = sc.nextFloat();
		System.out.println("Digite a altura da caixa");
		float altura = sc.nextFloat();
		System.out.println("Digite a largura da caixa");
		float largura = sc.nextFloat();
		float volume=comprimento*altura*largura;
		
		System.out.println("O volume da caixa retangular é: "+volume);
		
		sc.close();

	}

}
