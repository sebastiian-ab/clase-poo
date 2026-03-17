
public class EjecutarPerfume {

    public static void main(String[] args) {

        Perfume permufe1 = new Perfume("Sauvage", "Dior", 100.0, 120.0);

        permufe1.aplicar(5.5);

        permufe1.consultarCantidad();
        System.out.println("Quedan " + permufe1.consultarCantidad() + " ml en el frasco");

        permufe1.ajustarPrecio(135.0);

    }
}
