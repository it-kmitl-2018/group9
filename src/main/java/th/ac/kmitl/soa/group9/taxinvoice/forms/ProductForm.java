package th.ac.kmitl.soa.group9.taxinvoice.forms;

import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;

@Builder
@Data
public class ProductForm {

    private String id;
    private String globalId;
    private String name;
    private String description;
    private String lotNumber;
    private Timestamp expiryDateTime;
    private ProductCatForm productCategory;
    private String countryId;
    private IncludedNoteForm note;
}
