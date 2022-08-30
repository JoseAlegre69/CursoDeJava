package Banco;
public class UsoCuenta {

    public static void main(String[] args) {
        // write your code here
        CuentaCorriente Cuenta1 = new CuentaCorriente("Jose",500);
        CuentaCorriente Cuenta2 = new CuentaCorriente("Mir",500);

        System.out.println(Cuenta1);
        System.out.println(Cuenta2);

        System.out.println("Transferimos...");
        Cuenta1.transferencia(Cuenta2,200);

        System.out.println(Cuenta1);
        System.out.println(Cuenta2);
    }
}
