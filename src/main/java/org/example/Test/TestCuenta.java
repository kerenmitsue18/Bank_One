package org.example.Test;

import org.example.Model.CuentaAhorros;
import org.example.Model.CuentaCorriente;
import org.example.Exception.SaldoInsuficienteException;

public class TestCuenta {

    public static void main(String[] args) {
        CuentaCorriente cc = new CuentaCorriente(1, 1);
        CuentaAhorros ca = new CuentaAhorros(2, 3);
        cc.depositar(2000);
        try {
            cc.retirar( 210 );
        } catch (SaldoInsuficienteException e) {
           System.out.println(e.getMessage());
        }
        cc.transferir(1000, ca);


        System.out.println(cc.getSaldo());
        System.out.println(ca.getSaldo());
    }
}
