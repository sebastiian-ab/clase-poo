public class EjecutarReserva {

    public static void main(String[] args) {

        ReservaHotel res1 = new ReservaHotel("sebastian abraham", "15/04/2026", "20/04/2026", 101);

        ReservaHotel res2 = new ReservaHotel("Maria Lopez", "18/05/2026", "22/05/2026", 205);

        res1.nuevaReserva();

        res1.consultarReserva();

        res2.nuevaReserva();

        res2.cancelarReserva();

        res2.cancelarReserva();

        res2.consultarReserva();

    }

}
