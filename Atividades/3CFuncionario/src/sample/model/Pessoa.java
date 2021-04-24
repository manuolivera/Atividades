package sample.model;

public abstract class Pessoa {
    //atributos
    private String nome;
    private String sobrenome;
    private String email;
    private String telefone;

    public Pessoa(String nome, String sobrenome, String email, String telefone) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.telefone = telefone;
    }
    //getting and setter
    public Pessoa() {
    }
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
//toString
    public String toString() {
        return "nome: " + this.nome + ", sobrenome: " + this.sobrenome + ", email: " + this.email + ", telefone='" + this.telefone;
    }
}