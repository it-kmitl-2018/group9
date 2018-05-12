package th.ac.kmitl.soa.group9.taxinvoice.xmlwrappers;

import org.junit.Test;
import th.ac.kmitl.soa.group9.taxinvoice.definitions.DocumentCode;
import th.ac.kmitl.soa.group9.taxinvoice.models.interpreter.ExchangedDocument;
import th.ac.kmitl.soa.group9.taxinvoice.models.interpreter.IncludedNote;

import java.sql.Timestamp;

import static org.junit.Assert.assertEquals;

public class ExchangedDocumentXmlWrapperTest {

    private String id = "RDTIV0575526000058001";
    private String name = DocumentCode.TAX_INVOICE.getDescription();
    private String typeCode = DocumentCode.TAX_INVOICE.getCode();
    private Timestamp issueDateTime = new Timestamp(System.currentTimeMillis());
    private String purpose = "คำนวณราคาค่าบริการผิดพลาดสูงกว่าที่เป็นจริง";
    private String purposeCode = "DCNS03";
    private String globalId = "2.16.764.1.1.2.1.X.X.X";
    private IncludedNote note = new IncludedNote();
    private ExchangedDocument exchangedDocument;

    @Test
    public void shouldGetAllInfo() {
        this.exchangedDocument = ExchangedDocument.builder()
                .id(this.id)
                .name(this.name)
                .typeCode(this.typeCode)
                .issueDateTime(this.issueDateTime)
                .purpose(this.purpose)
                .purposeCode(this.purposeCode)
                .globalId(this.globalId)
                .includedNote(note)
                .build();
        ExchangedDocumentXmlWrapper wrapper = new ExchangedDocumentXmlWrapper(exchangedDocument);

        assertEquals(this.exchangedDocument, wrapper.exchangedDocument);
    }
}
