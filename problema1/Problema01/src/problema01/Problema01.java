
package problema01;


public class Problema01 {
        private String nombre;
        private double calificacion1;
        private double calificacion2;
        private double calificacion3;
        private double promedio;
        
        
        public Problema01 (){
        nombre = "Carlos";
        calificacion1 = 5.8;
        calificacion2 = 8.4;
        calificacion3 = 10;        
        
        }
        public Problema01(String nom, double cf1, double cf2, double cf3){
            
            nombre = nom;
            calificacion1 = cf1;
            calificacion2 = cf2;
            calificacion3 = cf3;        
        }
        
//metodos establecer
     
        public void establecerNombre(String c){
        nombre = c;
        }
        public void establerCalificacion1(double c){
        calificacion1 = c;
        }
        
        public void establecerCalificacion2(double c){
        calificacion2 = c;
        }
        
        public void establecerCalificacion3(double c){
        calificacion3 = c;
        }
 //metodos obtener
         
        public void CalcularPromedio(){
        promedio = calificacion1 + calificacion2 + calificacion3;
        promedio = promedio/3;
        }
        
        public String obtenerNombre(){
            return nombre;        
        }
        
        public double obtenerCalificacion1(){
            return calificacion1;
        
        }
        public double obtenerCalificaion2(){
            return calificacion2;
        
        }
        
        public double obtenerCalificaion3(){
            return calificacion3;
        
        }
        public double obtenerPromedio(){
            return promedio;
        
        }
    @Override
    public String toString() {
        String cadena = String.format("Promediso de Estudiantes\n"
                + "Nombre de Estudiantes: %s\n"
                + "Calificacion 1: %.2f\n"
                + "Calificacion 2: %.2f\n"
                + "Calificacion 3: %.2f\n"
                + "Promedio: %.2f\n",
                obtenerNombre(),
                obtenerCalificacion1(),
                obtenerCalificaion2(),
                obtenerCalificaion3(),
                obtenerPromedio());
        
        return cadena;
    }
}
