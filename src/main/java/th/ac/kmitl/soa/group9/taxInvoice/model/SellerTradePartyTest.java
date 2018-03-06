package th.ac.kmitl.soa.group9.taxInvoice.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SellerTradePartyTest {
    private String id = "";
    private String globalId = "";
    private String name = "บริษัท ร่วมสมยัธุรกรรมอิเล็กทรอนิกส์ จำกัด";

    @Test
    public void shouldGetAllInfo() {
        SellerTradeParty sellerTradeParty = new SellerTradeParty();
        sellerTradeParty.setId(this.id);
        sellerTradeParty.setGlobalId(this.globalId);
        sellerTradeParty.setName(this.name);

        assertEquals(this.id, sellerTradeParty.getId());
        assertEquals(this.globalId, sellerTradeParty.getGlobalId());
        assertEquals(this.name, sellerTradeParty.getName());
    }
}
