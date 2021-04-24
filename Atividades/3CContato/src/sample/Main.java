package sample;

import sample.Pessoa;

public class Main {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Manu");
        pessoa.setContato("48-9984-85612", "emanuelli_oliveira@email", "@manufdss");
        System.out.println(pessoa);

    }
}