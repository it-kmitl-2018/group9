package th.ac.kmitl.soa.group9.taxinvoice.models.interpreter;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Product {

    private String id;
    private String globalId;
    private String name;
    private String description;
    private String lotNumber;
    private Timestamp expiryDateTime;
    private ProductCategory productCategory;
    private String countryId;
    private IncludedNote note;
}
