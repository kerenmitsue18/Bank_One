package org.example.Model;

/**
 * Clase que representa a un cliente en ByteBank
 * @author Keren Mitsue Ramírez Vergara
 */
public class Cliente implements Autenticable {
    private String nombre;
    private String telefono;
    private String documento;
    private String clave;

    public AutenticacionUtil autUtil;

    public Cliente(){
        this.autUtil = new AutenticacionUtil();
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getClave() {
        return clave;
    }

    @Override
    public boolean iniciarSesion(String clave) {
      return this.autUtil.iniciarSesion( clave );
    }

    @Override
    public void setClave(String clave) {
        this.setClave( clave );
    }

}
