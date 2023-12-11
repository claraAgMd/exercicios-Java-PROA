package FaccatJava;

import java.util.Scanner;

public class Exerc19 {
	public static void main(String[]args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe quantas horas foram trabalhadas esta semana!");
		float horarioSemanal = leia.nextFloat();
		System.out.println("Informe quanto você recebe por hora");
		float salarioPorHora = leia.nextFloat();
		float salarioSemanal= 0;
		float salarioFinal = 0;
		for(int semana = 1; semana < 5; semana++) {
			if(horarioSemanal < 40) {
				System.out.println("Ainda não foram completadas suas horas de trabalho");
			} else {
				if(horarioSemanal > 40) {
					float horaExtra = horarioSemanal - 40;
					float salarioExtra = salarioPorHora/2;
					salarioSemanal = (horarioSemanal*salarioPorHora)+(horaExtra*salarioExtra);
				} else {
					salarioSemanal = (horarioSemanal*salarioPorHora);
				}
				salarioFinal =+ salarioSemanal;
			}			
		}
		System.out.println("Seu salário final foi de: " + salarioFinal + "R$");
	}
}
