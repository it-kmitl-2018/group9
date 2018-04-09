package th.ac.kmitl.soa.group9.taxInvoice.models.interpreter;

import org.junit.jupiter.api.Test;
import th.ac.kmitl.soa.group9.taxInvoice.models.interpreter.IncludedNote;
import th.ac.kmitl.soa.group9.taxInvoice.models.interpreter.Product;
import th.ac.kmitl.soa.group9.taxInvoice.models.interpreter.ProductCategory;

import java.sql.Timestamp;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProductTest {

    private String id = "ABCDEFGHIJKLMNOPQRST123456789012345";
    private String globalId = "12345678901234";
    private String name = "กระดาษถ่ายเอกสาร A4 80 แกรม Double A";
    private String description = "ใช้งานร่วมกับเครื่องถ่ายเอกสาร เครื่องพิมพ์อิงค์เจ็ท เครื่องพิมพ์เลเซอร์ และเครื่องพิมพ์ดีดทั่วไป";
    private String lotNumber = "10000";
    private Timestamp expiryDateTime = new Timestamp(System.currentTimeMillis());
    private ProductCategory productCategory = new ProductCategory();
    private String countryId = "TH";
    private IncludedNote note = new IncludedNote();

    @Test
    public void shouldGetAllInfo() {
        Product product = new Product();
        product.setId(this.id);
        product.setGlobalId(this.globalId);
        product.setName(this.name);
        product.setDescription(this.description);
        product.setLotNumber(this.lotNumber);
        product.setExpiryDateTime(this.expiryDateTime);
        product.setProductCategory(this.productCategory);
        product.setCountryId(this.countryId);
        product.setNote(this.note);

        assertEquals(this.id, product.getId());
        assertEquals(this.globalId, product.getGlobalId());
        assertEquals(this.name, product.getName());
        assertEquals(this.description, product.getDescription());
        assertEquals(this.lotNumber, product.getLotNumber());
        assertEquals(this.expiryDateTime, product.getExpiryDateTime());
        assertEquals(this.productCategory, product.getProductCategory());
        assertEquals(this.countryId, product.getCountryId());
        assertEquals(this.note, product.getNote());
    }
}