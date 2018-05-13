package th.ac.kmitl.soa.group9.taxinvoice.controllers;

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
import th.ac.kmitl.soa.group9.taxinvoice.definitions.DocumentCode;

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
        this.mMockMvc.perform(post("/taxinvoice/create")
                .param("sellerForm.id", "ABCDEFGHIJKLMNOPQRST123456789012345")
                .param("sellerForm.globalId", "123456")
                .param("sellerForm.name", "บริษัท ร่วมสมัยการค้าไทย จำกัด")
                .param("sellerForm.taxRegistrationId", "0575526009099")
                .param("sellerForm.branchId", "00000")
                .param("sellerForm.email", "tax@rstmarket.co.th")
                .param("sellerAddress.building", "ื้อจือเหลียง")
                .param("sellerAddress.buildingNumber", "968/1")
                .param("sellerAddress.soi", "ศาลาแดง 1")
                .param("sellerAddress.village", "ศาลาแดงวิลล่า")
                .param("sellerAddress.moo", "3")
                .param("sellerAddress.streetName", "าีลม")
                .param("sellerAddress.citySub", "101701")
                .param("sellerAddress.city", "1017")
                .param("sellerAddress.countrySub", "10")
                .param("sellerAddress.country", "TH")
                .param("sellerAddress.postCode", "10310"))
                .andExpect(redirectedUrl("/taxinvoice/preview"));
    }
}
