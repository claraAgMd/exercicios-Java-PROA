package FaccatJava;

import java.util.Scanner;
public class Exerc06 {
	public static void main(String[]args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe o custo de fábrica do carro!");
		float custoFabrica = leia.nextFloat();
		
		leia.close();
		float valorTotal = custoFabrica+((custoFabrica*28)/100)+((custoFabrica*45)/100);
		System.out.println("O valor do carro para o consumidor é de: " + valorTotal + "R$");
	
	}
}
