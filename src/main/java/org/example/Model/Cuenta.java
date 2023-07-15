package org.example.Model;

import org.example.Exception.SaldoInsuficienteException;

/**
 * Clase abstracta que representa una cuenta en byteBank
 * @author Keren Mitsue Ramírez Vergara
 */
public abstract class Cuenta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular = new Cliente();

    private static int total = 0;

    public Cuenta(){}

    /**
     * COnstructor de cuenta
     * @param agencia
     * @param numero
     */
    public Cuenta(int agencia, int numero){
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Estoy creando una cuenta " + this.numero);
        Cuenta.total ++;
    }

    public abstract void depositar(double valor);

    /**
     * Método que retira dinero de una cuenta
     * @param valor
     * @throws SaldoInsuficienteException
     */
    public void retirar(double valor) throws SaldoInsuficienteException {
        if (this.saldo < valor){
            throw new SaldoInsuficienteException( "No cuentas con saldo suficiente" );
        }
        this.saldo -= valor;
    }

    /**
     * Método que permite trasferir dinero de una cuenta a otra
     * @param valor
     * @param cuenta
     * @return boolean
     */
    public boolean transferir(double valor, Cuenta cuenta){
        if(this.saldo >= valor){
            this.saldo =- valor;
            cuenta.depositar(valor);
            return true;
        }else
            return false;
    }


    public void setAgencia(int agencia) {
        if (agencia>0)
            this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return total;
    }
}
