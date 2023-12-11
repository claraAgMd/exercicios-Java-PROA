package FaccatJava;

import java.util.Scanner;

public class Exerc09 {
	public static void main(String[]args) {
	Scanner leia = new Scanner(System.in); 
	System.out.println("Informe a primeira nota!");
	float nota01 = leia.nextFloat();
	System.out.println("Informe a segunda nota!");
	float nota02 = leia.nextFloat();
	System.out.println("Informe a terceira nota!");
	float nota03 = leia.nextFloat();
	leia.close();
	float resultado = ((nota01*2)+(nota02*3)+(nota03*5))/10;
	System.out.println(" " + nota01 +" * 2 + "+ nota02 +" * 3 + " + nota03 +" * 5 ");
	System.out.println("------------------------------  = " + resultado);
	System.out.println("             10");
	}
}
