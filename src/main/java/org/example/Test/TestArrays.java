package org.example.Test;


import org.example.Model.Cuenta;
import org.example.Model.CuentaCorriente;

import java.util.*;
import java.util.ArrayList;

public class TestArrays {

    ArrayList<Cuenta> cuentas = new ArrayList<>();

    ArrayList<Cuenta> lista = new ArrayList<>();
    Cuenta cc = new CuentaCorriente( 11,22 );
    Cuenta cc2 = new CuentaCorriente( 13,42 );
    Cuenta cc3 = new CuentaCorriente( 11,22 );

    int[] numeros = new int[10];

    int numero = 40;
    Integer numObject = Integer.valueOf( 40 );
    ArrayList<Integer> listas = new ArrayList<Integer>();
    //listas.add(30);

    //unboxing
    // int valorPrimitivo  = numeroObjecto
    int valorPrimitivo = numObject.intValue();
    byte byteInteger = numObject.byteValue();
    double doubleInteger = numObject.doubleValue();


    //System.out.println(Integer.MAX_VALUE);
    //System.out.println(Integer.MIN_VALUE);

    //WRAPPERS
    Double numDouble = 33.0;
    Double numDouble2 = Double.valueOf( 40 );
    String numeroString = "43";

    Double stringToDouble = Double.valueOf( Integer.valueOf( numeroString ) );

    //System.out.println(stringToDouble);

    Boolean falso = Boolean.FALSE;
    Boolean verdadero = Boolean.TRUE;


}
