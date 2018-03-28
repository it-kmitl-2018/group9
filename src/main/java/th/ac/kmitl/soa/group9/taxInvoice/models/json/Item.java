package th.ac.kmitl.soa.group9.taxInvoice.models.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

@Builder
public class Item {

    public String description;
    public int quantity;

    @JsonProperty("price_per_item")
    public float pricePerItem;

    @JsonProperty("have_vat")
    public boolean haveVat;

    @JsonProperty("vat_rate")
    public float vatRate;
}
