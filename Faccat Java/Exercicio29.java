package FaccatJava;

import java.util.Scanner;
public class Exerc29 {
	public static void main(String[]args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe o primeiro valor");
		int valor01 = leia.nextInt();
		System.out.println("Informe o segundo valor");
		int valor02 = leia.nextInt();
		leia.close();
		String mensagem = (valor01>valor02)?"O primeiro valor é maior":(valor01==valor02)?"Os valores são iguais":"O segundo valor é maior";
		System.out.println(mensagem);
		
		
		
		
	}
}
