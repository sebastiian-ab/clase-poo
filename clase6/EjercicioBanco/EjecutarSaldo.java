public class EjecutarSaldo {
    public static void main(String[] args) {
        CuentaBancaria c1= new CuentaBancaria("0485264", 200.520, "sebastian");

        c1.depositar(300.000);

        double saldo1=c1.consultarSaldo();
        System.out.println("su valor actual de fondo es " + saldo1);

        c1.retirar(500.660);

        double saldoFinal=c1.consultarSaldo();
        System.out.println("su saldo final es: "+ saldoFinal);

    }
    
}
