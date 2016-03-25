package fr.afcepf.al26.framework.entity;

/**
 * entity adresse.
 */
public class Adresse {
    /**
     * le numero d'une adresse.
     */
    private int numero;
    /**
     * la rue.
     */
    private String rue;
    /**
     * la ville.
     */
    private Ville ville;

    /**
     * constructeur avec les params.
     *
     * @param paramNumero le numero.
     * @param paramRue    la rue.
     * @param paramVille  la ville.
     */
    public Adresse(int paramNumero, String paramRue, Ville paramVille) {
        numero = paramNumero;
        rue = paramRue;
        ville = paramVille;
    }

    /**
     * constructeur avec la moitie des params.
     *
     * @param paramNumero le numero.
     * @param paramRue    la rue.
     */
    public Adresse(int paramNumero, String paramRue) {
        numero = paramNumero;
        rue = paramRue;
    }

    /**
     * constructeur par defaut.
     */
    public Adresse() {
    }

    /**
     * le getter.
     *
     * @return le getter.
     */
    public int getNumero() {
        return numero;
    }

    /**
     * le setter.
     *
     * @param paramNumero le setter.
     */
    public void setNumero(int paramNumero) {
        numero = paramNumero;
    }

    /**
     * le getter.
     *
     * @return le getter.
     */
    public String getRue() {
        return rue;
    }

    /**
     * le setter.
     *
     * @param paramRue le setter.
     */
    public void setRue(String paramRue) {
        rue = paramRue;
    }

    /**
     * le getter.
     *
     * @return le getter.
     */
    public Ville getVille() {
        return ville;
    }

    /**
     * le setter.
     *
     * @param paramVille le setter.
     */
    public void setVille(Ville paramVille) {
        ville = paramVille;
    }

    /**
     * methode toString.
     *
     * @return l'objet en string.
     */
    @Override
    public String toString() {
        return "Adresse{"
                + "numero=" + numero
                + ", rue='" + rue + '\''
                + ", ville=" + ville
                + '}';
    }
}
