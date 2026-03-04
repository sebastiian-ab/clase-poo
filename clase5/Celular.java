
public class Celular {
    //atributos

    String marca;
    String modelo;
    int bateria=100;
    

    //metodo
 /*firma del metodo
  *publico
  *void----> no retorna
  *el metodo tiene como nombre "llamar"
  *tiene un parametro y es de tipo entero(numero)
  */
    public void llamar(int numero,String marca) {
        System.out.println("llamando al "+ numero +".....");
        System.out.println("tipo de celular "+ marca +".....");
        this.bateria-=5;
    }
}
