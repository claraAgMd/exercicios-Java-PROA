package FaccatJavat;

import java.util.Scanner;

public class Exerc32 {
	public static void main(String[]args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Quantos Kg de morango quer comprar?");
		double kgMorangos = leia.nextDouble();
		System.out.println("Quantos Kg de maçã quer comprar?");
		double kgMacas = leia.nextDouble();
		leia.close();
		double kgTotais = kgMorangos + kgMacas;

		double valorTotalMorangos;
		double valorTotalMacas;
		double valorAcimaDe5kgMacas;
		double valorAcimaDe5kgMorangos;
		
		
		if(kgMorangos < 6) {
			valorTotalMorangos = kgMorangos * 2.50;				
		} else {
			valorAcimaDe5kgMorangos = kgMorangos-5;
			valorTotalMorangos = (5 * 2.50)+(valorAcimaDe5kgMorangos*2.20);
			
		}
		if(kgMacas < 6) {
			valorTotalMacas = kgMacas * 1.80;				
		} else {
			valorAcimaDe5kgMacas = kgMacas-5;
			valorTotalMacas = (5 * 1.80)+(valorAcimaDe5kgMacas*1.50);
		}
		
		double valorFrutas = valorTotalMacas+valorTotalMorangos;
		
		if(valorFrutas > 25 || kgTotais > 8) {
			valorFrutas = valorFrutas-((valorFrutas*10)/100);
		}
		System.out.println("O valor das frutas foi de: " + valorFrutas + "R$");
		
	}
}
