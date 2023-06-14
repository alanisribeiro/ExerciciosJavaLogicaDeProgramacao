package faccat;

import java.util.Scanner;

public class Exercicio09Pag04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o salário atual do funcionário");
        double salarioatual = sc.nextInt();
        System.out.println("Digite o percentual de reajuste");
        double percentualreajuste = sc.nextInt();
        
        double salarionovo = salarioatual+(salarioatual*percentualreajuste)/100;
        System.out.println("O valor do salário atual do funcionário é: "+salarionovo);
        
        sc.close();
	}

}
