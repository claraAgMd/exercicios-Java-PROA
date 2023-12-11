package FaccatJava;

import java.util.Scanner;
public class Exerc05 {
	public static void main(String[]args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe o seu salário!");
		float salarioMensal = leia.nextFloat();
		System.out.println("Informe o percentual de reajuste!");
		float reajuste = leia.nextFloat();
		leia.close();
		float novoSalario = salarioMensal + ((salarioMensal*reajuste)/100);
		System.out.println("Seu novo salário é de: " + novoSalario);
	}
}
