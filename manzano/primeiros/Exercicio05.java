package manzano;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da presta��o");
		float prestacaoInicial = sc.nextFloat();
		System.out.println("Digite o valor da taxa");
		float taxa = sc.nextFloat();
		System.out.println("Digite os dias de atraso do pagamento");
		float tempoAtraso = sc.nextFloat();
		
		float prestacaoFinal=prestacaoInicial+(prestacaoInicial*taxa/100)*tempoAtraso;
		System.out.println("O valor da presta��o em atraso � "+prestacaoFinal);
		
		sc.close();
	}

}
