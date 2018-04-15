package th.ac.kmitl.soa.group9.taxinvoice.jsonwrappers;

import th.ac.kmitl.soa.group9.taxinvoice.models.interpreter.Product;
import th.ac.kmitl.soa.group9.taxinvoice.models.json.JsonProduct;

public class ProductWrapper {

    public Product product;

    public ProductWrapper(Product product) {
        this.product = product;
    }

    public JsonProduct getModelClass(){
        JsonProduct jsonProduct = JsonProduct.builder()
                .id(product.getId())
                .globalId(product.getGlobalId())
                .name(product.getName())
                .description(product.getDescription())
                .lotNumber(product.getLotNumber())
                .expiryDateTime(product.getExpiryDateTime())
                .productCategory(product.getProductCategory())
                .countryId(product.getCountryId())
                .note(product.getNote())
                .build();
        return jsonProduct;
    }
}
