package fr.afcepf.al26.framework.client;

import fr.afcepf.al26.framework.action.MonAction;
import fr.afcepf.al26.framework.action.MonActionForm;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Stagiaire on 22/03/2016.
 */
public class MonActionHello extends MonAction {
    @Override
    public String execute(MonActionForm paramActionForm,
                          HttpServletRequest paramRequest,
                          HttpServletResponse paramResponse) {
        MonActionFormHello monForm =
                (MonActionFormHello)paramActionForm;
        String name = monForm.getName();
        String message = "Bonjour " + name;
        monForm.setMessage(message);
        return "";
    }
}
