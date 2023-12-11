package FaccatJava;

import java.util.Scanner;
public class Exerc02 {
	public static void main(String[]args) {
	Scanner leia = new Scanner(System.in);
	System.out.println("Informe a base do retângulo");
	float base = leia.nextFloat();
	System.out.println("Informe a altura do retângulo");
	float altura = leia.nextFloat();	
	leia.close();
	float area = base*altura;
	System.out.println("A area do retângulo é: " + area);
	}
}
