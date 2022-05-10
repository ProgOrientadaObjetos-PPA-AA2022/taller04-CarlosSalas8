
package problema03;


public class Problema03 {
    
    private String cedula_duenio;
    private String marca_vehiculo;
    private double anio_fabricacion;
    private double valor_vehiculo;
    private double valor_matricula;
    private int anio_actual = 2022;
            
    public Problema03(){
        
        cedula_duenio = "1105698257";
        marca_vehiculo = "Kia Rio";
        anio_fabricacion = 2019;
        valor_vehiculo = 21000;
    
    }
    public Problema03(String ced, String marca, double aniof, double valorv){
        
        cedula_duenio = ced;
        marca_vehiculo = marca;
        anio_fabricacion = aniof;
        valor_vehiculo = valorv;
       
    }
    
    public void establecerCedula_Duenio(String c){
      cedula_duenio = c;  
    }
    
    public void establecerMarca_Vehiculo(String c){
      marca_vehiculo = c;  
    }
    
    public void establecerAnio_Fabricacion(double c){
        anio_fabricacion = c;
    
    }
    public void establecerValor_Vehiculo(double c){
        valor_vehiculo = c;
    
    }
 
    public void CalcularValor_Matricula(){
        valor_matricula = (valor_vehiculo * 0.00002);
        valor_matricula= valor_matricula * (anio_actual - anio_fabricacion);
    
    }
    
    public String obtenerCedula_Duenio(){
        return cedula_duenio;
    
    }
    
    public String obtenerMarca_Vehiculo(){
        return marca_vehiculo;
    }
    public double obtenerAnio_Fabricacion(){
        return anio_fabricacion;
    
    }
    public double obtenerValor_Vehiculo(){
        return valor_vehiculo;    
    }
    public double obtenerValor_Matricula(){
        return valor_matricula;
    
    }
    @Override
    public String toString() {
        String cadena = String.format("Automovil\n"
                + "Cedula Dueño: %s\n"
                + "Marca Vehiculo: %s\n"
                + "Año Fabricacion: %.2f\n"
                + "Valor del Vehiculo: %.2f\n"
                + "Valor de la matricula: %.2f\n",
                obtenerCedula_Duenio(),
                obtenerMarca_Vehiculo(),
                obtenerAnio_Fabricacion(),
                obtenerValor_Vehiculo(),
                obtenerValor_Matricula());
        return cadena;
    }
}
