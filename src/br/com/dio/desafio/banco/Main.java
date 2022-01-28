package br.com.dio.desafio.banco;

import domain.Cliente;
import domain.Conta;
import domain.ContaCorrente;
import domain.ContaPoupança;

public class Main {
    public static void main(String[] args) {

        Cliente dalcimar = new Cliente();
        dalcimar.setNome("dalcimar");

        Conta cc = new ContaCorrente(dalcimar);

        cc.depositar(200);

        Conta poupanca = new ContaPoupança(dalcimar);

        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
