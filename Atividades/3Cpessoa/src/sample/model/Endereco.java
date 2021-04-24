package sample.model;

public class Endereco {

    //atributos
   private String rua;
   private String bairro;
   private int numero;
   private String cidade;

   //getting and setter
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    //to string
    public String toString (){
        return "Endereco:" + rua+ ",n ." + numero + ",Bairro" + bairro
                +"\nCidade:" + cidade;
    }
}


