package th.ac.kmitl.soa.group9.taxInvoice;

import th.ac.kmitl.soa.group9.taxInvoice.models.Address;

public class AddressWrapper {

    public Address address;

    public AddressWrapper(Address address) {
        this.address = address;
    }

    public th.ac
            .kmitl
            .soa
            .group9
            .taxInvoice
            .models
            .json
            .Address getModelClass(){
        th.ac
                .kmitl
                .soa
                .group9
                .taxInvoice
                .models
                .json
                .Address address = th.ac
                .kmitl
                .soa
                .group9
                .taxInvoice
                .models
                .json
                .Address
                .builder()
                .lineOne(getLineOne(this.address.getBuildingName(),
                        this.address.getBuildingNumber()))
                .lineTwo(getLineTwo(this.address.getVillage(),
                        this.address.getSoi(),
                        this.address.getMoo(),
                        this.address.getStreetName()))
                .cityName(this.address.getCityName())
                .citySubDivisionName(this.address.getCitySubDivisionName())
                .postCode(this.address.getPostCode())
                .countrySubDivision(this.address.getCountrySubDivisionId())
                .countryName(this.address.getCountryId())
                .build();

        return address;
    }

    private String getLineOne(String buildingName, String buildingNumber){
        String lineOne = buildingName + " " + buildingNumber;
        return lineOne;
    }

    private String getLineTwo(String village, String soi, String moo, String streetName){
        String lineTwo = village + " " + soi + " " + moo + " " + streetName;
        return lineTwo;
    }
}
