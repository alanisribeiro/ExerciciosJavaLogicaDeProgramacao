package manzano;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o 1º número");
		int numero1 = sc.nextInt();
		System.out.println("Digite o 2º número");
		int numero2 = sc.nextInt();
		System.out.println("Digite o 3º número");
		int numero3 = sc.nextInt();
		System.out.println("Digite o 4º número");
		int numero4 = sc.nextInt();
		
		int UmMaisDois=numero1+numero2;
		int UmMaisTres=numero1+numero3;
		int UmMaisQuatro=numero1+numero4;
		int DoisMaisTres=numero2+numero3;
		int DoisMaisQuatro=numero2+numero4;
		int TresMaisQuatro=numero3+numero4;
		
		int UmxDois=numero1*numero2;
		int UmxTres=numero1*numero3;
		int UmxQuatro=numero1*numero4;
		int DoisxTres=numero2*numero3;
		int DoisxQuatro=numero2*numero4;
		int TresxQuatro=numero3*numero4;
		
		System.out.println(+numero1+ " + "+numero2+" = "+UmMaisDois);
		System.out.println(+numero1+ " + "+numero3+" = "+UmMaisTres);
		System.out.println(+numero1+ " + "+numero4+" = "+UmMaisQuatro);
		System.out.println(+numero2+ " + "+numero3+" = "+DoisMaisTres);
		System.out.println(+numero2+ " + "+numero4+" = "+DoisMaisQuatro);
		System.out.println(+numero3+ " + "+numero4+" = "+TresMaisQuatro);

		System.out.println(+numero1+ " x "+numero2+" = "+UmxDois);
		System.out.println(+numero1+ " x "+numero3+" = "+UmxTres);
		System.out.println(+numero1+ " x "+numero4+" = "+UmxQuatro);
		System.out.println(+numero2+ " x "+numero3+" = "+DoisxTres);
		System.out.println(+numero2+ " x "+numero4+" = "+DoisxQuatro);
		System.out.println(+numero3+ " x "+numero4+" = "+TresxQuatro);
		
		sc.close();

		
		

	}

}
