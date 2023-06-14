package faccat;

import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite o número da sua conta");
	int numeroconta = sc.nextInt();
	System.out.println("Digite o seu saldo");
	double saldo = sc.nextDouble();
	System.out.println("Digite o débito");
	double debito = sc.nextDouble();
	System.out.println("Digite o crédito");
	double credito = sc.nextDouble();
	
	double saldoatual=(saldo-debito)+credito;
	
	if (saldoatual>=0) {
		System.out.println("Saldo positivo");
		
	} else {
		System.out.println("Saldo negativo");

	}
	sc.close();
	}

}
