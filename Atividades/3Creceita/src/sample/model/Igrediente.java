package sample.model;

public class Igrediente { private String nome;
   //ATRIBUTOS
    private double qtde;
    private String um;

//getting and setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getQtde() {
        return qtde;
    }

    public void setQtde(double qtde) {
        this.qtde = qtde;
    }

    public String getUm() {
        return um;
    }

    public void setUm(String um) {
        this.um = um;
    }

    @Override
    public String toString() {
        return "Ingrediente{" +
                "nome='" + nome + '\'' +
                ", qtde=" + qtde +
                ", um='" + um + '\'' +
                '}';
    }
}
