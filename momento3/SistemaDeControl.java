public class SistemaDeControl {
    // 1. ATRIBUTOS (Exactos a tu diagrama)
    private Piso[] pisos;
    private Ascensor ascensor;

    // 2. CONSTRUCTOR
    public SistemaDeControl(int cantidadDePisos) {
        this.ascensor = new Ascensor();
        this.pisos = new Piso[cantidadDePisos];
        
        for (int i = 0; i < cantidadDePisos; i++) {
            this.pisos[i] = new Piso(i + 1);
        }
    }

    // 3. MÉTODOS DE ACCIÓN (Con lógica real y sincronizados con los diagramas)

    // Método 1: Alguien oprime el botón en el pasillo -> Encendemos el botón de ese piso
    public void registrarLlamadaPasillo(int numeroPiso, String direccion) {
        System.out.println("Llamada registrada en el piso " + numeroPiso + " para ir hacia: " + direccion);
        
        // Buscamos el piso en el arreglo y encendemos su botón interno
        this.pisos[numeroPiso - 1].getBotonPiso().setEncendido(true);
    }

    // Método 2: El sistema escanea todos los pisos buscando botones encendidos
    public void monitorearBotones() {
        System.out.println("Monitoreando el estado de todos los botones del edificio...");
        
        for (int i = 0; i < this.pisos.length; i++) {
            // Le preguntamos a cada piso si su botón está prendido (true)
            if (this.pisos[i].getBotonPiso().estaEncendido()== true) {
                int pisoConLlamada = i + 1; // Convertimos la posición del arreglo a número de piso real
                System.out.println("¡Se detectó un botón encendido en el piso " + pisoConLlamada + "!");
                
                // El sistema reacciona de inmediato y gestiona el viaje hacia ese piso
                this.gestionarMovimiento(pisoConLlamada);
            }
        }
    }

    // Método 3: Mueve el ascensor al piso que lo necesita (Validando seguridad)
    public void gestionarMovimiento(int numeroPiso) {
        // Le preguntamos a la puerta del ascensor si está obstruida antes de arrancar
        boolean estaObstruida = this.ascensor.getPuerta().verificarObstruccion();

        if (estaObstruida == true) {
            System.out.println("¡ALERTA! NO SE PUEDE MOVER EL ASCENSOR AL PISO " + numeroPiso + " porque la puerta está OBSTRUIDA.");
        } else {
            System.out.println("Puerta despejada. Gestionando viaje. Destino: Piso " + numeroPiso);
            this.ascensor.mover(numeroPiso);
        }
    }

    // Método 4: Al llegar al piso, se abren las puertas (cabina y pasillo a la vez)
    public void abrirPuertasLlegada(int numeroPiso) {
        System.out.println("El ascensor llegó al piso " + numeroPiso + ". Abriendo puertas...");
        
        // Abre la puerta de la cabina del ascensor
        this.ascensor.getPuerta().abrir();
        
        // Abre la puerta del pasillo de ese piso específico
        this.pisos[numeroPiso - 1].getPuertaPiso().abrir();
    }

    // Método 5: Bloquea la puerta del pasillo de un piso por seguridad
    public void asegurarPiso(int numeroPiso) {
        System.out.println("Asegurando y bloqueando accesos en el piso " + numeroPiso);
        this.pisos[numeroPiso - 1].getPuertaPiso().asegurarPuerta();
    }

    // Método 6: El ascensor ya atendió el piso -> Apagamos el botón del pasillo
    public void resetearBotonPiso(int numeroPiso) {
        System.out.println("Reseteando botón del pasillo en el piso " + numeroPiso);
        
        // Buscamos el piso en el arreglo y apagamos su botón interno
        this.pisos[numeroPiso - 1].getBotonPiso().setEncendido(false);
    }

    // 4. GETTERS (Para monitoreo externo si se necesita)
    public Ascensor getAscensor() {
        return this.ascensor;
    }

    public Piso[] getPisos() {
        return this.pisos;
    }
}