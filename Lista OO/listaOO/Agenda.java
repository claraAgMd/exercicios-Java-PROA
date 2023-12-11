package listaOO;

import java.util.HashMap;
import java.util.Map;

public class Agenda {

    private Map<String, String> contatos;

    public Agenda() {
        this.contatos = new HashMap<>();
    }

    public void adicionarContato(String nome, String numero) {
        contatos.put(nome, numero);
        System.out.println("O contato " + nome + " foi adicionado");
    }

    public void removerContato(String nome) {
        if (contatos.containsKey(nome)) {
            contatos.remove(nome);
            System.out.println("O contato " + nome + " removido.");
        } else {
            System.out.println("O contato " + nome + " não está registrado na agenda.");
        }
    }

    public void exibirContatos() {
        if (!contatos.isEmpty()) {
            System.out.println("Lista de Contatos:");
            for (Map.Entry<String, String> entry : contatos.entrySet()) {
                System.out.println("Nome: " + entry.getKey() + ", Telefone: " + entry.getValue());
            }
        } else {
            System.out.println("A agenda está vazia.");
        }
    }

    public static void main(String[] args) {
        Agenda minhaAgenda = new Agenda();

        minhaAgenda.adicionarContato("Ana", "950102378");
        minhaAgenda.adicionarContato("Paulo", "926304127");

        minhaAgenda.exibirContatos();

        minhaAgenda.removerContato("Ana");

        minhaAgenda.exibirContatos();
    }

}