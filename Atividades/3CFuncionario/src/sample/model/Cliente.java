package sample.model;

public final class Cliente extends Pessoa {
    String dataCad;

    public Cliente(String nome, String sobrenome, String email, String telefone, String dataCad) {
        super(nome, sobrenome, email, telefone);
        this.dataCad = dataCad;
    }

    public Cliente(String nome, String sobrenome, String email, String telefone) {
        super(nome, sobrenome, email, telefone);
    }

    public Cliente() {
    }

    public String getDataCad() {
        return this.dataCad;
    }

    public void setDtCad(String dtCad) {
        this.dataCad = dtCad;
    }

    public String toString() {
        return "---Cliente---\n" + super.toString() + "\ndtCad: " + this.dataCad;
    }
}