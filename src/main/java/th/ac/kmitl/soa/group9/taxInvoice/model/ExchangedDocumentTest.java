package th.ac.kmitl.soa.group9.taxInvoice.model;

import org.junit.jupiter.api.Test;
import th.ac.kmitl.soa.group9.taxInvoice.definitions.TypeCode;

import java.sql.Timestamp;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExchangedDocumentTest {
    private String id = "RDTIV0575526000058001";
    private String name = TypeCode.TAX_INVOICE.getDescription();
    private String typeCode = TypeCode.TAX_INVOICE.getTypeCode();
    private Timestamp issueDateTime = new Timestamp(System.currentTimeMillis());
    private String purpose = "คำนวณราคาค่าบริการผิดพลาดสูงกว่าที่เป็นจริง";
    private String purposeCode = "DCNS03";
    private String globalId = "2.16.764.1.1.2.1.X.X.X";
    private Timestamp creationDateTime = new Timestamp(System.currentTimeMillis());
    private IncludedNote includedNote = new IncludedNote();

    @Test
    public void shouldGetAllInfo() {
        ExchangedDocument exchangedDocument = new ExchangedDocument();
        exchangedDocument.setId(this.id);
        exchangedDocument.setTypeCode(this.typeCode);
        exchangedDocument.setIssueDateTime(this.issueDateTime);
        exchangedDocument.setPurpose(this.purpose);
        exchangedDocument.setPurposeCode(this.purposeCode);
        exchangedDocument.setGlobalId(this.globalId);
        exchangedDocument.setCreationDateTime(this.creationDateTime);
        exchangedDocument.setIncludedNote(this.includedNote);

        assertEquals(this.id, exchangedDocument.getId());
        assertEquals(this.typeCode, exchangedDocument.getTypeCode());
        assertEquals(this.issueDateTime, exchangedDocument.getIssueDateTime());
        assertEquals(this.purpose, exchangedDocument.getPurpose());
        assertEquals(this.purposeCode, exchangedDocument.getPurposeCode());
        assertEquals(this.globalId, exchangedDocument.getGlobalId());
        assertEquals(this.creationDateTime, exchangedDocument.getCreationDateTime());
        assertEquals(this.includedNote, exchangedDocument.getIncludedNote());
    }
}
