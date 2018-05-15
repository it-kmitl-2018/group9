package th.ac.kmitl.soa.group9.taxinvoice.forms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PayerFormTest {

    private String id = "ABCDEFGHIJKLMNOPQRST123456789012345";
    private String globalId = "123456";
    private String name = "บริษัท ร่วมสมัยการค้าไทย จำกัด";
    private String taxRegistrationId = "0575526009099";
    private String email = "tax@rstmarket.co.th";
    private AddressForm addressForm = AddressForm.builder().build();

    @Test
    public void shouldGetAllInfo() {
        PayerForm payerForm = PayerForm.builder()
                .id(this.id)
                .globalId(this.globalId)
                .name(name)
                .taxRegistrationId(this.taxRegistrationId)
                .email(this.email)
                .addressForm(this.addressForm)
                .build();

        assertEquals(this.id, payerForm.getId());
        assertEquals(this.globalId, payerForm.getGlobalId());
        assertEquals(this.name, payerForm.getName());
        assertEquals(this.taxRegistrationId, payerForm.getTaxRegistrationId());
        assertEquals(this.email, payerForm.getEmail());
        assertEquals(this.addressForm, payerForm.getAddressForm());
    }
}
