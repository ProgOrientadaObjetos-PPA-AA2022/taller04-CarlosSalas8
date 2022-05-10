
package problema04;

public class Ejecutor {


    public static void main(String[] args) {
        Problema04 finz = new Problema04();
        Problema04 finz2 = new Problema04("Carlos", "Banco Pichincha",2500);
        
        finz.CalcularComision_Banco();
        System.out.printf("%s\n", finz);
        finz2.CalcularComision_Banco();
        System.out.printf("%s\n", finz2);
    }
    
}
