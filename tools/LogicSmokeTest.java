import co.edu.unipiloto.beeradviser.BeerExpert;
import co.edu.unipiloto.beeradviser.ServiceExpert;

public class LogicSmokeTest {
    public static void main(String[] args) {
        BeerExpert beerExpert = new BeerExpert();
        ServiceExpert serviceExpert = new ServiceExpert();

        require(beerExpert.getBrands("light").contains("Jail Pale Ale"), "cerveza light");
        require(serviceExpert.getServices("Foro").size() == 3, "servicios de foro");
        require(serviceExpert.getServices("Foro").contains("Foro técnico"), "foro técnico");
        require(serviceExpert.getServices("Videoconferencia").size() == 3, "videoconferencia");
        require(serviceExpert.getServices("Recursos").size() == 3, "recursos");
        require(serviceExpert.getServices("Evaluación").size() == 3, "evaluación");

        System.out.println("OK: lógica de Beer Adviser y servicios virtuales validada.");
    }

    private static void require(boolean condition, String scenario) {
        if (!condition) {
            throw new AssertionError("Falló: " + scenario);
        }
    }
}
