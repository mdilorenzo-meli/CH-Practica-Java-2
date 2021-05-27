package Ejercicio4;

public class Fraccion {

    Integer numerador, denominador;

    public Fraccion sumar(Fraccion f){
        // Denominador final
        Integer df = this.denominador * f.denominador;
        // Numerador final
        Integer nf = this.numerador *(df/this.denominador) + f.numerador*(df/f.denominador);

        numerador = nf;
        denominador = df;

        return this;
    }

    public Fraccion sumar(Integer i){
        numerador += i*denominador;

        return this;
    }

    public Fraccion restar(Fraccion f){
        // Denominador final
        Integer df = this.denominador * f.denominador;
        // Numerador final
        Integer nf = this.numerador *(df/this.denominador) - f.numerador*(df/f.denominador);

        numerador = nf;
        denominador = df;

        return this;
    }

    public Fraccion restar(Integer i){
        numerador -= i*denominador;

        return this;
    }

    public Fraccion multiplicar(Fraccion f){
        numerador *= f.numerador;
        denominador *= f.denominador;

        return this;
    }

    public Fraccion multiplicar(Integer i){
        numerador *= i;

        return this;
    }

    public Fraccion dividir(Fraccion f){
        numerador *= f.denominador;
        denominador *= f.numerador;

        return this;
    }

    public Fraccion dividir( Integer i ){
        denominador *= i;

        return this;
    }

    public Integer getNumerador() {
        return numerador;
    }

    public void setNumerador(Integer numerador) {
        this.numerador = numerador;
    }

    @Override
    public String toString() {
        return "Fraccion{" +
                "numerador=" + numerador +
                ", denominador=" + denominador +
                '}';
    }

    public Integer getDenominador() {
        return denominador;
    }

    public void setDenominador(Integer denominador) {
        this.denominador = denominador;
    }
}
