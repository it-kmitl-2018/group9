package th.ac.kmitl.soa.group9.taxInvoice.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostalTradeAddressTest {

    private String postCode = "10330";
    private String buildingName = "";
    private String addressLine1 = "";
    private String addressLine2 = "";
    private String soi = "จุฬาซอย 10";
    private String village = "";
    private String moo = "";
    private String streetName = "พระราม 6";
    private String cityName = "1004";
    private String citySubDivisionName = "100402";
    private String countryId = "TH";
    private String countrySubDivisionId = "10";
    private String buildingNumber = "799/89";

    @Test
    public void shouldGetAllInfo() {
        PostalTradeAddress postalTradeAddress = new PostalTradeAddress();
        postalTradeAddress.setPostCode(this.postCode);
        postalTradeAddress.setBuildingName(this.buildingName);
        postalTradeAddress.setAddressLine1(this.addressLine1);
        postalTradeAddress.setAddressLine2(this.addressLine2);
        postalTradeAddress.setSoi(this.soi);
        postalTradeAddress.setVillage(this.village);
        postalTradeAddress.setMoo(this.moo);
        postalTradeAddress.setStreetName(this.streetName);
        postalTradeAddress.setCityName(this.cityName);
        postalTradeAddress.setCitySubDivisionName(this.citySubDivisionName);
        postalTradeAddress.setCountryId(this.countryId);
        postalTradeAddress.setCountrySubDivisionId(this.countrySubDivisionId);
        postalTradeAddress.setBuildingNumber(this.buildingNumber);

        assertEquals(this.postCode, postalTradeAddress.getPostCode());
        assertEquals(this.buildingName, postalTradeAddress.getBuildingName());
        assertEquals(this.addressLine1, postalTradeAddress.getAddressLine1());
        assertEquals(this.addressLine2, postalTradeAddress.getAddressLine2());
        assertEquals(this.soi, postalTradeAddress.getSoi());
        assertEquals(this.village, postalTradeAddress.getVillage());
        assertEquals(this.moo, postalTradeAddress.getMoo());
        assertEquals(this.streetName, postalTradeAddress.getStreetName());
        assertEquals(this.cityName, postalTradeAddress.getCityName());
        assertEquals(this.citySubDivisionName, postalTradeAddress.getCitySubDivisionName());
        assertEquals(this.countryId, postalTradeAddress.getCountryId());
        assertEquals(this.countrySubDivisionId, postalTradeAddress.getCountrySubDivisionId());
        assertEquals(this.buildingNumber, postalTradeAddress.getBuildingNumber());
    }
}