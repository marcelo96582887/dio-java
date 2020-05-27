package br.eti.mrs.dioJava.polimorfismo;

public class Main {

    // Exemplo de polimorfismo: Neste caso temos uma classe Animal do tipo abstract
    // que e estendida pelas classes Cao e Tigre. A grande jogada do polimorfismo esta
    // no metodo getAlimento de Main, pois ele recebe como parametro um Animal
    // quer por sua vez, Cao e Tigre são animais, portanto, ao executar o metodo
    // animal.getAlimento ele se refere a instancia do Cao e do Tigre e não a classe Animal
    // utilizada no parametro da classe.

    public static String getAlimento(Animal animal){
        return animal.getAlimento();
    }

    public static void main(String[] args) {

        Cao cao = new Cao();
        Tigre tigre = new Tigre();

        System.out.println("Alimento preferido: " + Main.getAlimento(cao));
        System.out.println("Alimento preferido: " + Main.getAlimento(tigre));
    }
}
