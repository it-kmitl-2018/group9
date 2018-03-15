package th.ac.kmitl.soa.group9.taxInvoice.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuyerTest {

    private String id = "ABCDEFGHIJKLMNOPQRST123456789012345";
    private String globalId = "ABCDEFGHIJKLMNOPQRST123456789012345";
    private String name = "บริษัท ร่วมสมยัธุรกรรมอิเล็กทรอนิกส์ จำกัด";
    private String taxRegistrationId = "057552600909900000";
    private ContactDetail contactDetail = new ContactDetail();
    private Address address = new Address();

    @Test
    public void shouldGetAllInfo() {
        Buyer buyer = new Buyer();
        buyer.setId(this.id);
        buyer.setGlobalId(this.globalId);
        buyer.setName(this.name);
        buyer.setTaxRegistrationId(this.taxRegistrationId);
        buyer.setContactDetail(this.contactDetail);
        buyer.setAddress(this.address);

        assertEquals(this.id, buyer.getId());
        assertEquals(this.globalId, buyer.getGlobalId());
        assertEquals(this.name, buyer.getName());
        assertEquals(this.taxRegistrationId, buyer.getTaxRegistrationId());
        assertEquals(this.contactDetail, buyer.getContactDetail());
        assertEquals(this.address, buyer.getAddress());
    }
}