package th.ac.kmitl.soa.group9.taxinvoice.models.json;

import org.junit.Test;
import th.ac.kmitl.soa.group9.taxinvoice.models.interpreter.IncludedNote;
import th.ac.kmitl.soa.group9.taxinvoice.models.interpreter.ProductCategory;

import java.sql.Timestamp;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JsonProductTest {

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
        JsonProduct jsonProduct = JsonProduct.builder()
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

        assertEquals(this.id , jsonProduct.id);
        assertEquals(this.globalId , jsonProduct.globalId);
        assertEquals(this.name , jsonProduct.name);
        assertEquals(this.description, jsonProduct.description);
        assertEquals(this.lotNumber , jsonProduct.lotNumber);
        assertEquals(this.expiryDateTime , jsonProduct.expiryDateTime);
        assertEquals(this.productCategory , jsonProduct.productCategory);
        assertEquals(this.countryId , jsonProduct.countryId);
        assertEquals(this.note , jsonProduct.note);
    }
}
