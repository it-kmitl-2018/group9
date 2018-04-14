package th.ac.kmitl.soa.group9.taxinvoice.models.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

import java.util.List;

@Builder
public class TaxInvoice {

    @JsonProperty("number")
    public String number;

    @JsonProperty("seller")
    public Trader seller;

    @JsonProperty("buyer")
    public Trader buyer;

    @JsonProperty("transaction_date")
    public String transactionDate;

    @JsonProperty("jsonNote")
    public JsonNote jsonNote;

    @JsonProperty("items")
    public List<Item> items;
}
