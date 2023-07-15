package org.example.Model;

/**
 * Clase que representa un contador
 * @author Keren Mitsue Ramírez Vergara
 */
public class Contador extends Funcionario {

    /**
     * Método que retorna la bonificación que le corresponde a un contador
     * @return bonificación de un contador
     */
    public double getBonificacion(){
        System.out.println("Llamando metodo del contador");
        return 200;
    }
}
