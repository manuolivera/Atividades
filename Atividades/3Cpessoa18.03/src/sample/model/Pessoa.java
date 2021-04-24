package sample.model;

public abstract class Pessoa {
//atributos
    String nome;
    Endereco endereco;

    public Pessoa(String nome) {
        this.nome = nome;
    }
    public Pessoa() {
    }

    //getting and setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(String rua, String bairro, String cep, int num) {
        Endereco endereco = new Endereco(rua, bairro, cep, num);
        this.endereco = endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }


    @Override
    public String toString() {
        return "Nome: " + nome + endereco + "\n";
    }
}

