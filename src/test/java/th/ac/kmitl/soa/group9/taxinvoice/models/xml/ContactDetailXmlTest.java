package th.ac.kmitl.soa.group9.taxinvoice.models.xml;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ContactDetailXmlTest {

    private String personName = "วีราพัชร์ มีลาภ";
    private String departmentName = "IT";
    private String email = "58070128@kmitl.ac.th";
    private String phoneNumber = "0812223333";

    @Test
    public void shouldGetAllInfo() {
        ContactDetailXml contactDetailXml = ContactDetailXml.builder()
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
}
