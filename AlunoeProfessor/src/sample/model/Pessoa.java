package sample.model;

public abstract class Pessoa {
    //atributos
    String nome;


    //getting and setter
    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}
