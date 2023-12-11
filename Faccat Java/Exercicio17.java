package FaccatJava;

import java.util.Scanner;

public class Exerc17 {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
 
		System.out.println("Digite o primeiro valor");
		float valor1 = sc.nextFloat();
		System.out.println("Digite o segundo valor");
		float valor2 = sc.nextFloat();

 
		if (valor1 > valor2) {
			System.out.println(valor1 + " é maior que " + valor2);
		} else {
			System.out.println(valor2 + " é menor que " + valor1);
		}
	}
}
