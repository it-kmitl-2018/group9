package th.ac.kmitl.soa.group9.taxInvoice.models.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

import java.util.List;

@Builder
public class TaxInvoice {

    public String number;
    public Trader seller;
    public Trader buyer;

    @JsonProperty("transaction_date")
    public String transactionDate;

    public Note note;
    public List<Item> items;
}
