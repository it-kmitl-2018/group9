package th.ac.kmitl.soa.group9.taxInvoice.models.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

@Builder
public class Note {

    @JsonProperty("subject")
    public String subject;

    @JsonProperty("content")
    public String content;
}
