package br.eti.mrs.dioJava.heranca;

public class Pai extends Pessoa{

    private String cpf;
    private int qtdeFilhos;

    public Pai(){
        super();
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getQtdeFilhos() {
        return qtdeFilhos;
    }

    public void setQtdeFilhos(int qtdeFilhos) {
        this.qtdeFilhos = qtdeFilhos;
    }
}
