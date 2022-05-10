
package problema2;

public class Problema02 {
    private String nombre;
    private String apellido;
    private double sueldo_basico;
    private String cedula;
    private double sueldo_total;
    
    public Problema02(){
        
        nombre = "Eduardo";
        apellido = "Churo";
        sueldo_basico = 400;
        cedula = "1104568975";
    }
    public Problema02(String nom, String ap, double sb, String cd){
        
        nombre = nom;
        apellido = ap;
        sueldo_basico = sb;
        cedula = cd;
    }
    
    //metodos establecer
    
    public void establecerNombre(String c){
        nombre = c;
    }
    
    public void establecerApellido(String c){
        apellido = c;
    }
    
    public void establecerSueldo_Basico(double c){
        sueldo_basico = c;
    }
    
    public void establecerCedula(String c){
        cedula = c;
    
    }
    
    //metodos obtener
    
    public void CalcularSueldo_Total(){
        sueldo_total = (sueldo_basico * 20) / 100;
        sueldo_total = sueldo_basico + sueldo_total;

}
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerApellido(){
        return apellido;
    }
    
    public double obtenerSueldo_Basico(){
        return sueldo_basico;
    }
    
    public String obtenerCedula(){
        return cedula;
    }
    
    public double obtenerSueldo_Total(){
        return sueldo_total;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Sueldo Total\n"
                + "Nombre: %s\n"
                + "Apellido: %s\n"
                + "Sueldo Basico: %.2f\n"
                + "Cedula: %s\n"
                + "Sueldo Total: %.2f\n",
                obtenerNombre(),
                obtenerApellido(),
                obtenerSueldo_Basico(),
                obtenerCedula(),
                obtenerSueldo_Total());
        return cadena;
    }
}
        


