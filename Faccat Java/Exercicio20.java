package FaccatJava;

import java.util.Scanner;

public class Exerc20 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe seu salário!");
		float salarioFixo = sc.nextFloat();
		System.out.println("Quanto foi o valor de suas vendas!");
		float valorVendas = sc.nextFloat();
		float salarioFinal = 0;
		float vendasSuperiorA1500 = 0;
		if(valorVendas < 1500) {
			salarioFinal = salarioFixo+((valorVendas*3)/100);
		}else {
			vendasSuperiorA1500 = (valorVendas-1500);
			salarioFinal = salarioFixo+((1500*3)/100)+((vendasSuperiorA1500*5)/100);
		}
		
		System.out.println("O salário final do vendedor foi de: "+ salarioFinal +"R$");
		sc.close();
		
	}
}
