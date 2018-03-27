package th.ac.kmitl.soa.group9.taxInvoice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import th.ac.kmitl.soa.group9.taxInvoice.models.ExchangedDocument;

import javax.servlet.http.HttpSession;

@Controller
public class PreviewController {

    @RequestMapping("/preview")
    public String preview(Model model,
                          HttpSession session) {
        ExchangedDocument exchangedDocument = (ExchangedDocument) session.getAttribute("exchangedDocument");
        model.addAttribute("exchangedDocument", exchangedDocument);
        return "preview_taxinvoice";
    }
}
