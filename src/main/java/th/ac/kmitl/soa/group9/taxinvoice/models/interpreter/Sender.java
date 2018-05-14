package th.ac.kmitl.soa.group9.taxinvoice.models.interpreter;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Sender {

    private String id;
    private String globalId;
    private String name;
}
