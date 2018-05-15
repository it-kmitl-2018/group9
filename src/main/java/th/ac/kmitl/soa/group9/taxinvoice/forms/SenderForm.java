package th.ac.kmitl.soa.group9.taxinvoice.forms;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class SenderForm {

    private String id;
    private String globalId;
    private String name;
}
