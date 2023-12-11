package listaOO;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void realizarCompra(int quantidadeComprada) {
        if (quantidadeComprada > 0) {
            quantidadeEmEstoque += quantidadeComprada;
            System.out.println(quantidadeComprada + " unidades de " + nome + " adicionadas ao estoque.");
        } else {
            System.out.println("Quantidade inválida para compra.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Detalhes do Produto:");
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Quantidade Disponível: " + quantidadeEmEstoque);
    }

    public static void main(String[] args) {
        Produto produto = new Produto("Teclado Mecânico", 150.0, 50);

        produto.exibirInformacoes();

        produto.realizarCompra(10);

        produto.exibirInformacoes();
    }
}
