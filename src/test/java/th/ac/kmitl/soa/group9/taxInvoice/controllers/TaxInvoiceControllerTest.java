package th.ac.kmitl.soa.group9.taxInvoice.controllers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;
import th.ac.kmitl.soa.group9.taxInvoice.definitions.TypeCode;

@RunWith(SpringRunner.class)
@WebMvcTest(TaxInvoiceController.class)
public class TaxInvoiceControllerTest {

    @Autowired
    private MockMvc mMockMvc;

    @Test
    public void previewShouldReturnPreviewTaxInvoiceHtmlPage() throws Exception {
        this.mMockMvc.perform(get("/taxinvoice/input_form"))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.TEXT_HTML));
    }

    @Test
    public void createTaxInvoice() throws Exception {
        this.mMockMvc.perform(post("/taxinvoice/input_form")
                .param("id", "RDTIV0575526000058001")
                .param("name", TypeCode.TAX_INVOICE.getDescription())
                .param("typeCode", TypeCode.TAX_INVOICE.getTypeCode())
                .param("purpose", "คำนวณราคาค่าบริการผิดพลาดสูงกว่าที่เป็นจริง")
                .param("purposeCode", "DCNS03")
                .param("globalId", "2.16.764.1.1.2.1.X.X.X"))
                .andExpect(redirectedUrl("/taxinvoice/preview"));
    }
}
