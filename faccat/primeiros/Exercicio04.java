package faccat;

import java.util.Scanner;

public class Exercicio08Pag04 {
	
	public static void main (String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Digite o total de eleitores por mun�cipio");
		int eleitoresmunicipio = sc.nextInt();
		System.out.println("Digite o total de eleitores que votaram nulo");
		int eleitoresnulo = sc.nextInt();
		System.out.println("Digite o total de eleitores que votaram em branco");
		int eleitoresbranco = sc.nextInt();
		System.out.println("Digite o total de votos v�lidos");
		int votosvalidos = sc.nextInt();
		double porcentagemvalido = (100*votosvalidos)/eleitoresmunicipio;
		double porcentagemnulo = (100*eleitoresnulo)/eleitoresmunicipio;
	    double porcentagembranco = (100*eleitoresbranco)/eleitoresmunicipio;
		
		System.out.println("A porcentagem de votos validos �: " +porcentagemvalido+"%");
		System.out.println("A porcentagem de votos nulos �: "+porcentagemnulo+"%");
		System.out.println("A porcentagem de votos em branco �: "+porcentagembranco+"%");
		
		sc.close();
	}
	
	
	
	

}

