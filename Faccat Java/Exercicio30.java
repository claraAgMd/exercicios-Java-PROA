package FaccatJava;

import java.util.Scanner;

public class Exerc30 {
	public static void main(String[]args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe o combustível: A para alcool ; G para gasolina");
		String combustivel = leia.next();
		System.out.println("Quantos litros serão comprados");
		double litros = leia.nextDouble();
		leia.close();
		double valorTotal;
		double valorAcimaDe20;
		switch (combustivel) {
		case "A":
			if(litros < 21) {
				valorTotal = ((litros*(2.90-((2.90*3)/100))));
			}else {
				valorAcimaDe20 = litros-20;
				valorTotal = ((20*(2.90-((2.90*3)/100))))+((valorAcimaDe20*(2.90-((2.90*5)/100))));
			}
			System.out.println("O valor total ficou de:" + valorTotal + "R$");
			break;
		case "G":
			if(litros < 21) {
				valorTotal = ((litros*(3.30-((3.30*4)/100))));
			}else {
				valorAcimaDe20 = litros-20;
				valorTotal = ((20*(3.30-((3.30*3)/100))))+((valorAcimaDe20*(3.30-((3.30*6)/100))));
			}
			System.out.println("O valor total ficou de:" + valorTotal + "R$");
			break;
		default:
			break;
		}
		
		
		
		
	}
}
