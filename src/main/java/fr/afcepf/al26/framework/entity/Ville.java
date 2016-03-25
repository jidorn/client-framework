package fr.afcepf.al26.framework.entity;

/**
 * entity ville.
 */
public class Ville {
    /**
     * le nom.
     */
    private String name;
    /**
     * le test pour savoir si
     * trunk est meilleur que sangohan.
     */
    private String test;

    /**
     * constructeur par defaut.
     */
    public Ville() {
    }

    /**
     * constructeur with params.
     * @param paramName le nom.
     * @param paramTest le test.
     */
    public Ville(String paramName, String paramTest) {
        name = paramName;
        test = paramTest;
    }

    /**
     * le getter.
     *
     * @return le getter.
     */
    public String getName() {
        return name;
    }

    /**
     * le setter.
     *
     * @param paramName le setter.
     */
    public void setName(String paramName) {
        name = paramName;
    }

    /**
     * le getter.
     *
     * @return le getter.
     */
    public String getTest() {
        return test;
    }

    /**
     * le setter.
     *
     * @param paramTest le setter.
     */
    public void setTest(String paramTest) {
        test = paramTest;
    }
}
