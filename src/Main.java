public class Main {
    public static void main(String[] args){
        PilhaDePessoas pilha = new PilhaDePessoas();

        pilha.adicionarPessoa(new Pessoa("Lucas", 28));
        pilha.adicionarPessoa(new Pessoa("Andrea", 39));
        pilha.adicionarPessoa(new Pessoa("Jose", 40));
        pilha.adicionarPessoa(new Pessoa("Adryan", 21));
        pilha.adicionarPessoa(new Pessoa("Maria", 22));


        Pessoa pessoaRemovida1 = pilha.removerPessoa();
        Pessoa pessoaRemovida2 = pilha.removerPessoa();

        System.out.println("Pessoas removidas:");
        System.out.println("1. Nome: " + pessoaRemovida1.getNome() + ", Idade: " + pessoaRemovida1.getIdade());
        System.out.println("2. Nome: " + pessoaRemovida2.getNome() + ", Idade: " + pessoaRemovida2.getIdade());

    }
}