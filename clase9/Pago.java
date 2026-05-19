
public class Pago {
    private double subTotal;
    private double propina;
    private double impuestos;

    public double calculoTotal(double subTotal, double propina, double impuestos) {

        this.subTotal = subTotal;
        this.propina = propina;
        this.impuestos = impuestos;

        return this.subTotal+ this.propina + this.impuestos;
    }

    public double getSubTotal() {
        return this.subTotal;
    }

}
