package listaOO;

import java.time.LocalDate;

public class Carro {

    private String modelo;
    private String ano;
    private String cor;
    private boolean ligado;

    public Carro(String modelo, String ano, String cor) {
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.ligado = false;
    }

    public void ligarCarro(){
        if (!ligado){
            ligado = true;
            System.out.println("O veículo foi ligado.");
        } else {
            System.out.println("O veículo já está ligado");
        }
    }

    public void desligarCarro(){
        if (ligado){
            ligado = false;
            System.out.println("O veículo foi desligado.");
        } else {
            System.out.println("O veículo já está desligado.");
        }
    }

    public void exibirInformacoes(){
        System.out.println("Informações do veículo: ");
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
        System.out.println("Status: " + (ligado ? "ligado" : "desligado"));
    }

    public static void main(String[] args) {
        Carro carro = new Carro("Ferrari","2022","Vermelho");

        carro.ligarCarro();
        carro.exibirInformacoes();

        carro.desligarCarro();
        carro.exibirInformacoes();
    }
}
