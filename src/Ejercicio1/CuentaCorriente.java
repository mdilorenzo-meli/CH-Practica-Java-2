package Ejercicio1;

public class CuentaCorriente {

    private Double saldo;

    public CuentaCorriente(){
        saldo = 0.0;
    }

    public CuentaCorriente(CuentaCorriente cuenta){
        this.saldo = cuenta.saldo;
    }

    public CuentaCorriente(Double saldo){
        this.saldo = saldo;
    }

    public Double getSaldo(){
        return saldo;
    }

    public void setSaldo(Double saldo){
        this.saldo = saldo;
    }

    public Double ingreso(Double monto){
        this.saldo += monto;
        return this.saldo;
    }

    public Double egreso(Double monto){
        this.saldo -= monto;
        return this.saldo;
    }

    public Double reintegro (){
        return 0.0;
    }

    public void transferencia (CuentaCorriente cuentaDest, Double monto){
        egreso(monto);
        cuentaDest.ingreso(monto);
    };

}
