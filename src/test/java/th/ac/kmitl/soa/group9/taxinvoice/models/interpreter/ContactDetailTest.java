package th.ac.kmitl.soa.group9.taxinvoice.models.interpreter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContactDetailTest {

    private String personName = "วีราพัชร์ มีลาภ";
    private String departmentName = "IT";
    private String email = "58070128@kmitl.ac.th";
    private String phoneNumber = "0812223333";

    @Test
    public void shouldGetAllInfo() {
        ContactDetail contactDetail = new ContactDetail();
        contactDetail.setPersonName(this.personName);
        contactDetail.setDepartmentName(this.departmentName);
        contactDetail.setEmail(this.email);
        contactDetail.setPhoneNumber(this.phoneNumber);

        assertEquals(this.personName, contactDetail.getPersonName());
        assertEquals(this.departmentName, contactDetail.getDepartmentName());
        assertEquals(this.email, contactDetail.getEmail());
        assertEquals(this.phoneNumber, contactDetail.getPhoneNumber());
    }
}
