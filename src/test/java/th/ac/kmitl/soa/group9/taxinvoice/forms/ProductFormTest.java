package th.ac.kmitl.soa.group9.taxinvoice.forms;

import org.junit.jupiter.api.Test;
import th.ac.kmitl.soa.group9.taxinvoice.models.interpreter.IncludedNote;
import th.ac.kmitl.soa.group9.taxinvoice.models.interpreter.ProductCategory;

import java.sql.Timestamp;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductFormTest {
    private String id = "ABCDEFGHIJKLMNOPQRST123456789012345";
    private String globalId = "12345678901234";
    private String name = "กระดาษถ่ายเอกสาร A4 80 แกรม Double A";
    private String description = "ใช้งานร่วมกับเครื่องถ่ายเอกสาร เครื่องพิมพ์อิงค์เจ็ท เครื่องพิมพ์เลเซอร์ และเครื่องพิมพ์ดีดทั่วไป";
    private String lotNumber = "10000";
    private Timestamp expiryDateTime = new Timestamp(System.currentTimeMillis());
    private ProductCatForm productCategory = ProductCatForm.builder().build();
    private String countryId = "TH";
    private IncludedNoteForm note = IncludedNoteForm.builder().build();

    @Test
    public void shouldGetAllInfo() {
        ProductForm productForm = ProductForm.builder()
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

        assertEquals(this.id, productForm.getId());
        assertEquals(this.globalId, productForm.getGlobalId());
        assertEquals(this.name, productForm.getName());
        assertEquals(this.description, productForm.getDescription());
        assertEquals(this.lotNumber, productForm.getLotNumber());
        assertEquals(this.expiryDateTime, productForm.getExpiryDateTime());
        assertEquals(this.productCategory, productForm.getProductCategory());
        assertEquals(this.countryId, productForm.getCountryId());
        assertEquals(this.note, productForm.getNote());

    }
}
