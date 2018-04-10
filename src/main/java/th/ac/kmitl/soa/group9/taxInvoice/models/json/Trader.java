package th.ac.kmitl.soa.group9.taxInvoice.models.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

@Builder
public class Trader {

    @JsonProperty("tax_number")
    public String taxNumber;

    @JsonProperty("branch_number")
    public String branchNumber;

    @JsonProperty("name_en")
    public String nameEn;

    @JsonProperty("name_th")
    public String nameTh;

    @JsonProperty("email")
    public String email;

    @JsonProperty("telephone")
    public String telephone;

    @JsonProperty("fax")
    public String fax;

    @JsonProperty("address")
    public JsonAddress address;
}
