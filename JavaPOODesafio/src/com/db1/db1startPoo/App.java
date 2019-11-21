package com.db1.db1startPoo;

public class App {

    public static void main(String[] args) {

        ContaCorrente contacorrente1 = new ContaCorrente(1,0.0);
        ContaCorrente contacorrente2 = new ContaCorrente(2,0.0);

        System.out.println("--------------Banco DB1--------------");
        System.out.println("Saldos iniciais" );
        System.out.println("Primeira conta: " + contacorrente1.getSaldo());
        System.out.println("Segunda conta: " + contacorrente2.getSaldo());

        contacorrente1.depositar(50.5);
        contacorrente2.depositar(125.5);

        System.out.println("\nApós depósito: ");
        System.out.println("Saldo da primeira conta: " + contacorrente1.getSaldo());
        System.out.println("Saldo da segunda conta: "+ contacorrente2.getSaldo());

        contacorrente1.sacar(15.0);
        contacorrente2.sacar(30.0);

        System.out.println("\nApós saque: ");
        System.out.println("Saldo da primeira conta: " + contacorrente1.getSaldo());
        System.out.println("Saldo da segunda conta: "+ contacorrente2.getSaldo());

        contacorrente1.transferir(contacorrente2,10.0);

        System.out.println("\nSaldos após primeiro depósito");
        System.out.println("Saldo da primeira conta: " + contacorrente1.getSaldo());
        System.out.println("Saldo da segunda conta: "+ contacorrente2.getSaldo());

        contacorrente2.transferir(contacorrente1, 10.0);

        System.out.println("\nExtrato da conta corrente 1: " + contacorrente1.extrato());
        System.out.println("\nExtrato da conta corrente 2: " + contacorrente2.extrato());
    }

}
