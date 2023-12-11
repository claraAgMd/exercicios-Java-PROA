package FaccatJava;

import java.util.Scanner;
public class Exerc01 {
	public static void main(String[]args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe um valor");
		int valor = leia.nextInt();
		leia.close();
		System.out.println("O antecessor do número informado é " + (--valor));
	}
}
