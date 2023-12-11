package FaccatJava;

import java.util.Scanner;

public class Exerc27 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o primeiro valor");
		float valor01 = sc.nextInt();
		System.out.println("Informe o segundo valor");
		float valor02 = sc.nextInt();
		System.out.println("Informe o terceiro valor");
		float valor03 = sc.nextInt();
		sc.close();
		if(valor01 < valor02+valor03 && valor02 < valor01+valor03 && valor03 < valor01+valor02) {
			System.out.println("Os valores correspondem a um triângulo");
		}else {
			System.out.println("Os valores não correspondem a um triângulo");
		}
	}
}
