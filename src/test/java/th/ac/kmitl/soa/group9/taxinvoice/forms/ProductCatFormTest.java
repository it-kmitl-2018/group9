package th.ac.kmitl.soa.group9.taxinvoice.forms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductCatFormTest {

    private String code = "14111507";
    private String name = "กระดาษถ่ายเอกสารหรือพิมพ์งานทั่วไป";

    @Test
    public void shouldGetAllInfo() {
        ProductCatForm productCatForm = ProductCatForm.builder()
                .code(this.code)
                .name(this.name)
                .build();

        assertEquals(this.code, productCatForm.getCode());
        assertEquals(this.name, productCatForm.getName());
    }
}
