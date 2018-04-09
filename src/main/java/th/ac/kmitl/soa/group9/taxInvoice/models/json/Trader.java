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
<<<<<<< HEAD
    public JsonAddress jsonAddress;
=======

    @JsonProperty("address")
    public Address address;
>>>>>>> 58529cae8d4f2ff6398ed54a0cb3da51239c32e3
}
