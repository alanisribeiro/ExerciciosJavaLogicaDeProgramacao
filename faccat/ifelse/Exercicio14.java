package faccat;

import java.util.Scanner;

public class Exercicio29 {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite o 1� n�mero");
	int numero1 = sc.nextInt();
	System.out.println("Digite o 2� n�mero");
	int numero2 = sc.nextInt();
	System.out.println("Digite o 3� n�mero");
	int numero3 = sc.nextInt();
	
    if (numero1 > numero2) {
        if (numero1 > numero3) {
       System.out.println("O maior �: " + numero1);
        } else {
      System.out.println("O maior �: " + numero3);
        }
    } else if (numero2 > numero3) {
      System.out.println("O maior �: " + numero2);
    } else {
      System.out.println("O maior �: " + numero3);
    }
    sc.close();
}
}
