package FaccatJava;

import java.util.Scanner;

public class Exerc24 {
	public static void main(String[]args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Insira o primeiro valor");
		int valor01 = leia.nextInt();
		System.out.println("Insira o segundo valor");
		int valor02 = leia.nextInt();
		System.out.println("Insira o terceiro valor");
		int valor03 = leia.nextInt();
		leia.close();	
		if(valor01>valor02&&valor01>valor03) {
			System.out.println("O maior valor é " + valor01);
		}else if(valor02>valor01&&valor02>valor03) {
			System.out.println("O maior valor é " + valor02);
		}else {
			System.out.println("O maior valor é " + valor03);
		}
	}
}
