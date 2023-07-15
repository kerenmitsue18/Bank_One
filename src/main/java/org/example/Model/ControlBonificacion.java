package org.example.Model;

import org.example.Model.Funcionario;

/**
 * Clase que representa el control de las bonificaciones
 * @author Keren Mitsue Ramírez Vergara
 */
public class ControlBonificacion {

    private double suma;

    /**
     * Método registra el salario de un funcionario
     * @param funcionario
     * @return salario total que contiene la bonificación
     */
    public double registrarSalario(Funcionario funcionario){
        this.suma = funcionario.getBonificacion() + this.suma;
        System.out.println("Calculo actual: "+ this.suma);
        return this.suma;
    }
}
