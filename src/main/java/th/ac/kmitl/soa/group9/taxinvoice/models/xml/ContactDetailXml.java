package th.ac.kmitl.soa.group9.taxinvoice.models.xml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Builder;

@Builder
public class ContactDetailXml {

    @JacksonXmlProperty(localName = "person_name")
    public String personName;

    @JacksonXmlProperty(localName = "department_name")
    public String departmentName;

    @JacksonXmlProperty(localName = "uri_id")
    public String email;

    @JacksonXmlProperty(localName = "phone_number")
    public String phoneNumber;
}
