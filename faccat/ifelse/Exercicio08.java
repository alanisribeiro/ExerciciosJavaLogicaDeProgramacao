package faccat;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite o hor�rio do in�cio da partida");
	int inicio = sc.nextInt();
	System.out.println("Digite o hor�rio do t�rmino da partida");
    int termino = sc.nextInt();
    int duracao;
    
    if (termino<inicio) {
    	duracao = (24-inicio)+termino;
    	System.out.println("A dura��o da partida foi de "+duracao);
		
	} else if (termino>inicio) {
		duracao = termino-inicio;
		System.out.println("A dura��o da partida foi de "+duracao);
	}else {
		duracao = 24;
		System.out.println("A dura��o da partida foi de "+duracao);
	}
    
    sc.close();
    
	
	}

}
