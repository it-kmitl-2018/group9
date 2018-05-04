package th.ac.kmitl.soa.group9.taxinvoice.forms;

import lombok.Builder;

@Builder
public class SellerForm {

    private String id;
    private String globalId;
    private String name;
    private String taxRegistrationId;
    private String branchId;
    private String email;
    private String building;
    private String buildingNumber;
    private String soi;
    private String village;
    private String moo;
    private String streetName;
    private String citySub;
    private String city;
    private String countrySub;
    private String country;
    private String postCode;

    public SellerForm(String id,
                      String globalId,
                      String name,
                      String taxRegistrationId,
                      String branchId,
                      String email,
                      String building,
                      String buildingNumber,
                      String soi,
                      String village,
                      String moo,
                      String streetName,
                      String citySub,
                      String city,
                      String countrySub,
                      String country,
                      String postCode) {
        this.id = id;
        this.globalId = globalId;
        this.name = name;
        this.taxRegistrationId = taxRegistrationId;
        this.branchId = branchId;
        this.email = email;
        this.building = building;
        this.buildingNumber = buildingNumber;
        this.soi = soi;
        this.village = village;
        this.moo = moo;
        this.streetName = streetName;
        this.citySub = citySub;
        this.city = city;
        this.countrySub = countrySub;
        this.country = country;
        this.postCode = postCode;
    }

    public SellerForm() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGlobalId() {
        return globalId;
    }

    public void setGlobalId(String globalId) {
        this.globalId = globalId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTaxRegistrationId() {
        return taxRegistrationId;
    }

    public void setTaxRegistrationId(String taxRegistrationId) {
        this.taxRegistrationId = taxRegistrationId;
    }

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
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

    public String getCitySub() {
        return citySub;
    }

    public void setCitySub(String citySub) {
        this.citySub = citySub;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountrySub() {
        return countrySub;
    }

    public void setCountrySub(String countrySub) {
        this.countrySub = countrySub;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }
}
