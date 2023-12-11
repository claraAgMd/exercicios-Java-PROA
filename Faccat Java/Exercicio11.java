package FaccatJava;

import java.util.Scanner;

public class Exerc11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 
		System.out.println("Digite um valor para ele ser validado como positivo ou negativo:");
		float valor = sc.nextFloat();
 
		if (valor >= 0) {
			System.out.println("O valor digitado " + valor + " é positivo");
		} else {
			System.out.println("O valor digitado " + valor + " é negativo");
		}
	}
}
