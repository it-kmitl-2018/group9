package th.ac.kmitl.soa.group9.taxInvoice.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DefinedTradeContactTest {

    private String personName = "";
    private String departmentName = "";

    @Test
    public void shouldGetAllInfo() {
        DefinedTradeContact definedTradeContact = new DefinedTradeContact();
        definedTradeContact.setPersonName(this.personName);
        definedTradeContact.setDepartmentName(this.departmentName);

        assertEquals(this.personName, definedTradeContact.getPersonName());
        assertEquals(this.departmentName, definedTradeContact.getDepartmentName());
    }
}
