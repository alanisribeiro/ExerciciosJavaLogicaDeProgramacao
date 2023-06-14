package faccat;

import java.util.Scanner;

public class Exercicio30 {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite o nome do 1º time");
	String time1 = sc.next();
	System.out.println("Digite a quantidade de gols que esse time fez");
	int golstime1 = sc.nextInt();
	
	System.out.println("Digite o nome do 2º time");
	String time2 = sc.next();
	System.out.println("Digite a quantidade de gols que esse time fez");
	int golstime2 = sc.nextInt();
	

	
	if (golstime1>golstime2) {
		System.out.println("O vencedor foi "+time1);
		
	} else if (golstime2>golstime1){
		System.out.println("O vencedor foi "+time2);

	}
	else {
		System.out.println("Empate!");
	}
	sc.close();
	
	

	}

}
