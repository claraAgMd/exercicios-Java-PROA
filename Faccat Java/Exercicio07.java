package FaccatJava;

import java.util.Scanner;
public class Exerc07 {
	public static void main(String[]args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe seu salário");
		float salarioMensal = leia.nextFloat();
		System.out.println("Qual sua porcentagem por carro vendido?");
		int porcentagemCarro = leia.nextInt();
		System.out.println("Quantas vendas você fez?");
		int quantidadeVendas = leia.nextInt();
		System.out.println("Quanto você recebeu pelas vendas?");
		int valorTotal = leia.nextInt();
		leia.close();
		float salarioFinal = salarioMensal+((porcentagemCarro*valorTotal)/100)+((quantidadeVendas*5)/100);
		System.out.println("O salário final do funcionário é de: " + salarioFinal);
		
	}
}
