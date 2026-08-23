package co.edu.unipiloto.beeradviser;

import java.util.ArrayList;
import java.util.List;

/** Catálogo de servicios de educación virtual agrupados por categoría. */
public class ServiceExpert {

    public List<String> getServices(String category) {
        List<String> services = new ArrayList<>();

        if ("foro".equalsIgnoreCase(category)) {
            services.add("Foro técnico");
            services.add("Foro social");
            services.add("Foro de aclaración de dudas");
        } else if ("videoconferencia".equalsIgnoreCase(category)) {
            services.add("Clase en vivo");
            services.add("Tutoría virtual");
            services.add("Webinar académico");
        } else if ("recursos".equalsIgnoreCase(category)) {
            services.add("Biblioteca digital");
            services.add("Repositorio multimedia");
            services.add("Guías interactivas");
        } else if ("evaluación".equalsIgnoreCase(category)) {
            services.add("Cuestionario en línea");
            services.add("Entrega de actividades");
            services.add("Retroalimentación del docente");
        } else {
            services.add("No hay servicios disponibles para esta categoría");
        }

        return services;
    }
}
