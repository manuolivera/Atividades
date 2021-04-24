

package sample.model;

public class Produto {
    public String Nome;
    public double Preco;
    public int Quantidade;

    public Produto() {
    }

    public double ValorTotalEmEstoque() {
        return this.Preco * (double)this.Quantidade;
    }

    public void AdicionarProdutos(int quantidade) {
        this.Quantidade += quantidade;
    }

    public void RemoverProdutos(int quantidade) {
        this.Quantidade -= quantidade;
    }

    public String imprimir() {
        String var10000 = this.Nome;
        return var10000 + ", R$" + this.Preco + ", " + this.Quantidade + " Unidades, Total: R$ " + this.ValorTotalEmEstoque();
    }
}
