package FaccatJava;
import java.util.Scanner;
public class Exerc08 {
	public static void main(String[]args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe a temperatura em Fahrenheit");
		double fahrenheit = leia.nextFloat();
		leia.close();
		double celsius = (fahrenheit - 32)*5/9;
		System.out.println("      C             " + fahrenheit );
		System.out.println("-----------  =  -----------  = C = " + celsius);
		System.out.println("      5              9     ");
		leia.close();
	}
}
