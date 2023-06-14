package faccat;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o raio do circulo");
		int raio = sc.nextInt();
		double area= raio*raio*Math.PI;
		System.out.println("O valor da área é: "+area);
		
		sc.close();

	}

}
