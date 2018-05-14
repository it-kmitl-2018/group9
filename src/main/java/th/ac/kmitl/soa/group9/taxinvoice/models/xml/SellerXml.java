package th.ac.kmitl.soa.group9.taxinvoice.models.xml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Builder;
import th.ac.kmitl.soa.group9.taxinvoice.models.interpreter.Address;
import th.ac.kmitl.soa.group9.taxinvoice.models.interpreter.ContactDetail;


@Builder
public class SellerXml {

    @JacksonXmlProperty(localName = "id")
    public String id;

    @JacksonXmlProperty(localName = "global_id")
    public String globalId;

    @JacksonXmlProperty(localName = "name")
    public String name;

    @JacksonXmlProperty(localName = "specified_tax_registration")
    public String taxRegistrationId;

    @JacksonXmlProperty(localName = "defined_trade_contact")
    public ContactDetail contactDetail;

    @JacksonXmlProperty(localName = "postal_trade_address")
    public Address address;
}
