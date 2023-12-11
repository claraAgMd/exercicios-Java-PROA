package ListaMetodos;

import java.util.Scanner;

public class Exerc06 {

	
	static int[] trocaValores(int numeros[]) {
		int valorX = numeros[0];
		int valorY = numeros[1];
		
		int guardaValor = valorX;
		
		numeros[0] = valorY;
		numeros[1] = guardaValor;
		
		return numeros;
		
	}
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe um valor");
		int valor01 = leia.nextInt();
		System.out.println("Informe outro valor");
		int valor02 = leia.nextInt();
		int[] numeros = {valor01,valor02};
		leia.close();
		trocaValores(numeros);
        
        System.out.println("Os valores trocados agora são: " + numeros[0] + " e " + numeros[1]);
		
		
		
		
	}

	
}
