package faccat;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite o ano atual");
	int anoatual = sc.nextInt();
	System.out.println("Digite o ano em que voc� nasceu");
	int anonascimento = sc.nextInt();
	int baseidade = anoatual-anonascimento;
	
	if (baseidade<16) {
		System.out.println("Voc� ainda n�o pode votar");
		
	} else {
		System.out.println("Voc� j� pode votar");

	}
	sc.close();

	}

}
