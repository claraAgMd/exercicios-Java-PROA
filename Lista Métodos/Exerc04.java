package ListaMetodos;

import java.util.Scanner;

public class Exerc04 {

	
	
	static int fatorial(int numero01,int numero02) {
		if(numero01 < numero02) {
			return numero02 * fatorial(numero01,numero02-1);
		}else {
			return numero02;
		}
	}
	
	public static void main(String[]args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe um número!");
		int numero = leia.nextInt();		
		leia.close();
		int resultado = fatorial(1,numero);
		System.out.println(resultado);
		
	}
}