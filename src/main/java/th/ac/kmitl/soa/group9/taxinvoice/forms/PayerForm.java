package th.ac.kmitl.soa.group9.taxinvoice.forms;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class PayerForm {

    private String id;
    private String globalId;
    private String name;
    private String taxRegistrationId;
    private String email;
    private AddressForm addressForm;
}
