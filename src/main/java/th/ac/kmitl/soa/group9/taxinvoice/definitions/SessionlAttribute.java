package th.ac.kmitl.soa.group9.taxinvoice.definitions;

public enum SessionlAttribute {

    TAXINVOICEFORM("taxInvoiceForm"),
    SELLERFORM("sellerForm");

    private String attributeName;

    SessionlAttribute(String attributeName) {
        this.attributeName = attributeName;
    }

    public String getAttributeName() {
        return attributeName;
    }
}
