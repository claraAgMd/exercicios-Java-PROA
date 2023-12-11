package FaccatJava;

import java.util.Scanner;

public class Exerc18 {
	public static void main (String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o horario de inicio do jogo de Xadres");
		   int horarioInicio = sc.nextInt();
		   System.out.println("Digite o horario do fim do jogo de Xadres");
		   int horarioFim = sc.nextInt();
 
		   if (horarioInicio < horarioFim) {
		      int soma = horarioFim - horarioInicio;
		      System.out.println("O total de horas jogadas foram "+ soma+" horas");
		   } else {
		      horarioInicio = 24 - horarioInicio;
		      int soma = horarioInicio + horarioFim;
		      System.out.println("O total de horas jogadas foram "+ soma+" horas");
		   }
 
	}
}
