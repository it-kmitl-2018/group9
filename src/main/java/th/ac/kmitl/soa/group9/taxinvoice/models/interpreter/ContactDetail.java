package th.ac.kmitl.soa.group9.taxinvoice.models.interpreter;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ContactDetail {

    private String personName;
    private String departmentName;
    private String email;
    private String phoneNumber;
}
