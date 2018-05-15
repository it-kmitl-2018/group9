package th.ac.kmitl.soa.group9.taxinvoice.models.xml;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import th.ac.kmitl.soa.group9.taxinvoice.converters.XmlConverter;

import static org.junit.Assert.assertEquals;

public class ContactDetailXmlTest {

    private String personName = "วีราพัชร์ มีลาภ";
    private String departmentName = "IT";
    private String email = "58070128@kmitl.ac.th";
    private String phoneNumber = "0812223333";
    private ContactDetailXml contactDetailXml;
    private String xml =
            "<ContactDetailXml>" +
                    "<person_name>วีราพัชร์ มีลาภ</person_name>" +
                    "<department_name>IT</department_name>" +
                    "<uri_id>58070128@kmitl.ac.th</uri_id>" +
                    "<phone_number>0812223333</phone_number>" +
            "</ContactDetailXml>";

    @Test
    public void shouldGetAllInfo() {
        contactDetailXml = ContactDetailXml.builder()
                .personName(personName)
                .departmentName(departmentName)
                .email(email)
                .phoneNumber(phoneNumber)
                .build();

        assertEquals(this.personName, contactDetailXml.personName);
        assertEquals(this.departmentName, contactDetailXml.departmentName);
        assertEquals(this.email, contactDetailXml.email);
        assertEquals(this.phoneNumber, contactDetailXml.phoneNumber);
    }

    @Test
    public void shouldGetCorrectXml() {
        XmlConverter xmlConverter = new XmlConverter();
        contactDetailXml = ContactDetailXml.builder()
                .personName(personName)
                .departmentName(departmentName)
                .email(email)
                .phoneNumber(phoneNumber)
                .build();

        Assertions.assertEquals(xml, xmlConverter.toXml(contactDetailXml));
    }
}
