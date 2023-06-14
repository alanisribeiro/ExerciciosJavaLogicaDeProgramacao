package faccat;

import java.util.Scanner;

public class Exercicio18 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de maças");
		int macas = sc.nextInt();
		double total;
		
		if (macas>11) {
			total=macas*1;
			
		} else {
			total=macas*1.30;
		}
		System.out.println("O custo total foi: "+total);
		sc.close();
}
	
}

