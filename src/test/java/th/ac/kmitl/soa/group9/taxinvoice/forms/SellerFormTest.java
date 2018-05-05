package th.ac.kmitl.soa.group9.taxinvoice.forms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SellerFormTest {

    private String id = "ABCDEFGHIJKLMNOPQRST123456789012345";
    private String globalId = "123456";
    private String name = "บริษัท ร่วมสมัยการค้าไทย จำกัด";
    private String taxRegistrationId = "0575526009099";
    private String branchId = "00000";
    private String email = "tax@rstmarket.co.th";
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
        final SellerForm sellerForm = SellerForm.builder().build();

        sellerForm.setId(this.id);
        sellerForm.setGlobalId(this.globalId);
        sellerForm.setName(this.name);
        sellerForm.setTaxRegistrationId(this.taxRegistrationId);
        sellerForm.setBranchId(this.branchId);
        sellerForm.setEmail(this.email);
        sellerForm.setBuilding(this.building);
        sellerForm.setBuildingNumber(this.buildingNumber);
        sellerForm.setSoi(this.soi);
        sellerForm.setVillage(this.village);
        sellerForm.setMoo(this.moo);
        sellerForm.setStreetName(this.streetName);
        sellerForm.setCitySub(this.citySub);
        sellerForm.setCity(this.city);
        sellerForm.setCountrySub(this.countrySub);
        sellerForm.setCountry(this.country);
        sellerForm.setPostCode(this.postCode);

        assertEquals(this.id, sellerForm.getId());
        assertEquals(this.globalId, sellerForm.getGlobalId());
        assertEquals(this.name, sellerForm.getName());
        assertEquals(this.taxRegistrationId, sellerForm.getTaxRegistrationId());
        assertEquals(this.branchId, sellerForm.getBranchId());
        assertEquals(this.email, sellerForm.getEmail());
        assertEquals(this.building, sellerForm.getBuilding());
        assertEquals(this.buildingNumber, sellerForm.getBuildingNumber());
        assertEquals(this.soi, sellerForm.getSoi());
        assertEquals(this.village, sellerForm.getVillage());
        assertEquals(this.moo, sellerForm.getMoo());
        assertEquals(this.streetName, sellerForm.getStreetName());
        assertEquals(this.citySub, sellerForm.getCitySub());
        assertEquals(this.city, sellerForm.getCity());
        assertEquals(this.countrySub, sellerForm.getCountrySub());
        assertEquals(this.country, sellerForm.getCountry());
        assertEquals(this.postCode, sellerForm.getPostCode());
    }
}
