package th.ac.kmitl.soa.group9.taxInvoice.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContactDetailTest {

    private String personName = "";
    private String departmentName = "";

    @Test
    public void shouldGetAllInfo() {
        ContactDetail contactDetail = new ContactDetail();
        contactDetail.setPersonName(this.personName);
        contactDetail.setDepartmentName(this.departmentName);

        assertEquals(this.personName, contactDetail.getPersonName());
        assertEquals(this.departmentName, contactDetail.getDepartmentName());
    }
}
