package th.ac.kmitl.soa.group9.taxinvoice.forms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PayeeFormTest {

    private String id = "ABCDEFGHIJKLMNOPQRST123456789012345";
    private String globalId = "123456";
    private String name = "บริษัท ร่วมสมัยเอนเตอร์ไพรซ์ จำกัด";
    private String taxRegistrationId = "0575526067842";
    private String email = "tax@rsenterprise.co.th";
    private AddressForm addressForm = AddressForm.builder().build();

    @Test
    public void shouldGetAllInfo() {
        PayeeForm payeeForm = PayeeForm.builder()
                .id(this.id)
                .globalId(this.globalId)
                .name(name)
                .taxRegistrationId(this.taxRegistrationId)
                .email(this.email)
                .addressForm(this.addressForm)
                .build();

        assertEquals(this.id, payeeForm.getId());
        assertEquals(this.globalId, payeeForm.getGlobalId());
        assertEquals(this.name, payeeForm.getName());
        assertEquals(this.taxRegistrationId, payeeForm.getTaxRegistrationId());
        assertEquals(this.email, payeeForm.getEmail());
        assertEquals(this.addressForm, payeeForm.getAddressForm());
    }
}
