package faccat;

import java.util.Scanner;

public class Exercicio19 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a nota da 1º avaliação");
        double nota1 = sc.nextDouble();
        System.out.println("Digite a nota da 2º avaliação");
        double nota2 = sc.nextDouble();
        double media = (nota1+nota2)/2;
        
        if (media<6) {
        	System.out.println("Você foi reprovado. Sua média foi: "+media);
			
		} else {
			System.out.println("Você foi aprovado. Sua média foi: "+media);

		}
        sc.close();
} 
}
