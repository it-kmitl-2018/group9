package th.ac.kmitl.soa.group9.taxInvoice.models.interpreter;

import org.junit.jupiter.api.Test;
import th.ac.kmitl.soa.group9.taxInvoice.models.interpreter.Address;
import th.ac.kmitl.soa.group9.taxInvoice.models.interpreter.ContactDetail;
import th.ac.kmitl.soa.group9.taxInvoice.models.interpreter.Seller;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SellerTest {

    private String id = "";
    private String globalId = "";
    private String name = "บริษัท ร่วมสมยัธุรกรรมอิเล็กทรอนิกส์ จำกัด";
    private String taxRegistrationId = "057552600909900000";
    private ContactDetail contactDetail = new ContactDetail();
    private Address address = new Address();

    @Test
    public void shouldGetAllInfo() {
        Seller seller = new Seller();
        seller.setId(this.id);
        seller.setGlobalId(this.globalId);
        seller.setName(this.name);
        seller.setTaxRegistrationId(this.taxRegistrationId);
        seller.setContactDetail(this.contactDetail);
        seller.setAddress(this.address);

        assertEquals(this.id, seller.getId());
        assertEquals(this.globalId, seller.getGlobalId());
        assertEquals(this.name, seller.getName());
        assertEquals(this.taxRegistrationId, seller.getTaxRegistrationId());
        assertEquals(this.contactDetail, seller.getContactDetail());
        assertEquals(this.address, seller.getAddress());
    }
}
