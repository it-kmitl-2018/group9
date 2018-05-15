package th.ac.kmitl.soa.group9.taxinvoice.models.interpreter;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Buyer {

    private String id;
    private String globalId;
    private String name;
    private String taxNumber;
    private ContactDetail contactDetail;
    private Address address;
}
