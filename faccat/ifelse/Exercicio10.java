package faccat;

import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite o salário fixo do vendedor");
	int salario = sc.nextInt();
	System.out.println("Digite o valor de vendas efetuadas");
	int vendas = sc.nextInt();
	double comissao;
	double salariototal;
	
	if (vendas>1500) {
		comissao = vendas*0.05;
		salariototal = salario+comissao;
		System.out.println("O salário total é "+salariototal);
	} else {
		comissao = vendas * 0.03;
		salariototal = salario+comissao;
		System.out.println("O salário total é "+salariototal);

	}
	
	sc.close();

	}

}
