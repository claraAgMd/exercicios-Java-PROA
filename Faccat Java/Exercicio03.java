package FaccatJava;

import java.util.Scanner;
public class Exerc03 {
	public static void main(String[]args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe quantos anos você tem!");
		int ano = leia.nextInt();
		System.out.println("Informe quantos meses você tem!");
		int meses = leia.nextInt();
		System.out.println("Informe quantos dias você tem!");
		int dias = leia.nextInt();
		leia.close();
		int idadeEmDias = (ano*365) + (meses*30) + dias;
		System.out.println("A quantidade de dias é de: " + idadeEmDias);	
	}
}
