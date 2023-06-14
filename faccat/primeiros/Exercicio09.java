package faccat;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do custo de fábrica do carro");
		double custofabrica = sc.nextInt();
		double custofinal = custofabrica+(0.28*custofabrica)+(0.45*custofabrica);
		System.out.println("O custo final é: "+custofinal);
		
		sc.close();

	}

}
