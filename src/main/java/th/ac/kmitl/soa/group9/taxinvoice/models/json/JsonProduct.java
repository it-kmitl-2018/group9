package th.ac.kmitl.soa.group9.taxinvoice.models.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import th.ac.kmitl.soa.group9.taxinvoice.models.interpreter.IncludedNote;
import th.ac.kmitl.soa.group9.taxinvoice.models.interpreter.ProductCategory;

import java.sql.Timestamp;

@Builder
public class JsonProduct {

    @JsonProperty("id")
    public String id;

    @JsonProperty("global_id")
    public String globalId;

    @JsonProperty("name")
    public String name;

    @JsonProperty("description")
    public String description;

    @JsonProperty("batch_id")
    public String lotNumber;

    @JsonProperty("expiry_date_time")
    public Timestamp expiryDateTime;

    @JsonProperty("product_category")
    public ProductCategory productCategory;

    @JsonProperty("country_id")
    public String countryId;

    @JsonProperty("note")
    public IncludedNote note;
}
