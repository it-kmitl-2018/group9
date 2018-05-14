package th.ac.kmitl.soa.group9.taxinvoice.interpreterwrappers;

import lombok.Builder;
import th.ac.kmitl.soa.group9.taxinvoice.forms.AddressForm;
import th.ac.kmitl.soa.group9.taxinvoice.models.interpreter.Address;

@Builder
public class AddressWrapper {

    private AddressForm addressForm;

    public Address getModel() {
        Address address = Address.builder()
                .buildingName(this.addressForm
                        .getBuilding())
                .buildingNumber(this.addressForm
                        .getBuildingNumber())
                .soi(this.addressForm
                        .getSoi())
                .village(this.addressForm
                        .getVillage())
                .moo(this.addressForm
                        .getMoo())
                .streetName(this.addressForm
                        .getStreetName())
                .citySubDivisionName(this.addressForm
                        .getCitySub())
                .cityName(this.addressForm
                        .getCity())
                .countrySubDivisionId(this.addressForm
                        .getCountrySub())
                .countryId(this.addressForm
                        .getCountry())
                .postCode(this.addressForm
                        .getPostCode())
                .build();
        return address;
    }
}
