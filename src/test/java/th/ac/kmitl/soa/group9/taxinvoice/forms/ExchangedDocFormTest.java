package th.ac.kmitl.soa.group9.taxinvoice.forms;

import org.junit.jupiter.api.Test;
import th.ac.kmitl.soa.group9.taxinvoice.definitions.DocumentCode;

import java.sql.Timestamp;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExchangedDocFormTest {

    private String id = "RDTIV0575526000058001";
    private String name = DocumentCode.TAX_INVOICE.getDescription();
    private String typeCode = DocumentCode.TAX_INVOICE.getCode();
    private Timestamp issueDateTime = new Timestamp(System.currentTimeMillis());
    private String purpose = "คำนวณราคาค่าบริการผิดพลาดสูงกว่าที่เป็นจริง";
    private String purposeCode = "DCNS03";
    private String globalId = "ABCDEFGHIJKLMNOPQRST123456789012345";
    private String subject = "หมายเหตุ";
    private String content = "ค่าบริการเพิ่มเติม";

    @Test
    public void shouldGetAllInfo() {
        ExchangedDocForm exchangedDocForm = ExchangedDocForm.builder()
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

        assertEquals(this.id, exchangedDocForm.getId());
        assertEquals(this.name, exchangedDocForm.getName());
        assertEquals(this.typeCode, exchangedDocForm.getTypeCode());
        assertEquals(this.issueDateTime, exchangedDocForm.getIssueDateTime());
        assertEquals(this.purpose, exchangedDocForm.getPurpose());
        assertEquals(this.purposeCode, exchangedDocForm.getPurposeCode());
        assertEquals(this.globalId, exchangedDocForm.getGlobalId());
        assertEquals(this.subject, exchangedDocForm.getSubject());
        assertEquals(this.content, exchangedDocForm.getContent());
    }
}
