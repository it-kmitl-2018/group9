package th.ac.kmitl.soa.group9.taxinvoice.models.interpreter;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Timestamp;

@NoArgsConstructor
@AllArgsConstructor
@Data
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
}
