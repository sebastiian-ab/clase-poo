public class CuentaBancaria {

   public String numeroCuenta;
   public double saldo;
   public String titular;

   public CuentaBancaria(String numeroCuenta,double saldo, String titular){
    this.numeroCuenta=numeroCuenta;
    this.saldo=saldo;
    this.titular=titular;
   }

   public void depositar(double cantidad){
   this.saldo+=cantidad;

   }

   public void retirar(double cantidad){
    if (cantidad<=this.saldo) {
        this.saldo-=cantidad;
        
        System.out.println("retiro su saldo----su saldo restante es: " + this.saldo);
    }
    else{
        System.out.println("usted no tiene los fondos para retirar: "+ cantidad);
    }
   }

    public double consultarSaldo(){
    return this.saldo;

   }
}
