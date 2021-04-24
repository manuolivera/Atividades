package sample.model;


public final class Carro extends Veiculo{

    //Atributo

    private int nPortas;


    public Carro(String nome){
        super(nome);
    }


    public int getnPortas() {
        return nPortas;
    }

    public void setnPortas(int nPortas) {
        this.nPortas = nPortas;
    }

    //TO STRING
    @Override
    public String toString() {
        return super.toString()
                + "Número de Portas: " + nPortas;
    }
}

