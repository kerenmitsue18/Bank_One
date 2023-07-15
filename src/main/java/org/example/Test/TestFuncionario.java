package org.example.Test;

import org.example.Model.Funcionario;
import org.example.Model.Contador;
import org.example.Model.Gerente;

public class TestFuncionario {

    public static void main(String[] args) {
        Funcionario diego = new Contador();
        diego.setDocumento("Diego");
        diego.setDocumento("444556665");
        diego.setSalario(2000);

        Funcionario alexis = new Gerente();
        diego.setSalario( 50000 );

        System.out.println(diego.getSalario());
        System.out.println(diego.getBonificacion());
    }
}
