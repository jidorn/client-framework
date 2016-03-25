package fr.afcepf.al26.framework.client;

import fr.afcepf.al26.framework.action.MonAction;
import fr.afcepf.al26.framework.action.MonActionForm;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * classe monActionHello.
 */
public class MonActionHello extends MonAction {

    /**
     * methode execute qui communique avec le framework.
     *
     * @param paramActionForm le monActionForm.
     * @param paramRequest    la requete.
     * @param paramResponse   la reponse.
     * @return une string.
     */
    @Override
    public String execute(MonActionForm paramActionForm,
                          HttpServletRequest paramRequest,
                          HttpServletResponse paramResponse) {
        MonActionFormHello monForm =
                (MonActionFormHello) paramActionForm;
        String name = monForm.getName();
        int test = monForm.getNumber();
        String message = "Bonjour " + name + " le number :"
                + test;
        monForm.setMessage(message);
        String message2 = "numero : " + monForm.getAdresse()
                .getNumero() + ", rue : " + monForm.getAdresse().getRue()
                + ", nomVille : " + monForm.getAdresse()
                .getVille().getName() + ", testVille : " + monForm
                .getAdresse().getVille().getTest();
        monForm.setMessageAdresse(message2);
        return "";
    }
}
