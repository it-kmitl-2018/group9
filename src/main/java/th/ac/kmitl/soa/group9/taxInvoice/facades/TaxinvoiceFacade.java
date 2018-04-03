package th.ac.kmitl.soa.group9.taxInvoice.facades;

import org.springframework.ui.Model;
import th.ac.kmitl.soa.group9.taxInvoice.models.interpreter.ExchangedDocument;

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
                                       ExchangedDocument exchangedDocument) {
        session.setAttribute("exchangedDocument", exchangedDocument);
    }

    public void setAttributesToModel(Model model,
                                     ExchangedDocument exchangedDocument) {
        model.addAttribute("exchangedDocument", exchangedDocument);
    }
}
