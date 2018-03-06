package th.ac.kmitl.soa.group9.taxInvoice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TaxInvoicePreviewController {

    @RequestMapping("/preview")
    // @ResponseBody
    public String index() {
        return "preview_invoice.html";
    }
}
