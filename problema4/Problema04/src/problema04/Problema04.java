
package problema04;


public class Problema04 {
    
    private String nombre_cliente;
    private String nombre_banco;
    private double valor_cheque;
    private double comision_banco;
    
    
    
    public Problema04(){
        nombre_cliente = "Patricia";
        nombre_banco = "Banco de Loja";
        valor_cheque = 1000;
          
    }
    public Problema04(String nom, String nomb, double cheq){
        nombre_cliente = nom;
        nombre_banco = nomb;
        valor_cheque = cheq;
    
    }
    
    public void establecerNombre_Cliente(String c){
        nombre_cliente = c;
    
    }
    public void establecerNombre_Banco(String c){
        nombre_banco = c;
    
    }
    
    public void establecerValor_Cheque(double c){
        valor_cheque = c;
        
    
    }
    
    public void CalcularComision_Banco(){
        comision_banco = valor_cheque * 0.00003;
 
    }
    
    public String obtenerNombre_cliente(){
        return nombre_cliente;
    
    }
    
    public String obtenerNombre_Banco(){
        return nombre_banco;
    
    }
    
    public double obtenerValor_Cheque(){
        return valor_cheque;
    
    }
    
    public double obtenerComision_Banco(){
        return comision_banco;
    
    }
    @Override
    public String toString() {
        String cadena = String.format("Entidad y Finazas\n"
                + "Nombre del Cliente: %s\n"
                + "Nombre del Banco: %s\n"
                + "Valor del Cheque: %.2f\n"
                + "Comision del Banco: %.2f\n",
                obtenerNombre_cliente(),
                obtenerNombre_Banco(),
                obtenerValor_Cheque(),
                obtenerComision_Banco());
        return cadena;
    }
   
}
