package com.db1.db1startPoo;

import org.junit.Assert;
import org.junit.Test;

public class ContaCorrenteTest {

    @Test
    public void deveDepositar(){

        ContaCorrente contacorrente1 = new ContaCorrente(1,0.5);
        contacorrente1.depositar(10.0);
        contacorrente1.saldo = 11.0;

        Assert.assertEquals(contacorrente1.saldo, contacorrente1.getSaldo());
    }

    @Test
    public void deveSacar(){

        ContaCorrente contacorrente1 = new ContaCorrente(1,10.0);
        contacorrente1.sacar(5.0);
        contacorrente1.saldo = 5.0;

        Assert.assertEquals(contacorrente1.saldo, contacorrente1.getSaldo());

    }

//    @Test
//    public void deveTransferir(){
//        ContaCorrente contacorrente1 = new ContaCorrente(1,10.0);
//        ContaCorrente contacorrente2 = new ContaCorrente(1,10.0);
//        contacorrente1.transferir(contacorrente1, 10.0);
//
//        Assert.assertEquals();
//    }
}
