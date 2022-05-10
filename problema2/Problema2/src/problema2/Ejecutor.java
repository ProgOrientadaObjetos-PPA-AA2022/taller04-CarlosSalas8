
package problema2;

public class Ejecutor {

    public static void main(String[] args) {

        Problema02 suel = new Problema02();
        Problema02 suel2 = new  Problema02("Ainara","Salas",450,"1102654785");
        
        suel.CalcularSueldo_Total();
        System.out.printf("%s\n", suel);
        suel2.CalcularSueldo_Total();
        System.out.printf("%s\n", suel2);
        
        
        
        
        
    }
    
}
