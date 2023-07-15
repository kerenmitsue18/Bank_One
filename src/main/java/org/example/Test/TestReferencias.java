package org.example.Test;

import org.example.Model.Funcionario;
import org.example.Model.Gerente;

public class TestReferencias {
    public static void main(String[] args) {

        // Elemento mas generico puede ser adaptado
        //                     al elemento mas especifico
        Funcionario funcionario = new Gerente();
        funcionario.setNombre("Diego");

        Gerente gerente = new Gerente();
        gerente.setNombre("Jimena");

        funcionario.setSalario(2000);
        gerente.setSalario(10000);

        gerente.iniciarSesion("_ddddd");

    }

}
