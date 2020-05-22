package modele;

import java.util.ArrayList;
import java.util.List;

public class Garage {

    private List<Voiture> voitures;

    public Garage() {
        voitures = new ArrayList<>();
    }

    public List<Voiture> getVoitures() {
        return voitures;
    }

    public void setVoitures(final List<Voiture> voitures) {
        this.voitures = voitures;
    }

    public void vendre(final Voiture voiture) {
        voitures.remove(voiture);
    }

    public void acheter(final Voiture voiture) {
        voitures.add(voiture);
    }

    public void tester(final Voiture voiture) {
        voiture.rouler();
    }
}
