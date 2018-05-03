package th.ac.kmitl.soa.group9.taxinvoice.models.xml;

import org.junit.Test;
import th.ac.kmitl.soa.group9.taxinvoice.definitions.TypeCode;

import java.sql.Timestamp;

import static org.junit.Assert.assertEquals;

public class XmlExchangedDocumentTest {

    private String id = "RDTIV0575526000058001";
    private String name = TypeCode.TAX_INVOICE.getDescription();
    private String typeCode = TypeCode.TAX_INVOICE.getTypeCode();
    private Timestamp issueDateTime = new Timestamp(System.currentTimeMillis());
    private String purpose = "คำนวณราคาค่าบริการผิดพลาดสูงกว่าที่เป็นจริง";
    private String purposeCode = "DCNS03";
    private String globalId = "2.16.764.1.1.2.1.X.X.X";
    private Timestamp creationDateTime = new Timestamp(System.currentTimeMillis());
    private String subject = "หมายเหตุ";
    private String content = "";

    @Test
    public void shouldGetAllInfo(){
        XmlExchangedDocument xmlExchangedDocument = XmlExchangedDocument.builder()
                .id(id)
                .name(name)
                .typeCode(typeCode)
                .issueDateTime(issueDateTime)
                .purpose(purpose)
                .purposeCode(purposeCode)
                .globalId(globalId)
                .creationDateTime(creationDateTime)
                .subject(subject)
                .content(content)
                .build();

        assertEquals(this.id , xmlExchangedDocument.id);
        assertEquals(this.name , xmlExchangedDocument.name);
        assertEquals(this.typeCode ,xmlExchangedDocument.typeCode);
        assertEquals(this.issueDateTime, xmlExchangedDocument.issueDateTime);
        assertEquals(this.purpose , xmlExchangedDocument.purpose);
        assertEquals(this.purposeCode , xmlExchangedDocument.purposeCode);
        assertEquals(this.globalId , xmlExchangedDocument.globalId);
        assertEquals(this.creationDateTime , xmlExchangedDocument.creationDateTime);
        assertEquals(this.subject , xmlExchangedDocument.subject);
        assertEquals(this.content , xmlExchangedDocument.content);
    }
}
