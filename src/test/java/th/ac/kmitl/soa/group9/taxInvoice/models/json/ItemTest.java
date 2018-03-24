package th.ac.kmitl.soa.group9.taxInvoice.models.json;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {

    private String description = "Toyota Fortuner 3.0V AT 2014 TRD สีเทา ดีเซล 3,000 cc. เกียร์ออโต้";
    private int quantity = 1;
    private float price_per_item = 3990000;
    private boolean have_vat = true;
    private float vat_rate = 0.07f;

    @Test
    public void shouldGetAllInfo() {
        Item item = Item.builder()
                .description(this.description)
                .quantity(this.quantity)
                .price_per_item(this.price_per_item)
                .have_vat(this.have_vat)
                .vat_rate(this.vat_rate)
                .build();

        assertEquals(this.description, item.description);
        assertEquals(this.quantity, item.quantity);
        assertEquals(this.price_per_item, item.price_per_item);
        assertEquals(this.have_vat, item.have_vat);
        assertEquals(this.vat_rate, item.vat_rate);
    }
}