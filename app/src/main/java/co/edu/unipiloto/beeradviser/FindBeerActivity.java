package co.edu.unipiloto.beeradviser;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class FindBeerActivity extends Activity {

    private final BeerExpert beerExpert = new BeerExpert();
    private final ServiceExpert serviceExpert = new ServiceExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);

        Spinner categorySpinner = findViewById(R.id.service_category);
        categorySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                showServices();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // El Spinner siempre conserva una categoría seleccionada.
            }
        });
    }

    /** Método solicitado por el laboratorio base y enlazado desde el layout. */
    public void onClickFindBeer(View view) {
        TextView brandsView = findViewById(R.id.brands);
        Spinner colorSpinner = findViewById(R.id.beer_color);
        String color = String.valueOf(colorSpinner.getSelectedItem());
        brandsView.setText(formatAsList(beerExpert.getBrands(color)));
    }

    /** Permite actualizar también mediante el botón de la extensión. */
    public void onClickFindServices(View view) {
        showServices();
    }

    private void showServices() {
        TextView servicesView = findViewById(R.id.services);
        Spinner categorySpinner = findViewById(R.id.service_category);
        String category = String.valueOf(categorySpinner.getSelectedItem());
        servicesView.setText(formatAsList(serviceExpert.getServices(category)));
    }

    private String formatAsList(List<String> values) {
        StringBuilder formatted = new StringBuilder();
        for (String value : values) {
            formatted.append("• ").append(value).append('\n');
        }
        return formatted.toString().trim();
    }
}
