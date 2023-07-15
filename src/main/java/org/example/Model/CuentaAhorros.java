package org.example.Model;

import org.example.Model.Cuenta;

/**
 * Clase que representa una cuenta de Ahorros
 * @author Keren Mitsue Ramírez Vergara
 */
public class CuentaAhorros extends Cuenta {

    /**
     * Constructor de una cuenta de ahorros
     * @param agencia
     * @param numero
     */
    public CuentaAhorros(int agencia, int numero){
        super(agencia,numero);
    }

    /**
     * Método para depositar dinero a la cuenta de ahorros
     * @param valor
     */
    @Override
    public void depositar(double valor){
        this.setSaldo( this.getSaldo() + valor);
    }

}
