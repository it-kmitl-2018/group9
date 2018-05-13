package th.ac.kmitl.soa.group9.taxinvoice.forms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SellerFormTest {

    private String id = "ABCDEFGHIJKLMNOPQRST123456789012345";
    private String globalId = "123456";
    private String name = "บริษัท ร่วมสมัยการค้าไทย จำกัด";
    private String taxRegistrationId = "0575526009099";
    private String branchId = "00000";
    private String email = "tax@rstmarket.co.th";
    private AddressForm addressForm = AddressForm.builder().build();

    @Test
    public void shouldGetAllInfo() {
        SellerForm sellerForm = SellerForm.builder()
                .id(this.id)
                .globalId(this.globalId)
                .name(name)
                .taxRegistrationId(this.taxRegistrationId)
                .branchId(this.branchId)
                .email(this.email)
                .addressForm(this.addressForm)
                .build();

        assertEquals(this.id, sellerForm.getId());
        assertEquals(this.globalId, sellerForm.getGlobalId());
        assertEquals(this.name, sellerForm.getName());
        assertEquals(this.taxRegistrationId, sellerForm.getTaxRegistrationId());
        assertEquals(this.branchId, sellerForm.getBranchId());
        assertEquals(this.email, sellerForm.getEmail());
        assertEquals(this.addressForm, sellerForm.getAddressForm());
    }
}
