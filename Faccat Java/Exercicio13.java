package FaccatJava;

import java.util.Scanner;

public class Exerc13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 
		System.out.println("Digite o nome do aluno:");
		String aluno = sc.next();
 
		System.out.println("Digite a nota da primeira avaliação do aluno(a) " + aluno);
		float nota1 = sc.nextFloat();
		System.out.println("Digite a nota da segunda avaliação do aluno(a) " + aluno);
		float nota2 = sc.nextFloat();
 
		float soma = nota1 + nota2;
 
		float mediaAritmetica = soma / 2;
 
		if (mediaAritmetica >= 6) {
			System.out.println("Média do aluno: " + mediaAritmetica);
			System.out.println("Aluno Aprovado");
		} else {
			System.out.println("Média do aluno: " + mediaAritmetica);
			System.out.println("Aluno Reprovado");
		}
	}
}
