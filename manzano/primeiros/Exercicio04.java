package manzano;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
    
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite a velocidade média em km/h");
    float velocidade = sc.nextFloat();
    System.out.println("Digite o tempo gasto em horas");
    float tempo = sc.nextFloat();
    float distancia=tempo*velocidade;
    float litrosusados=distancia/12;
    System.out.println("A quantidade de litros de combustivel gasto foi "+litrosusados);
    System.out.println("A distância percorrida foi de "+distancia+"KM");
 
    
    sc.close();
	

	}

}
