public class Pelicula {
    String nombre;
    int fechaDeLanzamiento;
    int duracionMinutos;
    boolean incluidoEnElPlan;
    private double sumaDeEvaluaciones;
    private int totalDeLasEvaluaciones;

    int getTotalDeLasEvaluaciones() {
        return totalDeLasEvaluaciones;
    }

    void muestraFichaTecnica(){
        System.out.println("El Nombre de la pelicula es: " + nombre);
        System.out.println("Fecha de Lanzamiento es: " + fechaDeLanzamiento);
        System.out.println("Duracion: " + duracionMinutos + "m");
    }

    void evalua(double nota){
        sumaDeEvaluaciones += nota;
        totalDeLasEvaluaciones++;
    }

    double calculaMedia(){
        return sumaDeEvaluaciones / totalDeLasEvaluaciones;
    }
}
