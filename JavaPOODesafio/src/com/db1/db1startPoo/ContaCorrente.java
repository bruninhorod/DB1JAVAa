package com.db1.db1startPoo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class ContaCorrente {

    public Integer idContaCorrente;
    public Double saldo = 0.0 ;
    List<String> extrato = new ArrayList<>();
    List<LocalDate> dataOperacoes = new ArrayList<>();

    public ContaCorrente(Integer idContaCorrente, Double saldo) {
        this.idContaCorrente = idContaCorrente;
        this.saldo = saldo;

    }

    public void depositar(Double deposito){
        saldo = saldo + deposito;
        extrato.add("Depósito de " + deposito + " reais feito");
    }

    public void sacar(Double saque){
        if (saldo > saque) {
            saldo = saldo - saque;
            extrato.add("Saque de " + saque + " reais feito");
        }else
            throw new Exception("Você não tem esse valor de saldo");
    }

    public void setSaldo(Double saldo){
        this.saldo = saldo;
    }

    public Double getSaldo(){
        return saldo;
    }

    public void transferir(ContaCorrente conta, Double valor) {
        if (valor < saldo) {
            conta.sacar(valor);
            depositar(valor);
            extrato.add("Transferência de " + valor + " feita");
        }else {
            throw new Exception("Você não tem esse valor para transferência: ");
        }
    }

    public void separar(){
        System.out.println("-----------------------------");
    }

    public List<String> extrato(){
         return extrato;
    }
}
