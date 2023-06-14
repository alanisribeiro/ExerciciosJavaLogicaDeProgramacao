package faccat;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite o ano atual");
	int anoatual = sc.nextInt();
	System.out.println("Digite o ano em que você nasceu");
	int anonascimento = sc.nextInt();
	int baseidade = anoatual-anonascimento;
	
	if (baseidade<16) {
		System.out.println("Você ainda não pode votar");
		
	} else {
		System.out.println("Você já pode votar");

	}
	sc.close();

	}

}
