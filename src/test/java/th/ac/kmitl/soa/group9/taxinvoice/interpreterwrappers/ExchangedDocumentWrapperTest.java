package th.ac.kmitl.soa.group9.taxinvoice.interpreterwrappers;

import org.junit.Test;
import th.ac.kmitl.soa.group9.taxinvoice.definitions.xml.DocumentCode;
import th.ac.kmitl.soa.group9.taxinvoice.forms.TaxInvoiceForm;

import java.sql.Timestamp;

import static org.junit.Assert.assertEquals;

public class ExchangedDocumentWrapperTest {

    private String subject = "หมายเหตุ";
    private String content = "ค่าบริการเพิ่มเติม";
    private String id = "RDTIV0575526000058001";
    private String name = DocumentCode.TAX_INVOICE.getDescription();
    private String typeCode = DocumentCode.TAX_INVOICE.getCode();
    private Timestamp issueDateTime = new Timestamp(System.currentTimeMillis());
    private String purpose = "คำนวณราคาค่าบริการผิดพลาดสูงกว่าที่เป็นจริง";
    private String purposeCode = "DCNS03";
    private String globalId = "2.16.764.1.1.2.1.X.X.X";
    private TaxInvoiceForm taxInvoiceForm;

    @Test
    public void shouldGetAllInfo() {
        this.taxInvoiceForm = TaxInvoiceForm.builder()
                .id(this.id)
                .name(this.name)
                .typeCode(this.typeCode)
                .issueDateTime(this.issueDateTime)
                .purpose(this.purpose)
                .purposeCode(this.purposeCode)
                .globalId(this.globalId)
                .subject(this.subject)
                .content(this.content)
                .build();
        ExchangedDocumentWrapper wrapper = new ExchangedDocumentWrapper(taxInvoiceForm);

        assertEquals(this.taxInvoiceForm, wrapper.taxInvoiceForm);
    }

}
