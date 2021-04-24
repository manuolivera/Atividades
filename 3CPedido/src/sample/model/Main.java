package sample.model;

import sample.model.itensDoPedido;
import sample.model.Pedido;
import sample.model.Produto;

public class Main {

    public static void main(String[] args) {

        Pedido pedido = new Pedido();
        pedido.setDesc("iFood");
        pedido.setData("11/03/21");
        pedido.addProduto("Uva", 5.4);
        pedido.addProduto("Laranja", 2.6);
        pedido.addProduto("Banana", 1.6);

        System.out.println(pedido);
    }
}

