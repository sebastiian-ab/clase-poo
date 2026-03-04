
public class Personaje {

    String nombre;
    int nivel;

    //constructor que obliga a dar un nombre al crear el personaje

    public Personaje(String nombre,int nivel){
        this.nombre = nombre; //this.nombre es para llamar el atributo
        
        this.nivel = nivel; // todos empiezan en nivel 1 por defecto
    }


    public void mostrarInfo(){
        System.out.println("heroe :" + nombre +" | nivel " + nivel);

    }
    
}
