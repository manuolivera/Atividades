package sample;

import sample.model.Cliente;
import sample.model.Conta;

public class MainCliente {

    public static void main(String[] args) {
        Conta conta = new Conta(1208, 3010);
        conta.depositar(3000);

        Cliente cliente = new Cliente();
        cliente.setConta(conta);
        cliente.setNome("Manu");
        cliente.setCpf("154.098.967-15");

        System.out.println(cliente);
    }
}
