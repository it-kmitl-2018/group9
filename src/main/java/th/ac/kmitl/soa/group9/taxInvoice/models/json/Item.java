package th.ac.kmitl.soa.group9.taxInvoice.models.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

@Builder
public class Item {

    public String description;
    public int quantity;
    public float pricePerItem;
    public boolean haveVat;
    public float vatRate;
}
