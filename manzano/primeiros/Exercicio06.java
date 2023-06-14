package manzano;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de A");
		String a = sc.next();
		System.out.println("Digite o valor de B");
		String b = sc.next();
		String c = a;
		a=b;
		b=c;
		System.out.println("O valor de A é: "+a);
		System.out.println("O valor de B é: "+b);
		
		sc.close();
		

	}

}
