package th.ac.kmitl.soa.group9.taxinvoice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import th.ac.kmitl.soa.group9.taxinvoice.facades.TaxinvoiceFacade;
import th.ac.kmitl.soa.group9.taxinvoice.models.interpreter.ExchangedDocument;

import javax.servlet.http.HttpSession;

@Controller
public class PreviewController {

    @RequestMapping("/taxinvoice/preview")
    public String preview(Model model,
                          HttpSession session) {
        TaxinvoiceFacade.getTaxinvoiceFacade().setAttributesToModel(model,
                (ExchangedDocument) session.getAttribute("exchangedDocument"));
        return "preview_taxinvoice";
    }
}
