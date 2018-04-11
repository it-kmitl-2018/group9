package th.ac.kmitl.soa.group9.taxinvoice.models.json;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JsonAddressTest {

    private String lineOne = "สำนักงานใหญ่ เลขที่ 313/1";
    private String lineTwo = "ถนนรัชดาภิเษก แขวงบุคลโล เขตธนบุรี กรุงเทพมหานคร 10600";
    private String cityName = "ธนบุรี";
    private String citySubDivisionName = "บุคคโล";
    private String postCode = "10600";
    private String countrySubDivision = "กรุงเทพมหานคร";
    private String countryName = "TH";

    @Test
    public void shouldGetAllInfo() {
        JsonAddress jsonAddress = JsonAddress.builder()
                .lineOne(this.lineOne)
                .lineTwo(this.lineTwo)
                .cityName(this.cityName)
                .citySubDivisionName(this.citySubDivisionName)
                .postCode(this.postCode)
                .countrySubDivision(this.countrySubDivision)
                .countryName(this.countryName)
                .build();

        assertEquals(this.lineOne , jsonAddress.lineOne);
        assertEquals(this.lineTwo , jsonAddress.lineTwo);
        assertEquals(this.cityName , jsonAddress.cityName);
        assertEquals(this.citySubDivisionName , jsonAddress.citySubDivisionName);
        assertEquals(this.postCode , jsonAddress.postCode);
        assertEquals(this.countrySubDivision , jsonAddress.countrySubDivision);
        assertEquals(this.countryName , jsonAddress.countryName);
    }
}