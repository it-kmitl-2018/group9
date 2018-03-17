package th.ac.kmitl.soa.group9.taxInvoice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import th.ac.kmitl.soa.group9.taxInvoice.models.ExchangedDocument;

@Controller
public class TaxInvoiceController {

    @RequestMapping("/home/index")
    public String taxInvoiceForm(Model model) { // Mapping GET Request and call home-index html page
        ExchangedDocument exchangedDocument = new ExchangedDocument();
        model.addAttribute("exchangedDocument", exchangedDocument);
        return "home-index";
    }

    @PostMapping(value = "/home/index", params = "create")
    public String createTaxInvoice(@ModelAttribute ExchangedDocument exchangedDocument){
        return "preview_taxinvoice";
    }
}
