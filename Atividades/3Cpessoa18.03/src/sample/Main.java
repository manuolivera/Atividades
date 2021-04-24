package sample;

import sample.model.Endereco;
import sample.model.PessoaFisica;
import sample.model.PessoaJuridica;

public class Main {
    public static void main(String[] args) {
        PessoaFisica pessoaFisica = new PessoaFisica("Manu", "148.765.783.65", "70149");
        pessoaFisica.setEndereco("Frankilin e Cascaes", "Ponta das Canas", "88065960", 36);
        System.out.println(pessoaFisica + "\n");

        PessoaJuridica pessoaJuridica = new PessoaJuridica("Josi", "148.765.783.65", "70149");
        Endereco endereco = new Endereco("Frankilin e Cascaes", "Ponta das Canas", "88065960", 45);
        pessoaJuridica.setEndereco(endereco);
        System.out.println(pessoaJuridica);
    }
}

