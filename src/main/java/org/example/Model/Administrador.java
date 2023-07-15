package org.example.Model;

/**
 * Clase que representa un administrador que es un Funcionario,
 * implementa la clase autenticable
 * @author Keren Mitsue Ramírez Vergara
 */
public class Administrador extends Funcionario implements Autenticable{


    private AutenticacionUtil util;

    public Administrador(){
        util = new AutenticacionUtil();
    }

    @Override
    public double getBonificacion() {
        return this.getSalario();
    }

    /**
     * Método que permite verificar el inicio se sesión de un administrador
     * @param clave
     * @return boolean
     */
    @Override
    public boolean iniciarSesion(String clave) {
            return this.util.iniciarSesion( clave );
    }

    @Override
    public void setClave(String clave) {
        this.setClave( clave );
    }
}
