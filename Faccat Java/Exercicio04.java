package FaccatJava;

import java.util.Scanner;

public class Exerc04 {
	public static void main(String[]args) {
	Scanner leia = new Scanner(System.in);
	System.out.println("Informe o total de eleitores");
	int totalEleitores = leia.nextInt();
	System.out.println("Informe o total de votos válidos");
	int votosValidos = leia.nextInt();
	System.out.println("Informe a quantidade de votos nulos");
	int votosNulos = leia.nextInt();
	System.out.println("Informe a quantidade de votos brancos");
	int votosBrancos = leia.nextInt();
	leia.close();
	
	int percentualVotosBrancos = (votosBrancos*totalEleitores)/100;
	int percentualVotosNulos = (votosNulos*totalEleitores)/100;
	int percentualVotosValidos = (votosValidos*totalEleitores)/100;
	System.out.println("A quantidade total de eleitores foi de: " + totalEleitores);
	System.out.println("A quantitdade de votos válidos é de: " + percentualVotosValidos + "%");
	System.out.println("O total de votos em branco foi de: " + percentualVotosBrancos + "%");
	System.out.println("O total de votos nulos foi de: " + percentualVotosNulos + "%");
	}
}
