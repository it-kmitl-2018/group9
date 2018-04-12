package th.ac.kmitl.soa.group9.taxinvoice.models.interpreter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProductCategoryTest {

    private String code = "14111507";
    private String name = "กระดาษถ่ายเอกสารหรือพิมพ์งานทั่วไป";

    @Test
    public void shouldGetAllInfo() {
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCode(this.code);
        productCategory.setName(this.name);

        assertEquals(this.code, productCategory.getCode());
        assertEquals(this.name, productCategory.getName());
    }
}