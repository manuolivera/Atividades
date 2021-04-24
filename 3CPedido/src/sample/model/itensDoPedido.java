package sample.model;

import java.util.ArrayList;
import java.util.List;

public class itensDoPedido {
    private List<Produto> produtos;

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProduto(Produto produto){
        if(this.produtos == null){
            this.produtos = new ArrayList<>();
        }

        produtos.add(produto);
    }

    public void setProduto(String nomeProduto, double preco) {
        if(this.produtos == null){
            this.produtos = new ArrayList<>();
        }

        Produto produto = new Produto();
        produto.setNome(nomeProduto);
        produto.setPreco(preco);
        this.produtos.add(produto);
    }
   //TO STRING
    @Override
    public String toString() {
        return produtos.toString();
    }
}