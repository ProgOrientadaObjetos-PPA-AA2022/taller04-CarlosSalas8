
package problema01;

public class Ejecutor {

    public static void main(String[] args) {
        
        Problema01 es = new Problema01();
        Problema01 es2 = new Problema01("Carlos Salas", 8.3, 9.2, 10);
        
        es.CalcularPromedio();
        System.out.printf("%s\n", es);
        es2.CalcularPromedio();
        System.out.printf("%s\n", es2);
        
        
        

        
    }
    
}
