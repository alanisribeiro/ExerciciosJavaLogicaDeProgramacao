package manzano;

public class Exercicio28 {

	public static void main(String[] args) {
	
		int quadro=1;
		int soma=quadro;
		int grao=2;
		int contador=0;
		
		do {
			contador++;
			grao=grao*2;
			quadro++;
			soma=soma+grao;
			
		} while (contador<64);
		System.out.println("Somatório: "+soma);

	}

}
