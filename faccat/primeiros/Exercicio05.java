package faccat;

import java.util.Scanner;

public class Exercicio09Pag04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o sal�rio atual do funcion�rio");
        double salarioatual = sc.nextInt();
        System.out.println("Digite o percentual de reajuste");
        double percentualreajuste = sc.nextInt();
        
        double salarionovo = salarioatual+(salarioatual*percentualreajuste)/100;
        System.out.println("O valor do sal�rio atual do funcion�rio �: "+salarionovo);
        
        sc.close();
	}

}
