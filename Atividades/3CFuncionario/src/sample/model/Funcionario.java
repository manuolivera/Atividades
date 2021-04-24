package sample.model;

public final class Funcionario extends Pessoa {
    //atributos
    private String funcao;
    private double salario;

    public Funcionario(String nome, String sobrenome, String email, String telefone, String funcao, double salario) {
        super(nome, sobrenome, email, telefone);
        this.funcao = funcao;
        this.salario = salario;
    }
    public Funcionario(String nome, String sobrenome, String email, String telefone) {
        super(nome, sobrenome, email, telefone);
    }
    //getting and setter
    public Funcionario() {
    }
    public String getFuncao() {
        return this.funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public double setSalario(double valorDaHora, double horasTrab) {
        this.salario = horasTrab * valorDaHora;
        return this.salario;
    }
    public void getSalario(double salario) {
        this.salario = salario;
    }

    public String toString() {
        return "---Funcionario---\n" + super.toString() + "\nfuncao: " + this.funcao + ", salario: " + this.salario;
    }
}