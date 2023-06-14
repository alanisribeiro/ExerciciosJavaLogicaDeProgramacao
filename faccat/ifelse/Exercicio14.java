package faccat;

import java.util.Scanner;

public class Exercicio29 {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite o 1º número");
	int numero1 = sc.nextInt();
	System.out.println("Digite o 2º número");
	int numero2 = sc.nextInt();
	System.out.println("Digite o 3º número");
	int numero3 = sc.nextInt();
	
    if (numero1 > numero2) {
        if (numero1 > numero3) {
       System.out.println("O maior é: " + numero1);
        } else {
      System.out.println("O maior é: " + numero3);
        }
    } else if (numero2 > numero3) {
      System.out.println("O maior é: " + numero2);
    } else {
      System.out.println("O maior é: " + numero3);
    }
    sc.close();
}
}
