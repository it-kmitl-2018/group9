package th.ac.kmitl.soa.group9.taxInvoice.models.json;

import lombok.Builder;

@Builder
public class Item {

    public String description;
    public int quantity;
    public float price_per_item;
    public boolean have_vat;
    public float vat_rate;
}
