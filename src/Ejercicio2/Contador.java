package Ejercicio2;

public class Contador {

    private int valor;

    public Contador(){
        valor = 0;
    }

    public Contador(int val){
        this.valor = val;
    }

    public Contador(Contador contador){
        this.valor = contador.getValor();
    }

    public int getValor(){
        return valor;
    }

    public int setValor(int v){
        this.valor = v;
        return this.valor;
    }

    public void incrementar(){
        this.valor++;
    }

    public void incrementar(int incremento){
        this.valor+= incremento;
    }

    public void decrementar(){
        this.valor--;
    }

    public void decrementar(int decremento){
        this.valor-=decremento;
    }

}
