package org.example.Exception;

/**
 * Clase que representa una excepción por saldo insuficiente
 * @author Keren Mitsue Ramírez Vergara
 */
public class SaldoInsuficienteException extends Exception{

    /**
     * Método que retorna un mensaje cuando se ejecuta una excepción por saldo insuficiente
     * @param mensaje
     */
    public SaldoInsuficienteException(String mensaje){
        super(mensaje);
    }
}
