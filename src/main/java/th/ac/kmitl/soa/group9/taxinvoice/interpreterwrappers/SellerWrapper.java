package th.ac.kmitl.soa.group9.taxinvoice.interpreterwrappers;

import lombok.Builder;
import th.ac.kmitl.soa.group9.taxinvoice.forms.SellerForm;
import th.ac.kmitl.soa.group9.taxinvoice.models.interpreter.ContactDetail;
import th.ac.kmitl.soa.group9.taxinvoice.models.interpreter.Seller;

@Builder
public class SellerWrapper {

    public SellerForm sellerForm;

    public Seller getModel() {
        Seller seller = Seller.builder()
                .id(this.sellerForm
                        .getId())
                .globalId(this.sellerForm
                        .getGlobalId())
                .name(this.sellerForm
                        .getName())
                .taxRegistrationId(this.sellerForm
                        .getTaxRegistrationId()
                        + this.sellerForm
                        .getBranchId())
                .contactDetail(ContactDetail.builder()
                        .email(this.sellerForm
                                .getEmail())
                        .build())
                .address(AddressWrapper.builder()
                        .addressForm(this.sellerForm
                                .getAddressForm())
                        .build()
                        .getModel())
                .build();
        return seller;
    }
}
