public class DataTypes {

    public static void main(String[] args) {

         //tipos de datos primitivos

         int myInt= 24;
         System.out.println(myInt);

         long myLong=10;

         //variable tipo real
         float myFloat=5.0f;
          System.out.println(myFloat);

         double myDouble =2.99;
         //float,long,byte
         System.out.println(myDouble);

         char myChar ='a';
          System.out.println(myChar);

          boolean myBoolean= true;
          myBoolean=false;
          System.out.println(myBoolean);


        
          // MAS(+) SIGNIFICA CONCATENAR DENTRO DE UN SYSTEM.OUT.PRINTLN
          System.out.println("la notas es: " + myDouble);


          //--------------------------------EXPRESIONES MATEMATICAS-----------------------
          double a= 4.0;
          double b = 5.0;
          double c = 1.0;


          double res = b * a - Math.pow(b,2) / 4* c;

          System.out.println(res);

          double res2 = (a*b) / Math.pow(3,2);
          System.out.println(res2);

          double res3 =(((b + c) / 2 * a + 10) * 3 * b) - 6;
          System.out.println(res3);
    }
    
}
