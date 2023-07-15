package org.example.Model;

/**
 * Interfaz que autentica el inicio de Sesión
 * @author Keren Mitsue Ramírez Vergara
 */
public interface Autenticable {


    public boolean iniciarSesion(String clave);

    public void setClave(String clave);

}
