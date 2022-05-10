
package problema03;

public class Ejecutor {

    public static void main(String[] args) {
        
        Problema03 aut = new Problema03();
        Problema03 aut2 = new  Problema03("112547896", "Hyundai tucson", 2013, 16000);
        
        aut.CalcularValor_Matricula();
        System.out.printf("%s\n", aut);
        aut2.CalcularValor_Matricula();
        System.out.printf("%s\n", aut2);

    }
    
}
