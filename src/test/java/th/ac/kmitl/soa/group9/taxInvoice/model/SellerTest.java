package th.ac.kmitl.soa.group9.taxInvoice.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SellerTest {

    private String id = "";
    private String globalId = "";
    private String name = "บริษัท ร่วมสมยัธุรกรรมอิเล็กทรอนิกส์ จำกัด";

    @Test
    public void shouldGetAllInfo() {
        Seller seller = new Seller();
        seller.setId(this.id);
        seller.setGlobalId(this.globalId);
        seller.setName(this.name);

        assertEquals(this.id, seller.getId());
        assertEquals(this.globalId, seller.getGlobalId());
        assertEquals(this.name, seller.getName());
    }
}
