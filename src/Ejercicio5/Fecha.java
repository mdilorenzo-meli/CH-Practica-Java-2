package Ejercicio5;

import java.util.Date;
import java.util.GregorianCalendar;

public class Fecha {

    GregorianCalendar calendario;

    public Fecha(Fecha f){
        this.calendario = f.calendario;
    }

    public Fecha(int anio, int mes, int dia){
        this.calendario = new GregorianCalendar(anio, mes, dia);
    }

    public Fecha(){
        this.calendario = new GregorianCalendar();
    }

    public boolean validarFecha(int y, int m, int d){
        calendario.set(y, m, d, 0, 0, 0);
        try {
            calendario.getTime();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Date incrementarDia(){
        calendario.add(GregorianCalendar.DAY_OF_MONTH, 1);

        return calendario.getTime();
    }

}
