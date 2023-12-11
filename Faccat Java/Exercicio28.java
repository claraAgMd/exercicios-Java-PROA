package FaccatJava;

import java.util.Scanner;

public class Exerc28 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o nome do primeiro time!");
		String timeA = sc.next();
		System.out.println("Informe o nome do segundo time!");
		String timeB = sc.next();
		System.out.println("Informe a quantidade de gols do primeiro time");
		int golsTimeA = sc.nextInt();
		System.out.println("Informe a quantidade de gols do segundo time");
		int golsTimeB = sc.nextInt();
		sc.close();
		if(golsTimeA>golsTimeB) {
			System.out.println("O time " + timeA +" venceu: " + golsTimeA +" gols");
		} else if(golsTimeB>golsTimeA) {
			System.out.println("O time " + timeB +" venceu: " + golsTimeB +" gols");
		} else {
			System.out.println("Os dois times empataram: " +golsTimeA+" : "+golsTimeB);
		}
	}
}
