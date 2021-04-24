package sample;


import sample.model.Endereco;
import sample.model.Pessoa;

public class Main {



    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Sete de setembro");
        System.out.println(endereco.getRua());
        endereco.setBairro("Centro");
        System.out.println("Bairro:" + endereco.getBairro());
        endereco.setNumero(109);
        System.out.println("Numero:" + endereco.getNumero());
         endereco.setCidade("Patobranco");
        System.out.println( "Cidade:" + endereco.getCidade());

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("João");
        pessoa.setDataNascimento("19/10/2004");


        System.out.println("Pessoa:" + pessoa.getNome());
        System.out.println("Nascimento:" + pessoa.getDataNascimento());




        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Maria");
        pessoa2.setDataNascimento("12/06/2000");
        pessoa2.setEndereco("Rio Branco", 354, "Centro", "Florianópolis");
        System.out.println(pessoa2);

    }

    }



