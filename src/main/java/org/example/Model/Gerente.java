package org.example.Model;

/**
 * Clase que representa un gerente,
 * implementa la clase Autenticable (Inicio de Sesión)
 * @author Keren Mitsue Ramírez Vergara
 */
public class Gerente extends Funcionario implements Autenticable {
    private AutenticacionUtil util;

    public Gerente(){
        super();
        util = new AutenticacionUtil();
    }

    public String getClave() {
        return this.util.getClave();
    }

    @Override
    public void setClave(String clave) {
        this.setClave( clave );
    }


    /**
     * Método que retorna la bonificación correspondiente del gerente
     * @return bonificación correspondiente del gerente
     */
    public double getBoniticacion() {
        System.out.println("EJECUTANDO DESDE GERENTE");
        return 2000;
    }

    /**
     *
     * @param clave
     * @return boolean
     */
    @Override
    public boolean iniciarSesion(String clave){
      return this.util.iniciarSesion( clave );
    }

    /**
     *
     * @return salario con la bonificación correspondiente (5% del salario)
     */
    @Override
    public double getBonificacion(){

        return super.getSalario() +this.getSalario()* 0.05;
    }
}
