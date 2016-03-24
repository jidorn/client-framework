package fr.afcepf.al26.framework.client;

import fr.afcepf.al26.framework.action.MonActionForm;
import fr.afcepf.al26.framework.entity.Adresse;

import java.util.Date;

/**
 * Created by Stagiaire on 22/03/2016.
 */
public class MonActionFormHello extends MonActionForm {
    private String name;
    private int number;
    private String message;
    private String messageAdresse;
    private Adresse adresse = new Adresse();

    public int getNumber() {
        return number;
    }

    public void setNumber(int paramNumber) {
        number = paramNumber;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String paramMessage) {
        message = paramMessage;
    }

    public String getName() {
        return name;
    }

    public void setName(String paramName) {
        name = paramName;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse paramAdresse) {
        adresse = paramAdresse;
    }

    public String getMessageAdresse() {
        return messageAdresse;
    }

    public void setMessageAdresse(String paramMessageAdresse) {
        messageAdresse = paramMessageAdresse;
    }
}
