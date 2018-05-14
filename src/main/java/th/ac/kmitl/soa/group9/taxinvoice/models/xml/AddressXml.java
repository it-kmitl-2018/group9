package th.ac.kmitl.soa.group9.taxinvoice.models.xml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Builder;

@Builder
public class AddressXml {

    @JacksonXmlProperty(localName = "post_code")
    public String postCode;

    @JacksonXmlProperty(localName = "building_name")
    public String buildingName;

    @JacksonXmlProperty(localName = "line_3")
    public String soi;

    @JacksonXmlProperty(localName = "line_4")
    public String village;

    @JacksonXmlProperty(localName = "line_5")
    public String moo;

    @JacksonXmlProperty(localName = "street_name")
    public String streetName;

    @JacksonXmlProperty(localName = "city_name")
    public String cityName;

    @JacksonXmlProperty(localName = "city_sub_division_name")
    public String citySubDivisionName;

    @JacksonXmlProperty(localName = "country_id")
    public String countryId;

    @JacksonXmlProperty(localName = "country_sub_division_id")
    public String countrySubDivisionId;

    @JacksonXmlProperty(localName = "building_number")
    public String buildingNumber;
}
