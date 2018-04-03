package th.ac.kmitl.soa.group9.taxInvoice.models.interpreter;

import lombok.Builder;

@Builder
public class Address {

    private String postCode;
    private String buildingName;
    private String soi;
    private String village;
    private String moo;
    private String streetName;
    private String cityName;
    private String citySubDivisionName;
    private String countryId;
    private String countrySubDivisionId;
    private String buildingNumber;

    public Address() {
    }

    public Address(String postCode,
                   String buildingName,
                   String soi,
                   String village,
                   String moo,
                   String streetName,
                   String cityName,
                   String citySubDivisionName,
                   String countryId,
                   String countrySubDivisionId,
                   String buildingNumber) {

        this.postCode = postCode;
        this.buildingName = buildingName;
        this.soi = soi;
        this.village = village;
        this.moo = moo;
        this.streetName = streetName;
        this.cityName = cityName;
        this.citySubDivisionName = citySubDivisionName;
        this.countryId = countryId;
        this.countrySubDivisionId = countrySubDivisionId;
        this.buildingNumber = buildingNumber;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public String getSoi() {
        return soi;
    }

    public void setSoi(String soi) {
        this.soi = soi;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getMoo() {
        return moo;
    }

    public void setMoo(String moo) {
        this.moo = moo;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCitySubDivisionName() {
        return citySubDivisionName;
    }

    public void setCitySubDivisionName(String citySubDivisionName) {
        this.citySubDivisionName = citySubDivisionName;
    }

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public String getCountrySubDivisionId() {
        return countrySubDivisionId;
    }

    public void setCountrySubDivisionId(String countrySubDivisionId) {
        this.countrySubDivisionId = countrySubDivisionId;
    }

    public String getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
    }
}
