package fr.afcepf.al26.framework.client;

import fr.afcepf.al26.framework.action.MonActionForm;
import fr.afcepf.al26.framework.entity.Adresse;
import fr.afcepf.al26.framework.entity.Ville;

/**
 * classe monActionFormHello.
 */
public class MonActionFormHello extends MonActionForm {
    /**
     * le nom.
     */
    private String name;

    /**
     * le number.
     */
    private int number;

    /**
     * le message réponse.
     */
    private String message;

    /**
     * le message adresse.
     */
    private String messageAdresse;

    /**
     * l'adresse.
     */
    private Adresse adresse = new Adresse();

    /**
     * le constructeur qui permet d'instancier des objet dans un objet.
     */
    public MonActionFormHello() {
        adresse.setVille(new Ville());
    }

    /**
     * le getter.
     * @return le getter.
     */
    public int getNumber() {
        return number;
    }

    /**
     * le setter.
     * @param paramNumber le setter.
     */
    public void setNumber(int paramNumber) {
        number = paramNumber;
    }

    /**
     * le getter.
     * @return le getter.
     */
    public String getMessage() {
        return message;
    }

    /**
     * le setter.
     * @param paramMessage le setter.
     */
    public void setMessage(String paramMessage) {
        message = paramMessage;
    }

    /**
     * le getter.
     * @return le getter.
     */
    public String getName() {
        return name;
    }

    /**
     * le setter.
     * @param paramName le setter.
     */
    public void setName(String paramName) {
        name = paramName;
    }

    /**
     * le getter.
     * @return le getter.
     */
    public Adresse getAdresse() {
        return adresse;
    }

    /**
     * le setter.
     * @param paramAdresse le setter.
     */
    public void setAdresse(Adresse paramAdresse) {
        adresse = paramAdresse;
    }

    /**
     * le getter.
     * @return le getter.
     */
    public String getMessageAdresse() {
        return messageAdresse;
    }

    /**
     * le setter.
     * @param paramMessageAdresse le setter.
     */
    public void setMessageAdresse(String paramMessageAdresse) {
        messageAdresse = paramMessageAdresse;
    }

}
