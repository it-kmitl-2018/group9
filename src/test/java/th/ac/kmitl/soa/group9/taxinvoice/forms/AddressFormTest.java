package th.ac.kmitl.soa.group9.taxinvoice.forms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddressFormTest {

    private String building = "อื้อจือเหลียง";
    private String buildingNumber = "968/1";
    private String soi = "ศาลาแดง 1";
    private String village = "ศาลาแดงวิลล่า";
    private String moo = "3";
    private String streetName = "สีลม";
    private String citySub = "101701";
    private String city = "1017";
    private String countrySub = "10";
    private String country = "TH";
    private String postCode = "10310";

    @Test
    public void shouldGetAllInfo() {
        AddressForm addressForm = AddressForm.builder()
                .building(this.building)
                .buildingNumber(this.buildingNumber)
                .soi(this.soi)
                .village(this.village)
                .moo(this.moo)
                .streetName(this.streetName)
                .citySub(this.citySub)
                .city(this.city)
                .countrySub(this.countrySub)
                .country(this.country)
                .postCode(this.postCode)
                .build();

        assertEquals(this.building, addressForm.getBuilding());
        assertEquals(this.buildingNumber, addressForm.getBuildingNumber());
        assertEquals(this.soi, addressForm.getSoi());
        assertEquals(this.village, addressForm.getVillage());
        assertEquals(this.moo, addressForm.getMoo());
        assertEquals(this.streetName, addressForm.getStreetName());
        assertEquals(this.citySub, addressForm.getCitySub());
        assertEquals(this.city, addressForm.getCity());
        assertEquals(this.countrySub, addressForm.getCountrySub());
        assertEquals(this.country, addressForm.getCountry());
        assertEquals(this.postCode, addressForm.getPostCode());
    }
}
