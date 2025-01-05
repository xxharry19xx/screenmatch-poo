package com.principal;

import com.alura.screenmatch.calculos.FiltroRecomendacion;
import com.aluracursos.screenmatch.modelos.Pelicula;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        //Pelicula miPelicula = new Pelicula();
        //miPelicula.setNombre("Matrix");
        // miPelicula.setFechaDeLanzamiento(1900);
        //miPelicula.setDuracionMinutos(120);

        // miPelicula.muestraFichaTecnica();
        //miPelicula.evalua(10);
        // miPelicula.evalua(10);
        // System.out.println(miPelicula.calculaMedia());
        // System.out.println(miPelicula.getTotalDeLasEvaluaciones());

        ////Serie casaDragon = new Serie();
        //casaDragon.setNombre("caza dradon");
        //casaDragon.setFechaDeLanzamiento(2022);
        //casaDragon.setTemporadas(1);
        //casaDragon.setMinutosPorEpisodios(50);
        //casaDragon.setEpisodiosPorTemporada(10);
        //casaDragon.muestraFichaTecnica();
        //System.out.println(casaDragon.getDuracionMinutos());




        //CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        //calculadora.incluye(miPelicula);
        //calculadora.incluye(casaDragon);
        //calculadora.incluye(otraPelicula);
        // System.out.println(calculadora.getTiempoTotal() + "m");

        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        // filtroRecomendacion.filtrar(miPelicula);

        //var primerpeli = new Pelicula();
        //primerpeli.setNombre("robot salvaje");
        //primerpeli.setDuracionMinutos(180);
        //primerpeli.setFechaDeLanzamiento(2024);

        ArrayList<Pelicula> ListaDePeliculas = new ArrayList<>();
        // ListaDePeliculas.add(miPelicula);
        //ListaDePeliculas.add(otraPelicula);
        //ListaDePeliculas.add(primerpeli);

        System.out.println("Tamaño de la lista es : " + ListaDePeliculas.size());
        System.out.println("La Primera pelicula es : " + ListaDePeliculas.get(0).getNombre());

        System.out.println("El toString de la pelicula es : " + ListaDePeliculas.get(0).toString() );


    }
}


