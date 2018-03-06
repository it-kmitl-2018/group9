package th.ac.kmitl.soa.group9.taxInvoice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/home/index")
    public String home(){
        return "home-index";
    }
}
