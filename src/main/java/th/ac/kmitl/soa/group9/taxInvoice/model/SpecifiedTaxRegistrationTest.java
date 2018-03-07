package th.ac.kmitl.soa.group9.taxInvoice.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpecifiedTaxRegistrationTest {

    private String id = "057552600909900000";

    @Test
    public void shouldGetAllInfo() {
        SpecifiedTaxRegistration specifiedTaxRegistration = new SpecifiedTaxRegistration();
        specifiedTaxRegistration.setId(this.id);

        assertEquals(this.id, specifiedTaxRegistration.getId());
    }
}
