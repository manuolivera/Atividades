package sample.model;

public class Caminhao extends Veiculo{

    private int nEixos;

    public Caminhao(String nome) {
        super(nome);
    }

    public int getnEixos() {
        return nEixos;
    }
    public void setnEixos(int nEixos) {
        this.nEixos = nEixos;
    }

    @Override
    public String toString(){
        return super.toString() + "número de eixos: " + nEixos;
    }
}