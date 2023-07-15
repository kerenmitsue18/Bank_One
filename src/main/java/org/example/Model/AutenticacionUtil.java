package org.example.Model;

/**
 * Clase que realiza una autenticación
 * @author Keren Mitsue Ramírez Vergara
 */
public class AutenticacionUtil {

    private String clave;

    /**
     * Método que verifica el inicio de sesión
     * @param clave
     * @return boolean
     */
    public boolean iniciarSesion(String clave){

        return this.clave == clave;
    }

    /**
     * Método que modifica la clave de acceso
     * @param clave
     */
    public void setClave(String clave){
        this.clave = clave;
    }

    public String getClave() {
        return clave;
    }
}
