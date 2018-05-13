package th.ac.kmitl.soa.group9.taxinvoice.forms;

import lombok.Builder;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Timestamp;

@Builder
@Data
public class ExchangedDocForm {

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
}
