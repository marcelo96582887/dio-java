package br.eti.mrs.dioJava.heranca;

public class Main {

    public static void main(String[] args) {

        // Vamos fazer testes com herança em java. Pai herda Pessoa, portanto
        // podemos dizer que o Pai e uma Pessoa e uma Pessoa pode ser um Pai.
        // Porém quando Pessoa e um Pai, ela so conhece os metodos de Pessoa (lembrando que Pai herdou de Pessoa)

        Pai pai = new Pai();
        pai.setNome("Joao");
        pai.setIdade(38);
        pai.setCpf("44444444444");
        pai.setQtdeFilhos(2);
        System.out.println("Nome do pai: " + pai.getNome());
        System.out.println("Idade: " + pai.getIdade());
        System.out.println("Cpf: " + pai.getCpf());
        System.out.println("Qtde filhos: " + pai.getQtdeFilhos());


        Pessoa pessoa = new Pai();
        pessoa.setNome("Marcelo");
        pessoa.setIdade(36);
//        pessoa.setCpf("55555555555");   ---- se fizer isto da erro, porque setCpf e um metodo de Pai
        System.out.println("\nNome da pessoa: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
    }
}
