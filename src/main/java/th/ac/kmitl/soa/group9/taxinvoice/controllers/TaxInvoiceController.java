package th.ac.kmitl.soa.group9.taxinvoice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import th.ac.kmitl.soa.group9.taxinvoice.definitions.PageRouting;
import th.ac.kmitl.soa.group9.taxinvoice.definitions.SessionlAttribute;
import th.ac.kmitl.soa.group9.taxinvoice.facades.TaxinvoiceFacade;
import th.ac.kmitl.soa.group9.taxinvoice.forms.AddressForm;
import th.ac.kmitl.soa.group9.taxinvoice.forms.SellerForm;
import th.ac.kmitl.soa.group9.taxinvoice.forms.TaxInvoiceForm;


import javax.servlet.http.HttpSession;

@Controller
public class TaxInvoiceController {

    @RequestMapping(value = "/taxinvoice/input_form")
    public String taxInvoiceForm(Model model) {
        SellerForm sellerForm = SellerForm.builder().build();
        TaxinvoiceFacade.getTaxinvoiceFacade().setAttributesToModel(model,
                sellerForm,
                SessionlAttribute.SELLERFORM.getAttributeName());
        return PageRouting.TAXINVOICEFORM.getKeyPage();
    }

    @PostMapping(value = "/taxinvoice/create")
    public String create(@ModelAttribute SellerForm sellerForm,
                         HttpSession session) {
        TaxinvoiceFacade.getTaxinvoiceFacade().setAttributesToSession(session,
                sellerForm,
                SessionlAttribute.SELLERFORM.getAttributeName());
        return "redirect:/taxinvoice/preview";
    }
}
