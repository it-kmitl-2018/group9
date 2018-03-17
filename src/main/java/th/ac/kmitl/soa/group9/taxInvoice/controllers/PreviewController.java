package th.ac.kmitl.soa.group9.taxInvoice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PreviewController {

    @RequestMapping("/preview")
    public String preview() {
        return "preview_taxinvoice";
    }
}
