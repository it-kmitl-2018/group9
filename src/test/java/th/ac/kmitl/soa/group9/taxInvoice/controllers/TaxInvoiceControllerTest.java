package th.ac.kmitl.soa.group9.taxInvoice.controllers;

import static org.codehaus.groovy.runtime.DefaultGroovyMethods.hasProperty;
import static org.springframework.http.MediaType.APPLICATION_FORM_URLENCODED;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import th.ac.kmitl.soa.group9.taxInvoice.definitions.TypeCode;
import th.ac.kmitl.soa.group9.taxInvoice.models.ExchangedDocument;
import th.ac.kmitl.soa.group9.taxInvoice.models.IncludedNote;

import java.sql.Timestamp;

@RunWith(SpringRunner.class)
@WebMvcTest(TaxInvoiceController.class)
public class TaxInvoiceControllerTest {

    @Autowired
    private MockMvc mMockMvc;

    @Test
    public void previewShouldReturnPreviewTaxInvoiceHtmlPage() throws Exception {
        mMockMvc.perform(get("/home/index"))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.TEXT_HTML));
    }

    @Test
    public void create() throws Exception {
        mMockMvc.perform(post("/home/index"))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.TEXT_HTML));
    }
}
