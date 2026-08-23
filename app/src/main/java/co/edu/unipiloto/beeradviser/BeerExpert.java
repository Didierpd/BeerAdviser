package co.edu.unipiloto.beeradviser;

import java.util.ArrayList;
import java.util.List;

/** Lógica Java independiente de Android para el laboratorio Beer Adviser. */
public class BeerExpert {

    public List<String> getBrands(String color) {
        List<String> brands = new ArrayList<>();

        if ("light".equalsIgnoreCase(color)) {
            brands.add("Jail Pale Ale");
            brands.add("Gout Stout");
        } else if ("amber".equalsIgnoreCase(color)) {
            brands.add("Jack Amber");
            brands.add("Red Moose");
        } else if ("brown".equalsIgnoreCase(color)) {
            brands.add("Brown Bear Beer");
            brands.add("Bock Brownie");
        } else {
            brands.add("Dark Elf");
            brands.add("Blackbird Porter");
        }

        return brands;
    }
}
