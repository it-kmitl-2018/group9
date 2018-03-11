package th.ac.kmitl.soa.group9.taxInvoice.controller;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaxInvoiceControllerTest {

    @Test
    public void shouldGetRightHtmlString() {
        TaxInvoiceController taxInvoiceController = new TaxInvoiceController();
        assertEquals("home-index", taxInvoiceController.taxInvoiceForm());
    }

}
