package sample;

import sample.model.Caminhao;
import sample.model.Carro;

public class Main {

    public static void main(String[] args) {

        Carro carro = new Carro("Hb20");
        carro.setMarca("hyundai", "A empresa.....");
        carro.setDesc("Carro da dona josi");
        carro.setnPortas(4);
        System.out.println(carro + "\n\n");

        Carro carro2 = new Carro("Argo");
        carro2.setMarca("Fiat","A empresa.....");
        carro.setDesc("Carro da vó");
        carro2.setnPortas(4);
        System.out.println(carro2 + "\n\n");

        Caminhao caminhao = new Caminhao("S460");
        caminhao.setMarca("Scania", "A empresa.....");
        caminhao.setnEixos(6);
        System.out.println(caminhao + "\n\n");

    }
}