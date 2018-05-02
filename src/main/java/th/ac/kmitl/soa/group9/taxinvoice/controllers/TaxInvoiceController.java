package th.ac.kmitl.soa.group9.taxinvoice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import th.ac.kmitl.soa.group9.taxinvoice.facades.TaxinvoiceFacade;
import th.ac.kmitl.soa.group9.taxinvoice.forms.TaxInvoiceForm;
import th.ac.kmitl.soa.group9.taxinvoice.models.interpreter.ExchangedDocument;

import javax.servlet.http.HttpSession;

@Controller
public class TaxInvoiceController {

    @RequestMapping(value = "/taxinvoice/input_form")
    public String taxInvoiceForm(Model model) {
        TaxInvoiceForm taxInvoiceForm = new TaxInvoiceForm();
        TaxinvoiceFacade.getTaxinvoiceFacade().setAttributesToModel(model, taxInvoiceForm);
        return "taxinvoice_form";
    }

    @PostMapping(value = "/taxinvoice/create")
    public String create(@ModelAttribute TaxInvoiceForm taxInvoiceForm,
                         HttpSession session) {
        TaxinvoiceFacade.getTaxinvoiceFacade().setAttributesToSession(session, taxInvoiceForm);
        return "redirect:/taxinvoice/preview";
    }
}
