package faccat;

import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite a quantidade atual em estoque");
    double quantidadeatualestoque = sc.nextDouble();
    System.out.println("Digite a quantidade máxima em estoque");
	double quantidademaximaestoque = sc.nextDouble();
	System.out.println("Digite a quantidade minima em estoque");
	double quantidademinimaestoque = sc.nextDouble();
	
	double quantidademedia = (quantidademaximaestoque + quantidademinimaestoque)/2;
	
	if (quantidadeatualestoque>=quantidademedia) {
		System.out.println("Não efetuar compra");
		
	}else {
		System.out.println("Efetuar compra");
	}
	
	sc.close();
	
	
	}

}
