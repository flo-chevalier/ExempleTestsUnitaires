package modele;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class VoitureTest {

    @Test
    void rouler() {
        Voiture voiture = new Voiture("ferrari");

        String resultat = voiture.rouler();

        assertThat(resultat).isEqualTo("je roule");
    }
}
