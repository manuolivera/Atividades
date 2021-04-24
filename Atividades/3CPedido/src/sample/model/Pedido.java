package sample.model;

public class Pedido {
    //ATRIBUTOS
    private String desc;
    private String data;
    private double total;
    private itensDoPedido itens;

    public Pedido(){
        itens = new itensDoPedido();
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public double getTotal() {
        return total;
    }
    public void addProduto(String nomeProduto, double preco){
        itens.setProduto(nomeProduto, preco);
        total += preco;
    }
  //TOSTRING
    public String toString(){
        return "Pedido\n"
                +  desc
                + " Data: " + data + "\n"
                + itens
                + "\nTotal:" + total;
    }




}
