package sample;

import sample.model.Cliente;
import sample.model.Funcionario;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Manu");
        funcionario.setSobrenome("Oliveira");
        funcionario.setEmail("manu_oliveira@estudante.sc.senai.br");
        funcionario.setTelefone("48-998846831");
        funcionario.setFuncao("Assistente de Marketing");
        funcionario.setSalario(80, 12);
        System.out.println(funcionario);
        Cliente cliente = new Cliente("Josiane", "pereira", "josiane_pereira@hotmail.com",
        "48991267529", "05/08/2000");
        System.out.println(cliente);
    }
}