package th.ac.kmitl.soa.group9.taxinvoice.forms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InvoiceeFormTest {

    private String id = "ABCDEFGHIJKLMNOPQRST123456789012345";
    private String globalId = "123456";
    private String name = "บริษัท ร่วมสมัยการค้าไทย จำกัด";
    private String taxRegistrationId = "0575526009099";
    private String email = "tax@rstmarket.co.th";
    private AddressForm addressForm = AddressForm.builder().build();

    @Test
    public void shouldGetAllInfo() {
        InvoiceeForm invoiceeForm = InvoiceeForm.builder()
                .id(this.id)
                .globalId(this.globalId)
                .name(name)
                .taxRegistrationId(this.taxRegistrationId)
                .email(this.email)
                .addressForm(this.addressForm)
                .build();

        assertEquals(this.id, invoiceeForm.getId());
        assertEquals(this.globalId, invoiceeForm.getGlobalId());
        assertEquals(this.name, invoiceeForm.getName());
        assertEquals(this.taxRegistrationId, invoiceeForm.getTaxRegistrationId());
        assertEquals(this.email, invoiceeForm.getEmail());
        assertEquals(this.addressForm, invoiceeForm.getAddressForm());
    }
}
