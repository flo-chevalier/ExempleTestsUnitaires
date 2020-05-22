package modele;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class GarageTest {

    @Test
    void vendre_avec_une_seule_voiture_presente() {
        Garage garage = new Garage();
        Voiture voiture = new Voiture("a");
        garage.getVoitures().add(voiture);

        garage.vendre(voiture);

        assertThat(garage.getVoitures()).isEmpty();
        assertThat(garage.getVoitures()).doesNotContain(voiture);
    }

    @Test
    void vendre_avec_deux_voitures_presentes() {
        Garage garage = new Garage();
        Voiture voiture1 = new Voiture("a");
        Voiture voiture2 = new Voiture("b");
        garage.getVoitures().add(voiture1);
        garage.getVoitures().add(voiture2);

        garage.vendre(voiture1);

        assertThat(garage.getVoitures()).containsExactly(voiture2);
    }

    @Test
    void acheter_une_voiture_avec_aucune_voiture_presente_initialement() {
        Garage garage = new Garage();
        Voiture voiture = new Voiture("a");

        garage.acheter(voiture);

        assertThat(garage.getVoitures()).containsExactly(voiture);
    }

    @Test
    void acheter_une_voiture_avec_une_voiture_presente_initialement() {
        Garage garage = new Garage();
        Voiture voiture1 = new Voiture("a");
        Voiture voiture2 = new Voiture("b");
        garage.getVoitures().add(voiture2);

        garage.acheter(voiture1);

        assertThat(garage.getVoitures()).containsExactlyInAnyOrder(voiture1, voiture2);
    }

    @Test
    void tester() {
        Garage garage = new Garage();
        Voiture voiture = mock(Voiture.class);
        garage.getVoitures().add(voiture);

        garage.tester(voiture);

        verify(voiture).rouler();
    }
}
