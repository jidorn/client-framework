package fr.afcepf.al26.framework.entity;

/**
 * Created by Stagiaire on 25/03/2016.
 */
public class Ville {
    private String name;
    private String test;

    public Ville() {
    }

    public Ville(String paramName, String paramTest) {
        name = paramName;
        test = paramTest;
    }

    public String getName() {
        return name;
    }

    public void setName(String paramName) {
        name = paramName;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String paramTest) {
        test = paramTest;
    }
}
