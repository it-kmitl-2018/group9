package th.ac.kmitl.soa.group9.taxinvoice.xmlwrappers;

import th.ac.kmitl.soa.group9.taxinvoice.models.interpreter.Product;
import th.ac.kmitl.soa.group9.taxinvoice.models.xml.ProductXml;

public class ProductWrapper {

    public Product product;

    public ProductWrapper(Product product) {
        this.product = product;
    }

    public ProductXml getModelClass(){
        ProductXml productXml = ProductXml.builder()
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
        return productXml;
    }
}
