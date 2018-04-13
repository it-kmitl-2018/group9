package th.ac.kmitl.soa.group9.taxinvoice.models.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

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

    @JsonProperty("class_code")
    public String productClassCode;

    @JsonProperty("class_name")
    public String productClassName;

    @JsonProperty("country_id")
    public String countryId;

    @JsonProperty("subject")
    public String subject;

    @JsonProperty("content")
    public String content;
}
