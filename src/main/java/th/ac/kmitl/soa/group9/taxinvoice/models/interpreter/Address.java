package th.ac.kmitl.soa.group9.taxinvoice.models.interpreter;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Address {

    private String postCode;
    private String buildingName;
    private String soi;
    private String village;
    private String moo;
    private String streetName;
    private String cityName;
    private String citySubDivisionName;
    private String countryId;
    private String countrySubDivisionId;
    private String buildingNumber;
}
