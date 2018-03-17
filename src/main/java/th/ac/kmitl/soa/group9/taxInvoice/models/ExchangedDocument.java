package th.ac.kmitl.soa.group9.taxInvoice.models;

import java.sql.Timestamp;

public class ExchangedDocument {
    private String id;
    private String name;
    private String typeCode;
    private Timestamp issueDateTime;
    private String purpose;
    private String purposeCode;
    private String globalId;
    private Timestamp creationDateTime;
    private IncludedNote includedNote;

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

    public Timestamp getCreationDateTime() {
        return creationDateTime;
    }

    public void setCreationDateTime(Timestamp creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    public IncludedNote getIncludedNote() {
        return includedNote;
    }

    public void setIncludedNote(IncludedNote includedNote) {
        this.includedNote = includedNote;
    }
}
