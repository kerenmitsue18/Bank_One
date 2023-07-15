package org.example.Test;

import org.example.Model.ControlBonificacion;
import org.example.Model.Funcionario;
import org.example.Model.Contador;
import org.example.Model.Gerente;

public class TestControlBonificacion {
    public static void main(String[] args) {
        Funcionario diego = new Gerente();
        diego.setSalario(2000);

        Gerente jimena = new Gerente();
        jimena.setSalario(10000);

        Contador alexiz = new Contador();
        alexiz.setSalario(5000);

        ControlBonificacion controlBonificacion =
                new ControlBonificacion();

        controlBonificacion.registrarSalario(diego);
        controlBonificacion.registrarSalario(jimena);
        controlBonificacion.registrarSalario(alexiz);
    }

}
