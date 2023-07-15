package org.example;

import org.example.Model.Administrador;
import org.example.Model.Gerente;
import org.example.Model.SistemaInterno;

public class Main {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setNombre("Marco");
        g1.setDocumento("235568413");
        g1.setSalario(5000.0);

        System.out.println(g1.getNombre());
        System.out.println(g1.getDocumento());
        System.out.println(g1.getSalario());

        g1.setClave(String.valueOf(2222));

        System.out.println(g1.getBonificacion());

        Gerente g = new Gerente ();
        g.setClave("12345");

        SistemaInterno si = new SistemaInterno();
        si.autentica(g);

        SistemaInterno sistema = new SistemaInterno();
        Gerente gerente1 = new Gerente();
        Administrador admin = new Administrador();

        sistema.autentica(gerente1);
        sistema.autentica(admin);

    }
}