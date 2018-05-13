package th.ac.kmitl.soa.group9.taxinvoice.interpreterwrappers;

import lombok.Builder;
import th.ac.kmitl.soa.group9.taxinvoice.forms.SellerForm;
import th.ac.kmitl.soa.group9.taxinvoice.models.interpreter.Address;
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
                .address(Address.builder()
                        .buildingName(this.sellerForm
                                .getAddressForm()
                                .getBuilding())
                        .buildingNumber(this.sellerForm
                                .getAddressForm()
                                .getBuildingNumber())
                        .soi(this.sellerForm
                                .getAddressForm()
                                .getSoi())
                        .village(this.sellerForm
                                .getAddressForm()
                                .getVillage())
                        .moo(this.sellerForm
                                .getAddressForm()
                                .getMoo())
                        .streetName(this.sellerForm
                                .getAddressForm()
                                .getStreetName())
                        .citySubDivisionName(this.sellerForm
                                .getAddressForm()
                                .getCitySub())
                        .cityName(this.sellerForm
                                .getAddressForm()
                                .getCity())
                        .countrySubDivisionId(this.sellerForm
                                .getAddressForm()
                                .getCountrySub())
                        .countryId(this.sellerForm
                                .getAddressForm()
                                .getCountry())
                        .postCode(this.sellerForm
                                .getAddressForm()
                                .getPostCode())
                        .build())
                .build();
        return seller;
    }
}
