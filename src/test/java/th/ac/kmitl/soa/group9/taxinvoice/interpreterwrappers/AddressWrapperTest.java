package th.ac.kmitl.soa.group9.taxinvoice.interpreterwrappers;

import org.junit.Test;
import th.ac.kmitl.soa.group9.taxinvoice.forms.AddressForm;
import th.ac.kmitl.soa.group9.taxinvoice.models.interpreter.Address;

import static org.junit.Assert.assertEquals;

public class AddressWrapperTest {

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

        Address address = AddressWrapper.builder()
                .addressForm(addressForm)
                .build()
                .getModel();

        assertEquals(addressForm
                .getBuilding(), address
                .getBuildingName());
        assertEquals(addressForm
                .getBuildingNumber(), address
                .getBuildingNumber());
        assertEquals(addressForm
                .getSoi(), address
                .getSoi());
        assertEquals(addressForm
                .getVillage(), address
                .getVillage());
        assertEquals(addressForm
                .getMoo(), address
                .getMoo());
        assertEquals(addressForm
                .getStreetName(), address
                .getStreetName());
        assertEquals(addressForm
                .getCitySub(), address
                .getCitySubDivisionName());
        assertEquals(addressForm
                .getCity(), address
                .getCityName());
        assertEquals(addressForm
                .getCountrySub(), address
                .getCountrySubDivisionId());
        assertEquals(addressForm
                .getCountry(), address
                .getCountryId());
        assertEquals(addressForm
                .getPostCode(), address
                .getPostCode());
    }
}
