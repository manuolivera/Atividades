package sample.model;

public final class PessoaJuridica extends Pessoa{
 //ATRIBUTOS
    String cnpj;
    String ie;
//SOBRECARGA
    public PessoaJuridica(String nome, String cnpj, String ie) {
        super(nome);
        this.cnpj = cnpj;
        this.ie = ie;
    }
    public PessoaJuridica(String nome) {
        super(nome);
    }

    //getting and setter
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    @Override
    public String toString() {
        return "---Pessoa Juridica---\n" + super.toString() + "Cnpj: " + cnpj + ", ie: " + ie;
    }
}
