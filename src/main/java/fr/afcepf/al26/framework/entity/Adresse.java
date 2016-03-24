package fr.afcepf.al26.framework.entity;

/**
 * Created by Stagiaire on 24/03/2016.
 */
public class Adresse {
    private int numero;
    private String rue;

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

    @Override
    public String toString() {
        return "Adresse{" +
                "numero=" + numero +
                ", rue='" + rue + '\'' +
                '}';
    }
}
