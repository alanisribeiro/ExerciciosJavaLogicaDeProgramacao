package manzano;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	    int contador=0;
	    float soma=0;
	    float media=0;
	    
	    
	    while (contador<10) {
	    	System.out.println("Digite um número");
	    	float numero = sc.nextFloat();
	    	soma=soma+numero;
	    	contador++;
			
		}
	    
	    media=soma/10;
	    System.out.println("Soma: "+soma);
	    System.out.println("Média aritmética: "+media);
	    sc.close();
		
			
		}
		

	}


