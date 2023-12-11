package manzano;

import java.util.Scanner;

public class exerc03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de votos válidos para o candidato A: ");
        int votosCandidatoA = scanner.nextInt();
        System.out.println("Digite a quantidade de votos válidos para o candidato B: ");
        int votosCandidatoB = scanner.nextInt();
        System.out.println("Digite a quantidade de votos válidos para o candidato C: ");
        int votosCandidatoC = scanner.nextInt();
        System.out.println("Digite a quantidade de votos nulos: ");
        int votosNulos = scanner.nextInt();
        System.out.println("Digite a quantidade de votos em branco: ");
        int votosBranco = scanner.nextInt();


        int totalVotos = votosCandidatoA + votosCandidatoB + votosCandidatoC + votosNulos + votosBranco;


        double percentualVotosValidos = ((double) (votosCandidatoA + votosCandidatoB + votosCandidatoC) / totalVotos) * 100;
        double percentualCandidatoA = ((double) votosCandidatoA / totalVotos) * 100;
        double percentualCandidatoB = ((double) votosCandidatoB / totalVotos) * 100;
        double percentualCandidatoC = ((double) votosCandidatoC / totalVotos) * 100;
        double percentualNulos = ((double) votosNulos / totalVotos) * 100;
        double percentualBranco = ((double) votosBranco / totalVotos) * 100;

        System.out.println("Número total de eleitores: " + totalVotos);
        System.out.println("Percentual de votos válidos em relação à quantidade de eleitores: " + percentualVotosValidos + "%");
        System.out.println("Percentual de votos do candidato A em relação à quantidade de eleitores: " + percentualCandidatoA + "%");
        System.out.println("Percentual de votos do candidato B em relação à quantidade de eleitores: " + percentualCandidatoB + "%");
        System.out.println("Percentual de votos do candidato C em relação à quantidade de eleitores: " + percentualCandidatoC + "%");
        System.out.println("Percentual de votos nulos em relação à quantidade de eleitores: " + percentualNulos + "%");
        System.out.println("Percentual de votos em branco em relação à quantidade de eleitores: " + percentualBranco + "%");
    }
}
