package th.ac.kmitl.soa.group9.taxInvoice.model;

public class Seller {

    private String id;
    private String globalId;
    private String name;
    private String taxRegistrationId;
    private ContactDetail contactDetail;
    private Address address;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGlobalId() {
        return globalId;
    }

    public void setGlobalId(String globalId) {
        this.globalId = globalId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTaxRegistrationId() {
        return taxRegistrationId;
    }

    public void setTaxRegistrationId(String taxRegistrationId) {
        this.taxRegistrationId = taxRegistrationId;
    }

    public ContactDetail getContactDetail() {
        return contactDetail;
    }

    public void setContactDetail(ContactDetail contactDetail) {
        this.contactDetail = contactDetail;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
