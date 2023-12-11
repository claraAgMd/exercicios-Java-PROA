package listaOO;

public class Circulo {

    private Ponto centro;
    private double raio;

    public Circulo(Ponto centro, double raio) {
        this.centro = centro;
        this.raio = raio;
    }
    public double calcularArea(){
        return Math.PI * Math.pow(raio, 2);
    }
    public double calcularPerimetro(){
        return 2 * Math.PI * raio;
    }

    public static void main(String[] args) {
        Ponto pontoCentral = new Ponto();
        Circulo circulo = new Circulo(pontoCentral, 5);
        System.out.println(" A área do círculo é: " + circulo.calcularArea());
        System.out.println("O perímetro do círculo é: " + circulo.calcularPerimetro());
    }
}