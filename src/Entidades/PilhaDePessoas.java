package Entidades;


import java.util.LinkedList;

public class PilhaDePessoas {
    public LinkedList<Pessoa> listaDePessoas;

    public PilhaDePessoas() {
        listaDePessoas = new LinkedList<>();
    }

    public void adicionarPessoa(Pessoa pessoa) {
        listaDePessoas.push(pessoa);
    }

    public Pessoa removerPessoa() {
        if (verificarLista()) {
            System.out.println("A pilha está vazia. Não é possível remover.");
            return null;
        }
        return listaDePessoas.pop();
    }

    public boolean verificarLista() {
        return listaDePessoas.isEmpty();
    }
}


