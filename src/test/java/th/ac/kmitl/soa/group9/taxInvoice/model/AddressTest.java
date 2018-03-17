package th.ac.kmitl.soa.group9.taxInvoice.model;

import org.junit.jupiter.api.Test;
import th.ac.kmitl.soa.group9.taxInvoice.models.Address;

import static org.junit.jupiter.api.Assertions.*;

class AddressTest {

    private String postCode = "10330";
    private String buildingName = "";
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
        Address address = new Address();
        address.setPostCode(this.postCode);
        address.setBuildingName(this.buildingName);
        address.setSoi(this.soi);
        address.setVillage(this.village);
        address.setMoo(this.moo);
        address.setStreetName(this.streetName);
        address.setCityName(this.cityName);
        address.setCitySubDivisionName(this.citySubDivisionName);
        address.setCountryId(this.countryId);
        address.setCountrySubDivisionId(this.countrySubDivisionId);
        address.setBuildingNumber(this.buildingNumber);

        assertEquals(this.postCode, address.getPostCode());
        assertEquals(this.buildingName, address.getBuildingName());
        assertEquals(this.soi, address.getSoi());
        assertEquals(this.village, address.getVillage());
        assertEquals(this.moo, address.getMoo());
        assertEquals(this.streetName, address.getStreetName());
        assertEquals(this.cityName, address.getCityName());
        assertEquals(this.citySubDivisionName, address.getCitySubDivisionName());
        assertEquals(this.countryId, address.getCountryId());
        assertEquals(this.countrySubDivisionId, address.getCountrySubDivisionId());
        assertEquals(this.buildingNumber, address.getBuildingNumber());
    }
}