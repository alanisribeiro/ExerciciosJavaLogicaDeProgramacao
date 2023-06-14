package faccat;

import java.util.Scanner;

public class Exercicio31 {

	public static void main(String[] args) {
    
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite o 1º número");
	int numero1 = sc.nextInt();
	System.out.println("Digite o 2º número");
	int numero2 = sc.nextInt();
	
	if (numero1>numero2) {
		System.out.println("O 1º número é maior");
	} else if (numero2>numero1){
		System.out.println("O 2º número é maior");
	} else {
		System.out.println("Os números são iguais");
	}
	
	sc.close();
    

	}

}
