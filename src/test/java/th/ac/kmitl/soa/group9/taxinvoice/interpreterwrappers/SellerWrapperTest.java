package th.ac.kmitl.soa.group9.taxinvoice.interpreterwrappers;

import org.junit.Test;
import th.ac.kmitl.soa.group9.taxinvoice.forms.AddressForm;
import th.ac.kmitl.soa.group9.taxinvoice.forms.SellerForm;
import th.ac.kmitl.soa.group9.taxinvoice.models.interpreter.Seller;

import static org.junit.Assert.assertEquals;

public class SellerWrapperTest {
    private String id = "ABCDEFGHIJKLMNOPQRST123456789012345";
    private String globalId = "123456";
    private String name = "บริษัท ร่วมสมัยการค้าไทย จำกัด";
    private String taxRegistrationId = "0575526009099";
    private String branchId = "00000";
    private String email = "tax@rstmarket.co.th";

    @Test
    public void shouldGetAllInfo() {
        SellerForm sellerForm = SellerForm.builder()
                .id(this.id)
                .globalId(this.globalId)
                .name(this.name)
                .taxRegistrationId(this.taxRegistrationId)
                .branchId(this.branchId)
                .email(this.email)
                .addressForm(AddressForm.builder()
                        .build())
                .build();

        Seller seller = SellerWrapper.builder()
                .sellerForm(sellerForm)
                .build()
                .getModel();

        assertEquals(sellerForm
                .getId(), seller
                .getId());
        assertEquals(sellerForm
                .getGlobalId(), seller
                .getGlobalId());
        assertEquals(sellerForm
                .getName(), seller
                .getName());
        assertEquals(sellerForm
                .getTaxRegistrationId()
                + sellerForm
                .getBranchId(), seller
                .getTaxRegistrationId());
        assertEquals(sellerForm.getEmail(), seller
                .getContactDetail()
                .getEmail());
        assertEquals(sellerForm
                .getAddressForm()
                .getBuilding(), seller
                .getAddress()
                .getBuildingName());
        assertEquals(sellerForm
                .getAddressForm()
                .getBuildingNumber(), seller
                .getAddress()
                .getBuildingNumber());
        assertEquals(sellerForm
                .getAddressForm()
                .getSoi(), seller
                .getAddress()
                .getSoi());
        assertEquals(sellerForm
                .getAddressForm()
                .getVillage(), seller
                .getAddress()
                .getVillage());
        assertEquals(sellerForm
                .getAddressForm()
                .getMoo(), seller
                .getAddress()
                .getMoo());
        assertEquals(sellerForm
                .getAddressForm()
                .getStreetName(), seller
                .getAddress()
                .getStreetName());
        assertEquals(sellerForm
                .getAddressForm()
                .getCitySub(), seller
                .getAddress()
                .getCitySubDivisionName());
        assertEquals(sellerForm
                .getAddressForm()
                .getCity(), seller
                .getAddress()
                .getCityName());
        assertEquals(sellerForm
                .getAddressForm()
                .getCountrySub(), seller
                .getAddress()
                .getCountrySubDivisionId());
        assertEquals(sellerForm
                .getAddressForm()
                .getCountry(), seller
                .getAddress()
                .getCountryId());
        assertEquals(sellerForm
                .getAddressForm()
                .getPostCode(), seller
                .getAddress()
                .getPostCode());
    }
}
