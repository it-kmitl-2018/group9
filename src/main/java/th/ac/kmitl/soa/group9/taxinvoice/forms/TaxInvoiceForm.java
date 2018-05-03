package th.ac.kmitl.soa.group9.taxinvoice.forms;

import lombok.Builder;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Timestamp;

@Builder
public class TaxInvoiceForm {

    private String id;
    private String name;
    private String typeCode;

    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private Timestamp issueDateTime;

    private String purpose;
    private String purposeCode;
    private String globalId;
    private String subject;
    private String content;
    private String sellerId;
    private String sellerGlobalId;
    private String sellerName;
    private String sellerTaxRegId;
    private String sellerBranchId;
    private String sellerEmail;
    private String sellerBuilding;
    private String sellerBuildingNum;
    private String sellerSoi;
    private String sellerVillage;
    private String sellerMoo;
    private String sellerStreet;
    private String sellerCitySub;
    private String sellerCity;
    private String sellerCountrySub;
    private String sellerCountry;
    private String sellerPostCode;

    public TaxInvoiceForm(String id,
                          String name,
                          String typeCode,
                          Timestamp issueDateTime,
                          String purpose,
                          String purposeCode,
                          String globalId,
                          String subject,
                          String content,
                          String sellerId,
                          String sellerGlobalId,
                          String sellerName,
                          String sellerTaxRegId,
                          String sellerBranchId,
                          String sellerEmail,
                          String sellerBuilding,
                          String sellerBuildingNum,
                          String sellerSoi,
                          String sellerVillage,
                          String sellerMoo,
                          String sellerStreet,
                          String sellerCitySub,
                          String sellerCity,
                          String sellerCountrySub,
                          String sellerCountry,
                          String sellerPostCode) {
        this.id = id;
        this.name = name;
        this.typeCode = typeCode;
        this.issueDateTime = issueDateTime;
        this.purpose = purpose;
        this.purposeCode = purposeCode;
        this.globalId = globalId;
        this.subject = subject;
        this.content = content;
        this.sellerId = sellerId;
        this.sellerGlobalId = sellerGlobalId;
        this.sellerName = sellerName;
        this.sellerTaxRegId = sellerTaxRegId;
        this.sellerBranchId = sellerBranchId;
        this.sellerEmail = sellerEmail;
        this.sellerBuilding = sellerBuilding;
        this.sellerBuildingNum = sellerBuildingNum;
        this.sellerSoi = sellerSoi;
        this.sellerVillage = sellerVillage;
        this.sellerMoo = sellerMoo;
        this.sellerStreet = sellerStreet;
        this.sellerCitySub = sellerCitySub;
        this.sellerCity = sellerCity;
        this.sellerCountrySub = sellerCountrySub;
        this.sellerCountry = sellerCountry;
        this.sellerPostCode = sellerPostCode;
    }

    public TaxInvoiceForm() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public Timestamp getIssueDateTime() {
        return issueDateTime;
    }

    public void setIssueDateTime(Timestamp issueDateTime) {
        this.issueDateTime = issueDateTime;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getPurposeCode() {
        return purposeCode;
    }

    public void setPurposeCode(String purposeCode) {
        this.purposeCode = purposeCode;
    }

    public String getGlobalId() {
        return globalId;
    }

    public void setGlobalId(String globalId) {
        this.globalId = globalId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public String getSellerGlobalId() {
        return sellerGlobalId;
    }

    public void setSellerGlobalId(String sellerGlobalId) {
        this.sellerGlobalId = sellerGlobalId;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getSellerTaxRegId() {
        return sellerTaxRegId;
    }

    public void setSellerTaxRegId(String sellerTaxRegId) {
        this.sellerTaxRegId = sellerTaxRegId;
    }

    public String getSellerBranchId() {
        return sellerBranchId;
    }

    public void setSellerBranchId(String sellerBranchId) {
        this.sellerBranchId = sellerBranchId;
    }

    public String getSellerEmail() {
        return sellerEmail;
    }

    public void setSellerEmail(String sellerEmail) {
        this.sellerEmail = sellerEmail;
    }

    public String getSellerBuilding() {
        return sellerBuilding;
    }

    public void setSellerBuilding(String sellerBuilding) {
        this.sellerBuilding = sellerBuilding;
    }

    public String getSellerBuildingNum() {
        return sellerBuildingNum;
    }

    public void setSellerBuildingNum(String sellerBuildingNum) {
        this.sellerBuildingNum = sellerBuildingNum;
    }

    public String getSellerSoi() {
        return sellerSoi;
    }

    public void setSellerSoi(String sellerSoi) {
        this.sellerSoi = sellerSoi;
    }

    public String getSellerVillage() {
        return sellerVillage;
    }

    public void setSellerVillage(String sellerVillage) {
        this.sellerVillage = sellerVillage;
    }

    public String getSellerMoo() {
        return sellerMoo;
    }

    public void setSellerMoo(String sellerMoo) {
        this.sellerMoo = sellerMoo;
    }

    public String getSellerStreet() {
        return sellerStreet;
    }

    public void setSellerStreet(String sellerStreet) {
        this.sellerStreet = sellerStreet;
    }

    public String getSellerCitySub() {
        return sellerCitySub;
    }

    public void setSellerCitySub(String sellerCitySub) {
        this.sellerCitySub = sellerCitySub;
    }

    public String getSellerCity() {
        return sellerCity;
    }

    public void setSellerCity(String sellerCity) {
        this.sellerCity = sellerCity;
    }

    public String getSellerCountrySub() {
        return sellerCountrySub;
    }

    public void setSellerCountrySub(String sellerCountrySub) {
        this.sellerCountrySub = sellerCountrySub;
    }

    public String getSellerCountry() {
        return sellerCountry;
    }

    public void setSellerCountry(String sellerCountry) {
        this.sellerCountry = sellerCountry;
    }

    public String getSellerPostCode() {
        return sellerPostCode;
    }

    public void setSellerPostCode(String sellerPostCode) {
        this.sellerPostCode = sellerPostCode;
    }
}
