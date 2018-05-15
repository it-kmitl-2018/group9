package th.ac.kmitl.soa.group9.taxinvoice.models.xml;

import org.junit.Test;
import th.ac.kmitl.soa.group9.taxinvoice.models.interpreter.Address;
import th.ac.kmitl.soa.group9.taxinvoice.models.interpreter.ContactDetail;

import static org.junit.Assert.assertEquals;

public class BuyerXmlTest {

    private String id = "ABCDEFGHIJKLMNOPQRST123456789012345";
    private String globalId = "ABCDEFGHIJKLMNOPQRST123456789012345";
    private String name = "บริษัท ร่วมสมยัธุรกรรมอิเล็กทรอนิกส์ จำกัด";
    private String taxNumber = "057552600909900000";
    private ContactDetail contactDetail = new ContactDetail();
    private Address address = new Address();

    @Test
    public void shouldGetAllInfo(){
        BuyerXml buyerXml = BuyerXml.builder()
                .id(id)
                .globalId(globalId)
                .name(name)
                .taxNumber(taxNumber)
                .contactDetail(contactDetail)
                .address(address)
                .build();

        assertEquals(this.id , buyerXml.id);
        assertEquals(this.globalId , buyerXml.globalId);
        assertEquals(this.name , buyerXml.name);
        assertEquals(this.taxNumber, buyerXml.taxNumber);
        assertEquals(this.contactDetail , buyerXml.contactDetail);
        assertEquals(this.address , buyerXml.address);
    }
}
