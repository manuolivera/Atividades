package sample.model;

public final class PessoaFisica extends Pessoa{
   //atributos
    String cpf;
    String rg;

    //Sobrecarga
    public PessoaFisica(String nome, String cpf, String rg) {
        super(nome);
        this.cpf = cpf;
        this.rg = rg;
    }
    public PessoaFisica(String nome) {
        super(nome);
    }

//getting and setter
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }


    @Override
    public String toString() {
        return "---Pessoa Fisica---\n" + super.toString() + "Cpf: " + cpf + ", rg: " + rg;
    }
}

