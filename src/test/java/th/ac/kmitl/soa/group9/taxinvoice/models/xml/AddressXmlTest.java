package th.ac.kmitl.soa.group9.taxinvoice.models.xml;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddressXmlTest {

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
        AddressXml addressXml = AddressXml.builder()
                .postCode(postCode)
                .buildingName(buildingName)
                .soi(soi)
                .village(village)
                .moo(moo)
                .streetName(streetName)
                .cityName(cityName)
                .citySubDivisionName(citySubDivisionName)
                .countryId(countryId)
                .countrySubDivisionId(countrySubDivisionId)
                .buildingNumber(buildingNumber)
                .build();

        assertEquals(this.postCode, addressXml.postCode);
        assertEquals(this.buildingName, addressXml.buildingName);
        assertEquals(this.soi, addressXml.soi);
        assertEquals(this.village, addressXml.village);
        assertEquals(this.moo, addressXml.moo);
        assertEquals(this.streetName, addressXml.streetName);
        assertEquals(this.cityName, addressXml.cityName);
        assertEquals(this.citySubDivisionName, addressXml.citySubDivisionName);
        assertEquals(this.countryId, addressXml.countryId);
        assertEquals(this.countrySubDivisionId, addressXml.countrySubDivisionId);
        assertEquals(this.buildingNumber, addressXml.buildingNumber);
    }
}
