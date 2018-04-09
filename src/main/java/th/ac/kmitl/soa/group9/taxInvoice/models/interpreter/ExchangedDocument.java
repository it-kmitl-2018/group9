package th.ac.kmitl.soa.group9.taxInvoice.models.interpreter;

import lombok.Builder;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Timestamp;

@Builder
public class ExchangedDocument {

    private String id;
    private String name;
    private String typeCode;

    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private Timestamp issueDateTime;

    private String purpose;
    private String purposeCode;
    private String globalId;
    private Timestamp creationDateTime;
    private IncludedNote includedNote;

    public ExchangedDocument() {
    }

    public ExchangedDocument(String id,
                             String name,
                             String typeCode,
                             Timestamp issueDateTime,
                             String purpose,
                             String purposeCode,
                             String globalId,
                             Timestamp creationDateTime,
                             IncludedNote includedNote) {
        this.id = id;
        this.name = name;
        this.typeCode = typeCode;
        this.issueDateTime = issueDateTime;
        this.purpose = purpose;
        this.purposeCode = purposeCode;
        this.globalId = globalId;
        this.creationDateTime = creationDateTime;
        this.includedNote = includedNote;
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
