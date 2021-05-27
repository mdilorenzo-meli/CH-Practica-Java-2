package Ejercicio2;

import Ejercicio1.CuentaCorriente;

public class E2Main {
    public static void main(String[] args){
        Contador c = new Contador();

        System.out.println(c.getValor());

        c.incrementar();

        System.out.println(c.getValor());

        c.incrementar(4);

        System.out.println(c.getValor());

        c.decrementar();

        System.out.println( c.getValor());
    }
}
