package org.example.Model;

import org.example.Exception.SaldoInsuficienteException;
import org.example.Model.Cuenta;

/**
 * Clase que representa una cuenta corriente
 * @author Keren Mitsue Ramírez Vergara
 */
public class CuentaCorriente extends Cuenta {

    /**
     * Constructor de una cuenta corriente
     * @param agencia
     * @param numero
     */
    public CuentaCorriente(int agencia, int numero) {
        super(agencia, numero);
    }

    /**
     * Método para retirar dinero en una cuenta corriente
     * @param valor
     * @throws SaldoInsuficienteException
     */
    @Override
    public void retirar(double valor) throws SaldoInsuficienteException {
        double comision = 0.2;
        super.retirar( valor + comision );
    }

    /**
     * Método para depositar dinero en la cuenta corriente
     * @param valor
     */
    @Override
    public void depositar(double valor){
        //
    }
}
