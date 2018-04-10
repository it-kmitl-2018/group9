package th.ac.kmitl.soa.group9.taxInvoice;

import th.ac.kmitl.soa.group9.taxInvoice.models.interpreter.Address;
import th.ac.kmitl.soa.group9.taxInvoice.models.json.JsonAddress;

public class AddressWrapper {

    public Address address;

    public AddressWrapper(Address address) {
        this.address = address;
    }

    public JsonAddress getModelClass(){
        JsonAddress jsonAddress = JsonAddress.builder()
                .lineOne(getLine(1,
                        this.address.getBuildingName(),
                        this.address.getBuildingNumber(),
                        this.address.getVillage(),
                        this.address.getSoi(),
                        this.address.getMoo(),
                        this.address.getStreetName()))
                .lineTwo(getLine(2,
                        this.address.getBuildingName(),
                        this.address.getBuildingNumber(),
                        this.address.getVillage(),
                        this.address.getSoi(),
                        this.address.getMoo(),
                        this.address.getStreetName()))
                .cityName(this.address.getCityName())
                .citySubDivisionName(this.address.getCitySubDivisionName())
                .postCode(this.address.getPostCode())
                .countrySubDivision(this.address.getCountrySubDivisionId())
                .countryName(this.address.getCountryId())
                .build();

        return jsonAddress;
    }

    private String getLine(int lineNum,
                         String buildingName,
                         String buildingNumber,
                         String village,
                         String soi,
                         String moo,
                         String streetName){
        String lineContent = "";

        switch (lineNum){
            case 1: lineContent = buildingName + " " + buildingNumber;
            break;
            case 2: lineContent = village + " " + soi + " " + moo + " " + streetName;
            break;
            default: lineContent = buildingName + " " + buildingNumber + " " +
                    village + " " + soi + " " + moo + " " + streetName;
        }
        return lineContent;
    }
}
