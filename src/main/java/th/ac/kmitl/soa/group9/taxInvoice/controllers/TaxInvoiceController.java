package th.ac.kmitl.soa.group9.taxInvoice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TaxInvoiceController {

    @RequestMapping("/home/index")
    public String taxInvoiceForm() { // Mapping GET Request and call home-index html page
        return "home-index";
    }

}
