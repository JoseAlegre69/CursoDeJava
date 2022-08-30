package Banco;
public class CuentaCorriente {
    double saldo;
    String nombreTitular;
    long numeroCuenta;

    public CuentaCorriente (String nombre,double saldo){
        this.nombreTitular = nombre;
        this.saldo = saldo;
        double numGenerado =(Math.random()*1000000);
        this.numeroCuenta = (long) numGenerado;
    }

    public void setIngreso(double saldo) {
        this.saldo += saldo;
    }

    public void setReintegro(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }
    public void transferencia(CuentaCorriente cuenta, double monto ){
        cuenta.saldo += monto;
        this.saldo-= monto;
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" +
                "saldo=" + saldo +
                ", nombreTitular='" + nombreTitular + '\'' +
                ", numeroCuenta=" + numeroCuenta +
                '}';
    }
}
