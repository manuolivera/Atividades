package sample;

public class Pessoa {
    //atributos
    private String nome;
    private Contato contato;

    public Pessoa(String nome){
        this.nome = nome;
        contato = new Contato();
    }
//getting and setter

    public String getNome() {
        return nome;
    }
    public Contato getContato() {
        return contato;
    }
    public void setContato(String whatsapp, String email, String twitter){
        contato.setWhatsapp(whatsapp);
        contato.setTwitter(twitter);
        contato.setEmail(email);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
//to string
    @Override
    public String toString(){
        return "Nome: " + this.nome + ", " + contato;
    }
}



