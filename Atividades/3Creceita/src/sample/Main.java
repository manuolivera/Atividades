package sample;

import sample.model.Receita;

public class Main{

    public static void main(String[] args) {
        Receita receita = new Receita();
        receita.setNome("Bolo da Dona josi");
        receita.setDescricao("Foi a Valentina que fez");
        receita.setIngrediente("Farinha", 300, "g");
        receita.setIngrediente("outros", 200, "g");
        System.out.println(receita);

    }
}