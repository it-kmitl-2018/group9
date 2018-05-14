package th.ac.kmitl.soa.group9.taxinvoice.models.xml;

import org.junit.Test;
import th.ac.kmitl.soa.group9.taxinvoice.converters.XmlConverter;

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
    private AddressXml addressXml;

    private String xml =
            "<AddressXml>" +
                    "<post_code>10330</post_code>" +
                    "<building_name></building_name>" +
                    "<line_3>จุฬาซอย 10</line_3>" +
                    "<line_4></line_4>" +
                    "<line_5></line_5>" +
                    "<street_name>พระราม 6</street_name>" +
                    "<city_name>1004</city_name>" +
                    "<city_sub_division_name>100402</city_sub_division_name>" +
                    "<country_id>TH</country_id>" +
                    "<country_sub_division_id>10</country_sub_division_id>" +
                    "<building_number>799/89</building_number>" +
            "</AddressXml>";

    @Test
    public void shouldGetAllInfo() {
        addressXml = AddressXml.builder()
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

    @Test
    public void shouldGetCorrectXml() {
        XmlConverter xmlConverter = new XmlConverter();
        addressXml = AddressXml.builder()
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

        assertEquals(xml, xmlConverter.toXml(addressXml));
    }
}
