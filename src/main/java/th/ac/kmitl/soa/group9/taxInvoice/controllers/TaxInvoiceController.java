package th.ac.kmitl.soa.group9.taxInvoice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import th.ac.kmitl.soa.group9.taxInvoice.models.ExchangedDocument;

import javax.servlet.http.HttpSession;

@Controller
public class TaxInvoiceController {

    @RequestMapping(value = "/taxinvoice/input_form")
    public String taxInvoiceForm(Model model) {
        ExchangedDocument exchangedDocument = new ExchangedDocument();
        model.addAttribute("exchangedDocument", exchangedDocument);
        return "taxinvoice_form";
    }

    @PostMapping(value = "/taxinvoice/create")
    public String create(@ModelAttribute ExchangedDocument exchangedDocument,
                         HttpSession session){
        session.setAttribute("exchangedDocument", exchangedDocument);
        return "redirect:/taxinvoice/preview";
    }
}
