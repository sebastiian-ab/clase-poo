public class SimularAscensor {
  public static void main(String[] args) {
    System.out.println("--- INICIANDO SIMULADOR DE ASCENSOR ---");

    SistemaDeControl sistemaCentral = new SistemaDeControl(5);

    System.out.println("\n--- SIMULACIÓN 1: LLAMADA NORMAL ---");

    sistemaCentral.registrarLlamadaPasillo(3, "SUBIR");

    sistemaCentral.monitorearBotones();

    sistemaCentral.abrirPuertasLlegada(3);
    sistemaCentral.resetearBotonPiso(3);

    System.out.println("--- SIMULACIÓN 2: INTENTO CON PUERTA OBSTRUIDA ---");

    sistemaCentral.registrarLlamadaPasillo(5, "BAJAR");

    sistemaCentral.getAscensor().getPuerta().setObstruida(true);

    sistemaCentral.monitorearBotones();

    System.out.println("\n--- SIMULACIÓN 3: SE LIBERA LA PUERTA Y SE ATIENDE LA LLAMADA ---");
    System.out.println("[Sensor] Objeto removido de la puerta de la cabina.");

    
    sistemaCentral.getAscensor().getPuerta().setObstruida(false);

    sistemaCentral.monitorearBotones();

    sistemaCentral.abrirPuertasLlegada(5);
    sistemaCentral.resetearBotonPiso(5);

    System.out.println("\n--- SIMULACIÓN 4: PROTOCOLO DE SEGURIDAD EN UN PISO ---");

    sistemaCentral.asegurarPiso(1);

    sistemaCentral.asegurarPiso(1);

    System.out.println("=========================================");
    System.out.println("       FIN DE TODAS LAS PRUEBAS          ");
    System.out.println("=========================================");

  }

}
