package sample.model;

public final class Endereco {
    //atributos
    private String rua;
    private String bairro;
    private String cep;
    private int num;

    //sobrecarga
    public Endereco(String rua, String bairro, String cep, int num) {
        this.rua = rua;
        this.bairro = bairro;
        this.cep = cep;
        this.num = num;
    }

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

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return " \nEndereço: "
                + " rua = " + rua
                + ", bairro = " + bairro
                + ", cep = " + cep
                + ", num = " + num;
    }
}
