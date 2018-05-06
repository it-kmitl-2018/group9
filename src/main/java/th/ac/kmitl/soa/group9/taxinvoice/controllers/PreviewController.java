package th.ac.kmitl.soa.group9.taxinvoice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import th.ac.kmitl.soa.group9.taxinvoice.definitions.SessionlAttribute;
import th.ac.kmitl.soa.group9.taxinvoice.definitions.PageRouting;
import th.ac.kmitl.soa.group9.taxinvoice.facades.TaxinvoiceFacade;
import th.ac.kmitl.soa.group9.taxinvoice.forms.TaxInvoiceForm;

import javax.servlet.http.HttpSession;

@Controller
public class PreviewController {

    @RequestMapping("/taxinvoice/preview")
    public String preview(Model model,
                          HttpSession session) {
        TaxinvoiceFacade.getTaxinvoiceFacade().setAttributesToModel(model,
                (TaxInvoiceForm) session.getAttribute(SessionlAttribute.TAXINVOICEFORM.getAttributeName()),
                SessionlAttribute.TAXINVOICEFORM.getAttributeName());
        return PageRouting.TAXINVOICEPREVIEW.getKeyPage();
    }
}
