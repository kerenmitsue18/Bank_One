package org.example.Model;

import org.example.Model.Autenticable;

/**
 * CLase que represente el sistema interno para dar inicio de sesión
 * @author Keren Mitsue Ramírez Vergara
 */
public class SistemaInterno {

    private String clave = "12345";

    /**
     * Método que verifica la autenticación de inicio de sesión
     * @param gerente
     */
    public void autentica(Autenticable gerente){
        boolean puedeIniciarSesion = gerente.iniciarSesion(clave);
        if (puedeIniciarSesion){
            System.out.println("Login exitoso");
        }else {
            System.out.println( "Error en login" );
        }
    }

}
