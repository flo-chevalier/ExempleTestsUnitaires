package modele;

public class Voiture {
    private String nom;

    public Voiture(final String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(final String nom) {
        this.nom = nom;
    }

    public String rouler() {
        return "je roule";
    }
}
