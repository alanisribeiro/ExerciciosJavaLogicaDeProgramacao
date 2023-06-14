package faccat;

import java.util.Scanner;

public class Exercicio15 {
	
	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite a 1º nota do aluno");
	int nota1 = sc.nextInt();
	System.out.println("Digite a 2º nota do aluno");
    int nota2 = sc.nextInt();
    System.out.println("Digite a 3º nota do aluno");
    int nota3 = sc.nextInt();
    double mediafinal = (nota1*2+nota2*3+nota3*5)/10;
    System.out.println("A média final do aluno é: "+mediafinal);
    
    sc.close();

}
}
