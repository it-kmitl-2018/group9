package th.ac.kmitl.soa.group9.taxInvoice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TaxInvoiceController {

    @RequestMapping("/home/index")
    public String taxInvoiceForm() {
        return "home-index";
    }

}
