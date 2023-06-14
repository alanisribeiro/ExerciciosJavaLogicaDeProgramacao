package faccat;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite o valor ganho por hora trabalhada");
    int salariohora = sc.nextInt();
    System.out.println("Digite a quantidade de horas trabalhadas");
	int horastrabalhadas = sc.nextInt();
	double salariototal;
	double horasextras;
	double salariohoraextra1;
	double salariohoraextra2;
	double salariohoraextratotal;
	
	if (horastrabalhadas<=160) {
		salariototal=salariohora*horastrabalhadas;
		System.out.println("O salário total do funcionário do mês é: "+salariototal);
		
	} else {
		horasextras=horastrabalhadas-160;
		salariohoraextra1=horasextras*salariohora;
		salariohoraextra2=salariohoraextra1*0.5;
		salariohoraextratotal=salariohoraextra1+salariohoraextra2;
		salariototal=salariohora*160+salariohoraextratotal;
		System.out.println("O salário final do funcionário é " +salariototal);
		
	}
	
	sc.close();
    
    
	}

}
