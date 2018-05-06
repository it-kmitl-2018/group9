package th.ac.kmitl.soa.group9.taxinvoice.definitions;

public enum PageRouting {

    TAXINVOICEFORM("taxinvoice_form"),
    TAXINVOICEPREVIEW("preview_taxinvoice");

    private String keyPage;

    PageRouting(String keyPage) {
        this.keyPage = keyPage;
    }

    public String getKeyPage() {
        return keyPage;
    }
}
