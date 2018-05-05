package th.ac.kmitl.soa.group9.taxinvoice.models.xml;

import org.junit.Test;
import th.ac.kmitl.soa.group9.taxinvoice.definitions.TypeCode;

import java.sql.Timestamp;

import static org.junit.Assert.assertEquals;

public class ExchangedDocumentXmlTest {

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
        ExchangedDocumentXml exchangedDocumentXml = ExchangedDocumentXml.builder()
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

        assertEquals(this.id , exchangedDocumentXml.id);
        assertEquals(this.name , exchangedDocumentXml.name);
        assertEquals(this.typeCode , exchangedDocumentXml.typeCode);
        assertEquals(this.issueDateTime, exchangedDocumentXml.issueDateTime);
        assertEquals(this.purpose , exchangedDocumentXml.purpose);
        assertEquals(this.purposeCode , exchangedDocumentXml.purposeCode);
        assertEquals(this.globalId , exchangedDocumentXml.globalId);
        assertEquals(this.creationDateTime , exchangedDocumentXml.creationDateTime);
        assertEquals(this.subject , exchangedDocumentXml.subject);
        assertEquals(this.content , exchangedDocumentXml.content);
    }
}
