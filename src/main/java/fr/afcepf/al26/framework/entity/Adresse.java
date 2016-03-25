package fr.afcepf.al26.framework.entity;

/**
 * Created by Stagiaire on 24/03/2016.
 */
public class Adresse {
    private int numero;
    private String rue;
    private Ville ville;

    public Adresse(int paramNumero, String paramRue, Ville paramVille) {
        numero = paramNumero;
        rue = paramRue;
        ville = paramVille;
    }

    public Adresse(int paramNumero, String paramRue) {
        numero = paramNumero;
        rue = paramRue;
    }

    public Adresse() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int paramNumero) {
        numero = paramNumero;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String paramRue) {
        rue = paramRue;
    }

    public Ville getVille() {
        return ville;
    }

    public void setVille(Ville paramVille) {
        ville = paramVille;
    }

    @Override
    public String toString() {
        return "Adresse{" +
                "numero=" + numero +
                ", rue='" + rue + '\'' +
                ", ville=" + ville +
                '}';
    }
}
