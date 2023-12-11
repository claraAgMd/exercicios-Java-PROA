package ListaMetodos;

import java.util.Scanner;

public class Exerc07 {

	static double celsiusParaFahrenheit(double celsius) {
		return celsius = (celsius*9/5)+32;
	}
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe a temperatura em Celsius");
		double celsius = leia.nextDouble();
		leia.close();
		System.out.println(celsiusParaFahrenheit(celsius));
	}
}
