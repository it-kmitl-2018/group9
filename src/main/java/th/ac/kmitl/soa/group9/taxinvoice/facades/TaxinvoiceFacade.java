package th.ac.kmitl.soa.group9.taxinvoice.facades;

import org.springframework.ui.Model;
import th.ac.kmitl.soa.group9.taxinvoice.forms.TaxInvoiceForm;
import th.ac.kmitl.soa.group9.taxinvoice.models.interpreter.ExchangedDocument;

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
                                       TaxInvoiceForm taxInvoiceForm) {
        session.setAttribute("taxInvoiceForm", taxInvoiceForm);
    }

    public void setAttributesToModel(Model model,
                                     TaxInvoiceForm taxInvoiceForm) {
        model.addAttribute("taxInvoiceForm", taxInvoiceForm);
    }
}
