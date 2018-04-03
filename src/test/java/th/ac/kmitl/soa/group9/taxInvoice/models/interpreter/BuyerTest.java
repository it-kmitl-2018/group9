package th.ac.kmitl.soa.group9.taxInvoice.models.interpreter;

import org.junit.jupiter.api.Test;
import th.ac.kmitl.soa.group9.taxInvoice.models.interpreter.Address;
import th.ac.kmitl.soa.group9.taxInvoice.models.interpreter.Buyer;
import th.ac.kmitl.soa.group9.taxInvoice.models.interpreter.ContactDetail;

import static org.junit.jupiter.api.Assertions.*;

class BuyerTest {

    private String id = "ABCDEFGHIJKLMNOPQRST123456789012345";
    private String globalId = "ABCDEFGHIJKLMNOPQRST123456789012345";
    private String name = "บริษัท ร่วมสมยัธุรกรรมอิเล็กทรอนิกส์ จำกัด";
    private String taxNumber = "057552600909900000";
    private ContactDetail contactDetail = new ContactDetail();
    private Address address = new Address();

    @Test
    public void shouldGetAllInfo() {
        Buyer buyer = new Buyer();
        buyer.setId(this.id);
        buyer.setGlobalId(this.globalId);
        buyer.setName(this.name);
        buyer.setTaxNumber(this.taxNumber);
        buyer.setContactDetail(this.contactDetail);
        buyer.setAddress(this.address);

        assertEquals(this.id, buyer.getId());
        assertEquals(this.globalId, buyer.getGlobalId());
        assertEquals(this.name, buyer.getName());
        assertEquals(this.taxNumber, buyer.getTaxNumber());
        assertEquals(this.contactDetail, buyer.getContactDetail());
        assertEquals(this.address, buyer.getAddress());
    }
}