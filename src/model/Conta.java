package model;

public class Conta {

           private int numero;
           private Double saldo;

           public void depositar(Double quantia){
               this.saldo += quantia;
           }

    public Double getSaldo() {
        return saldo;
    }

    public Conta(int numero, Double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public void retirar(Double saldo){
               this.saldo -= saldo;
          }

    public int getNumero() {
        return numero;
    }
}
