package com.alura.screenmatch.calculos;

public class FiltroRecomendacion {

    public void filtrar(Clasificacion clasificacion){
        if(clasificacion.getClasificacion() >= 4){
            System.out.println("Muy bien evaluado en momento");
        } else if (clasificacion.getClasificacion() >= 2) {
            System.out.println("Popular en el moemnto");
        } else {
            System.out.println("Guardar lista");
        }
    }
}
