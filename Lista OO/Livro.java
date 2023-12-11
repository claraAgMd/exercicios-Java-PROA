package listaOO;

public class Livro {

    private String titulo;
    private String autor;
    private int paginas;

    public Livro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public void exibirInformacoes(){
        System.out.println("Detalhes do livro:");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de Páginas: " + paginas);
    }

    public static void main(String[] args){
        Livro livro = new Livro("Percy Jackson",
                "Rick Riordan",
                200);
        
        livro.exibirInformacoes();
    }
}
