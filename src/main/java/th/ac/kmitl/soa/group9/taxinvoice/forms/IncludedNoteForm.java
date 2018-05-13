package th.ac.kmitl.soa.group9.taxinvoice.forms;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class IncludedNoteForm {

    private String subject;
    private String content;
}
