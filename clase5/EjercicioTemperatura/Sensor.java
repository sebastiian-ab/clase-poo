

public class Sensor {
    double temperatura;
    String ubicacion;

    public Sensor(String ubicacion) {
        this.ubicacion = ubicacion; 
        this.temperatura = 25.0;
    }

    public void ajustar(double nuevaTemp){

        this.temperatura=nuevaTemp;
        System.out.println("Temperatura en " + ubicacion + " actualizada a: " + temperatura + "°C");
    }

    public void verificarAlerte(){

      if(this.temperatura>45.0){
        System.out.println("¡alerta en "+ ubicacion+"!");
     
      } 
        else{
         System.out.println("¡temperatura estable en "+ ubicacion+ " la cual es: "+ temperatura + "°C");
      }
    }
}
