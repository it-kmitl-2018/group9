package th.ac.kmitl.soa.group9.taxinvoice.forms;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class SellerForm implements BaseForm{

    private String id;
    private String globalId;
    private String name;
    private String taxRegistrationId;
    private String branchId;
    private String email;
    private AddressForm addressForm;
}
