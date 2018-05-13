package th.ac.kmitl.soa.group9.taxinvoice.forms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BuyerFormTest {

    private String id = "ABCDEFGHIJKLMNOPQRST123456789012345";
    private String globalId = "123456";
    private String name = "อุรัสยา เสปอร์บันด์";
    private String taxRegistrationId = "1104599001271";
    private String branchId = "00000";
    private String email = "aurasya.s@gmail.com";
    private AddressForm addressForm = AddressForm.builder().build();

    @Test
    public void shouldGetAllInfo() {
        BuyerForm buyerForm = BuyerForm.builder()
                .id(this.id)
                .globalId(this.globalId)
                .name(name)
                .taxRegistrationId(this.taxRegistrationId)
                .branchId(this.branchId)
                .email(this.email)
                .addressForm(this.addressForm)
                .build();

        assertEquals(this.id, buyerForm.getId());
        assertEquals(this.globalId, buyerForm.getGlobalId());
        assertEquals(this.name, buyerForm.getName());
        assertEquals(this.taxRegistrationId, buyerForm.getTaxRegistrationId());
        assertEquals(this.branchId, buyerForm.getBranchId());
        assertEquals(this.email, buyerForm.getEmail());
        assertEquals(this.addressForm, buyerForm.getAddressForm());
    }
}
