package th.ac.kmitl.soa.group9.taxinvoice.forms;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class AddressForm {

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
}
