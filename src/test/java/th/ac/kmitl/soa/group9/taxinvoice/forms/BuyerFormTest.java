package th.ac.kmitl.soa.group9.taxinvoice.forms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BuyerFormTest {

    private String id = "ABCDEFGHIJKLMNOPQRST123456789012345";
    private String globalId = "123456";
    private String name = "อุรัสยา เสปอร์บันด์";
    private String taxRegistrationId = "1104599001271";
    private String branchId = "00000";
    private String email = "aurasya.s@gmail.com";
    private String building = "ไอดิโอคิว";
    private String buildingNumber = "799/89";
    private String soi = "จุฬาซอย 10";
    private String village = "จุฬาลงกรณ์";
    private String moo = "1";
    private String streetName = "พระราม 4";
    private String citySub = "100402";
    private String city = "1004";
    private String countrySub = "10";
    private String country = "TH";
    private String postCode = "10330";

    @Test
    public void shouldGetAllInfo() {
        BuyerForm buyerForm = BuyerForm.builder()
                .id(this.id)
                .globalId(this.globalId)
                .name(name)
                .taxRegistrationId(this.taxRegistrationId)
                .branchId(this.branchId)
                .email(this.email)
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

        assertEquals(this.id, buyerForm.getId());
        assertEquals(this.globalId, buyerForm.getGlobalId());
        assertEquals(this.name, buyerForm.getName());
        assertEquals(this.taxRegistrationId, buyerForm.getTaxRegistrationId());
        assertEquals(this.branchId, buyerForm.getBranchId());
        assertEquals(this.email, buyerForm.getEmail());
        assertEquals(this.building, buyerForm.getBuilding());
        assertEquals(this.buildingNumber, buyerForm.getBuildingNumber());
        assertEquals(this.soi, buyerForm.getSoi());
        assertEquals(this.village, buyerForm.getVillage());
        assertEquals(this.moo, buyerForm.getMoo());
        assertEquals(this.streetName, buyerForm.getStreetName());
        assertEquals(this.citySub, buyerForm.getCitySub());
        assertEquals(this.city, buyerForm.getCity());
        assertEquals(this.countrySub, buyerForm.getCountrySub());
        assertEquals(this.country, buyerForm.getCountry());
        assertEquals(this.postCode, buyerForm.getPostCode());
    }
}
