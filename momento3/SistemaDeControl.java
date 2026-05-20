public class SistemaDeControl {
   
    private Piso[] pisos;
    private Ascensor ascensor;

    
    public SistemaDeControl(int cantidadDePisos) {
        this.ascensor = new Ascensor();
        this.pisos = new Piso[cantidadDePisos];
        
        for (int i = 0; i < cantidadDePisos; i++) {
            this.pisos[i] = new Piso(i + 1);
        }
    }

   

    
    public void registrarLlamadaPasillo(int numeroPiso, String direccion) {
        System.out.println("Llamada registrada en el piso " + numeroPiso + " para ir hacia: " + direccion);
        
        
        this.pisos[numeroPiso - 1].getBotonPiso().setEncendido(true);
    }

   
    public void monitorearBotones() {
        System.out.println("Monitoreando el estado de todos los botones del edificio...");
        
        for (int i = 0; i < this.pisos.length; i++) {
            
            if (this.pisos[i].getBotonPiso().estaEncendido()== true) {
                int pisoConLlamada = i + 1; 
                System.out.println("¡Se detectó un botón encendido en el piso " + pisoConLlamada + "!");
                
               
                this.gestionarMovimiento(pisoConLlamada);
            }
        }
    }

    
    public void gestionarMovimiento(int numeroPiso) {
        
        boolean estaObstruida = this.ascensor.getPuerta().verificarObstruccion();

        if (estaObstruida == true) {
            System.out.println("¡ALERTA! NO SE PUEDE MOVER EL ASCENSOR AL PISO " + numeroPiso + " porque la puerta está OBSTRUIDA.");
        } else {
            System.out.println("Puerta despejada. Gestionando viaje. Destino: Piso " + numeroPiso);
            this.ascensor.mover(numeroPiso);
        }
    }

    
    public void abrirPuertasLlegada(int numeroPiso) {
        System.out.println("El ascensor llegó al piso " + numeroPiso + ". Abriendo puertas...");
        
       
        this.ascensor.getPuerta().abrir();
        
        
        this.pisos[numeroPiso - 1].getPuertaPiso().abrir();
    }

    
    public void asegurarPiso(int numeroPiso) {
       boolean yaEstaAsegurada = this.pisos[numeroPiso - 1].getPuertaPiso().estaBloqueada();

    if (yaEstaAsegurada) {
       
        System.out.println("El piso " + numeroPiso + " YA se encuentra asegurado y protegido.");
    } else {
        
        System.out.println("Asegurando y bloqueando accesos en el piso " + numeroPiso);
        this.pisos[numeroPiso - 1].getPuertaPiso().asegurarPuerta();
    }
    }

    
    public void resetearBotonPiso(int numeroPiso) {
        System.out.println("Reseteando botón del pasillo en el piso " + numeroPiso);
        
        
        this.pisos[numeroPiso - 1].getBotonPiso().setEncendido(false);
    }

    
    public Ascensor getAscensor() {
        return this.ascensor;
    }

   
    
}