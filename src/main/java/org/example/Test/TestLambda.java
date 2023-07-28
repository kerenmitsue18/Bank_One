package org.example.Test;

import org.example.Model.Cliente;
import org.example.Model.Cuenta;
import org.example.Model.CuentaAhorros;
import org.example.Model.CuentaCorriente;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestLambda {

    public static void main(String[] args) {

        Cuenta cc1 = new CuentaCorriente(62, 33);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNombre("Diego");
        cc1.setTitular(clienteCC1);
        cc1.depositar(333.0);

        Cuenta cc2 = new CuentaAhorros(32, 44);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNombre("Renato");
        cc2.setTitular(clienteCC2);
        cc2.depositar(444.0);

        Cuenta cc3 = new CuentaCorriente(22, 11);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNombre("Liam");
        cc3.setTitular(clienteCC3);
        cc3.depositar(111.0);

        Cuenta cc4 = new CuentaAhorros(2, 22);
        Cliente clienteCC4 = new Cliente();
        clienteCC4.setNombre("Noel");
        cc4.setTitular(clienteCC4);
        cc4.depositar(222.0);

        List<Cuenta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        System.out.println("Antes de ordenar");
        for (Cuenta cuenta : lista) {
            System.out.println(cuenta);
        }

        lista.sort( (Cuenta o1, Cuenta o2) -> Integer.compare( o1.getNumero(), o2.getNumero() ) );


        System.out.println("Despues de ordenar");
        for (Cuenta cuenta : lista) {
            System.out.println(cuenta);
        }

        Collections.sort(lista, (c1, c2) ->
                c1.getTitular().getNombre().compareTo(c2.getTitular().getNombre())
        );


        System.out.println("Despues de ordenar por nombre titular");
//	    for (Cuenta cuenta : lista) {
//	    	System.out.println(cuenta);
//	    }

        lista.forEach(cuenta -> System.out.println(cuenta));
        
        System.out.println("Despues de ordenar por orden natural");
        for (Cuenta cuenta : lista) {
            System.out.println(cuenta);
        }
    }
}
