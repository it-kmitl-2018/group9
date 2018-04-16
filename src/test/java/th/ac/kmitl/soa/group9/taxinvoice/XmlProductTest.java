package th.ac.kmitl.soa.group9.taxinvoice;

import org.junit.Test;
import th.ac.kmitl.soa.group9.taxinvoice.models.interpreter.IncludedNote;
import th.ac.kmitl.soa.group9.taxinvoice.models.interpreter.ProductCategory;

import java.sql.Timestamp;

import static org.junit.Assert.assertEquals;

public class XmlProductTest {

    private String id = "ABCDEFGHIJKLMNOPQRST123456789012345";
    private String globalId = "12345678901234";
    private String name = "กระดาษถ่ายเอกสาร A4 80 แกรม Double A";
    private String description = "ใช้งานร่วมกับเครื่องถ่ายเอกสาร เครื่องพิมพ์อิงค์เจ็ท เครื่องพิมพ์เลเซอร์ และเครื่องพิมพ์ดีดทั่วไป";
    private String lotNumber = "10000";
    private Timestamp expiryDateTime = new Timestamp(System.currentTimeMillis());
    private ProductCategory productCategory = ProductCategory.builder().build();
    private String countryId = "TH";
    private IncludedNote note = IncludedNote.builder().build();

    @Test
    public void shouldGetAllInfo(){
        XmlProduct xmlProduct = XmlProduct.builder()
                .id(this.id)
                .globalId(this.globalId)
                .name(this.name)
                .description(this.description)
                .lotNumber(this.lotNumber)
                .expiryDateTime(this.expiryDateTime)
                .productCategory(this.productCategory)
                .countryId(this.countryId)
                .note(this.note)
                .build();

        assertEquals(this.id , xmlProduct.id);
        assertEquals(this.globalId , xmlProduct.globalId);
        assertEquals(this.name ,xmlProduct.name);
        assertEquals(this.description, xmlProduct.description);
        assertEquals(this.lotNumber , xmlProduct.lotNumber);
        assertEquals(this.expiryDateTime , xmlProduct.expiryDateTime);
        assertEquals(this.productCategory , xmlProduct.productCategory);
        assertEquals(this.countryId , xmlProduct.countryId);
        assertEquals(this.note , xmlProduct.note);
    }
}
