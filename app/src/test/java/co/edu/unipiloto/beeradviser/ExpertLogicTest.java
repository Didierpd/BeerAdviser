package co.edu.unipiloto.beeradviser;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ExpertLogicTest {

    @Test
    public void lightBeerReturnsExpectedBrands() {
        assertTrue(new BeerExpert().getBrands("light").contains("Jail Pale Ale"));
    }

    @Test
    public void forumReturnsThreeRelatedServices() {
        assertEquals(3, new ServiceExpert().getServices("Foro").size());
        assertTrue(new ServiceExpert().getServices("Foro").contains("Foro técnico"));
    }

    @Test
    public void everyConfiguredCategoryReturnsThreeServices() {
        ServiceExpert expert = new ServiceExpert();
        assertEquals(3, expert.getServices("Videoconferencia").size());
        assertEquals(3, expert.getServices("Recursos").size());
        assertEquals(3, expert.getServices("Evaluación").size());
    }
}
