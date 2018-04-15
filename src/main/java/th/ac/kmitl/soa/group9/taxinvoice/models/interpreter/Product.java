package th.ac.kmitl.soa.group9.taxinvoice.models.interpreter;

import lombok.Builder;

import java.sql.Timestamp;

@Builder
public class Product {

    private String id;
    private String globalId;
    private String name;
    private String description;
    private String lotNumber;
    private Timestamp expiryDateTime;
    private ProductCategory productCategory;
    private String countryId;
    private IncludedNote note;

    public Product() {
    }

    public Product(String id,
                   String globalId,
                   String name,
                   String description,
                   String lotNumber,
                   Timestamp expiryDateTime,
                   ProductCategory productCategory,
                   String countryId,
                   IncludedNote note) {
        this.id = id;
        this.globalId = globalId;
        this.name = name;
        this.description = description;
        this.lotNumber = lotNumber;
        this.expiryDateTime = expiryDateTime;
        this.productCategory = productCategory;
        this.countryId = countryId;
        this.note = note;
    }

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLotNumber() {
        return lotNumber;
    }

    public void setLotNumber(String lotNumber) {
        this.lotNumber = lotNumber;
    }

    public Timestamp getExpiryDateTime() {
        return expiryDateTime;
    }

    public void setExpiryDateTime(Timestamp expiryDateTime) {
        this.expiryDateTime = expiryDateTime;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public IncludedNote getNote() {
        return note;
    }

    public void setNote(IncludedNote note) {
        this.note = note;
    }
}
