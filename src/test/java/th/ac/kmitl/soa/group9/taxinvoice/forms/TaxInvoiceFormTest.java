package th.ac.kmitl.soa.group9.taxinvoice.forms;

import org.junit.jupiter.api.Test;
import th.ac.kmitl.soa.group9.taxinvoice.definitions.TypeCode;

import java.sql.Timestamp;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaxInvoiceFormTest {

    private String id = "RDTIV0575526000058001";
    private String name = TypeCode.TAX_INVOICE.getDescription();
    private String typeCode = TypeCode.TAX_INVOICE.getTypeCode();
    private Timestamp issueDateTime = new Timestamp(System.currentTimeMillis());
    private String purpose = "คำนวณราคาค่าบริการผิดพลาดสูงกว่าที่เป็นจริง";
    private String purposeCode = "DCNS03";
    private String globalId = "ABCDEFGHIJKLMNOPQRST123456789012345";
    private String subject = "หมายเหตุ";
    private String content = "ค่าบริการเพิ่มเติม";

    @Test
    public void shouldGetAllInfo() {
        TaxInvoiceForm taxInvoiceForm = new TaxInvoiceForm();

        taxInvoiceForm.setId(this.id);
        taxInvoiceForm.setName(this.name);
        taxInvoiceForm.setTypeCode(this.typeCode);
        taxInvoiceForm.setIssueDateTime(this.issueDateTime);
        taxInvoiceForm.setPurpose(this.purpose);
        taxInvoiceForm.setPurposeCode(this.purposeCode);
        taxInvoiceForm.setGlobalId(this.globalId);
        taxInvoiceForm.setSubject(this.subject);
        taxInvoiceForm.setContent(this.content);

        assertEquals(this.id, taxInvoiceForm.getId());
        assertEquals(this.name, taxInvoiceForm.getName());
        assertEquals(this.typeCode, taxInvoiceForm.getTypeCode());
        assertEquals(this.issueDateTime, taxInvoiceForm.getIssueDateTime());
        assertEquals(this.purpose, taxInvoiceForm.getPurpose());
        assertEquals(this.purposeCode, taxInvoiceForm.getPurposeCode());
        assertEquals(this.globalId, taxInvoiceForm.getGlobalId());
        assertEquals(this.subject, taxInvoiceForm.getSubject());
        assertEquals(this.content, taxInvoiceForm.getContent());
    }
}
