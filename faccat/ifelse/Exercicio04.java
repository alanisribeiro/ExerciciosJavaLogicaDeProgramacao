package faccat;

import java.util.Scanner;

public class Exercicio19 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a nota da 1� avalia��o");
        double nota1 = sc.nextDouble();
        System.out.println("Digite a nota da 2� avalia��o");
        double nota2 = sc.nextDouble();
        double media = (nota1+nota2)/2;
        
        if (media<6) {
        	System.out.println("Voc� foi reprovado. Sua m�dia foi: "+media);
			
		} else {
			System.out.println("Voc� foi aprovado. Sua m�dia foi: "+media);

		}
        sc.close();
} 
}
