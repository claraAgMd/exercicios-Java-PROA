package FaccatJava;

import java.util.Scanner;

public class Exerc12 {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		double soma;
 
		System.out.println("Digite a quantidade de Maçãs que deseja comprar");
		int quantidadeMacas = sc.nextInt();
 
		if (quantidadeMacas >= 12) {
			soma = quantidadeMacas * 1;
			System.out.println("Como foi pedido " + quantidadeMacas + " Maçãs, o preço fica R$" + soma + ",00");
		} else {	
		   soma =  1.3 * quantidadeMacas;
		  System.out.println("Como foi pedido " + quantidadeMacas + " Maçãs, o preço fica R$" + soma);
		}
	}
}
