package fr.afcepf.al26.framework.client;

import fr.afcepf.al26.framework.action.MonActionForm;

/**
 * Created by Stagiaire on 22/03/2016.
 */
public class MonActionFormHello extends MonActionForm {
    private String name;

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String paramMessage) {
        message = paramMessage;
    }
/*

    @Override
    public boolean validateForm() {
        return name.length() > 3;
    }
*/

    public String getName() {
        return name;
    }

    public void setName(String paramName) {
        name = paramName;
    }
}
