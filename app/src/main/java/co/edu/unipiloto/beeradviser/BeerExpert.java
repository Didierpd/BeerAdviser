package co.edu.unipiloto.beeradviser;

import java.util.ArrayList;
import java.util.List;

/** Lógica Java independiente de Android para el laboratorio Beer Adviser. */
public class BeerExpert {

    public List<String> getBrands(String color) {
        List<String> brands = new ArrayList<>();

        if ("Aguila".equalsIgnoreCase(color)) {
            brands.add("Negra");
            brands.add("Light");
        } else if ("Corona".equalsIgnoreCase(color)) {
            brands.add("Grande");
            brands.add("Pequeña");
        } else if ("Poker".equalsIgnoreCase(color)) {
            brands.add("Lata");
            brands.add("Botella");
        } else if ("Heineken".equalsIgnoreCase(color)) {
            brands.add("Elige otra");
            brands.add("No disponible");

        } else {
            brands.add("Opción no reconocida");
        }


        return brands;
    }
}
