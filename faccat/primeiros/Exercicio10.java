package faccat;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em graus Fahrenheit");
		int fahrenheit = sc.nextInt();
		int celsius = (fahrenheit-32)*5/9;
		System.out.println("A temperatura em celsius é: " +celsius+"ºC" );
		
		sc.close();

	}
	
	

}
