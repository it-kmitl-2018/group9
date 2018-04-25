package th.ac.kmitl.soa.group9.taxinvoice.jsonwrappers;

import th.ac.kmitl.soa.group9.taxinvoice.models.interpreter.Product;
import th.ac.kmitl.soa.group9.taxinvoice.models.xml.XmlProduct;

public class ProductWrapper {

    public Product product;

    public ProductWrapper(Product product) {
        this.product = product;
    }

    public XmlProduct getModelClass(){
        XmlProduct xmlProduct = XmlProduct.builder()
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
        return xmlProduct;
    }
}
