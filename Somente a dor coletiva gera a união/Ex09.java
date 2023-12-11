package lista1java;

import java.util.Scanner;

public class Exerc09 {
	public static void main(String[]args) {
		Scanner leia = new Scanner(System.in);
		int i = 0;
		do {
			System.out.println("Digite um número");
			int numero = leia.nextInt();
			if(numero == 0) {
				break;
			}else {
				System.out.println("O número informado é: " + numero);
			}		
		}while(i<1);
		leia.close();
	}
}
