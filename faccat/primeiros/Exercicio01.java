package faccat;

import java.util.Scanner;

public class Exercicio05Pag04 {
	
	public static void main(String[]args) { //Public -Outras classes tem acesso, static - não vai mudar, void- vai retornar vazio, main- principal, string- ta declarando um array, args- argumentos
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Digite um número e receba seu antecessor");
		int numero =sc.nextInt();
		int antecessor = numero-1;
		System.out.println("O antecessor de "+ numero +" é: "+antecessor);
		
		sc.close();
	}

}
