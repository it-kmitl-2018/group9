package th.ac.kmitl.soa.group9.taxInvoice.model;

import th.ac.kmitl.soa.group9.taxInvoice.definitions.TypeCode;

import java.sql.Timestamp;

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

}
