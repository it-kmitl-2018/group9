package th.ac.kmitl.soa.group9.taxinvoice.models.xml;

import org.junit.Test;
import th.ac.kmitl.soa.group9.taxinvoice.models.interpreter.Address;
import th.ac.kmitl.soa.group9.taxinvoice.models.interpreter.ContactDetail;

import static org.junit.Assert.assertEquals;

public class SellerXmlTest {

    private String id = "";
    private String globalId = "";
    private String name = "บริษัท ร่วมสมยัธุรกรรมอิเล็กทรอนิกส์ จำกัด";
    private String taxRegistrationId = "057552600909900000";
    private ContactDetail contactDetail = new ContactDetail();
    private Address address = new Address();

    @Test
    public void shouldGetAllInfo(){
        SellerXml sellerXml = SellerXml.builder()
                .id(id)
                .globalId(globalId)
                .name(name)
                .taxRegistrationId(taxRegistrationId)
                .contactDetail(contactDetail)
                .address(address)
                .build();

        assertEquals(this.id , sellerXml.id);
        assertEquals(this.globalId , sellerXml.globalId);
        assertEquals(this.name , sellerXml.name);
        assertEquals(this.taxRegistrationId, sellerXml.taxRegistrationId);
        assertEquals(this.contactDetail , sellerXml.contactDetail);
        assertEquals(this.address , sellerXml.address);
    }
}
