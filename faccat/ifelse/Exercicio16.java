package faccat;

import java.util.Scanner;

public class Exercicio31 {

	public static void main(String[] args) {
    
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite o 1� n�mero");
	int numero1 = sc.nextInt();
	System.out.println("Digite o 2� n�mero");
	int numero2 = sc.nextInt();
	
	if (numero1>numero2) {
		System.out.println("O 1� n�mero � maior");
	} else if (numero2>numero1){
		System.out.println("O 2� n�mero � maior");
	} else {
		System.out.println("Os n�meros s�o iguais");
	}
	
	sc.close();
    

	}

}
