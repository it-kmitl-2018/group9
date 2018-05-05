package th.ac.kmitl.soa.group9.taxinvoice.facades;

import org.springframework.ui.Model;
import th.ac.kmitl.soa.group9.taxinvoice.forms.BaseForm;

import javax.servlet.http.HttpSession;

public class TaxinvoiceFacade {

    private static TaxinvoiceFacade taxinvoiceFacade;

    private TaxinvoiceFacade() {
    }

    public static TaxinvoiceFacade getTaxinvoiceFacade() {
        if (taxinvoiceFacade == null) {
            taxinvoiceFacade = new TaxinvoiceFacade();
        }
        return taxinvoiceFacade;
    }

    public void setAttributesToSession(HttpSession session,
                                       BaseForm baseForm,
                                       String attributeName) {
        session.setAttribute(attributeName, baseForm);
    }

    public void setAttributesToModel(Model model,
                                     BaseForm baseForm,
                                     String attributeName) {
        model.addAttribute(attributeName, baseForm);
    }
}
