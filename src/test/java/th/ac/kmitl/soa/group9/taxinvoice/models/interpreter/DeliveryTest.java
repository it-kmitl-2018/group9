package th.ac.kmitl.soa.group9.taxinvoice.models.interpreter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeliveryTest {

    private String id = "ABCDEFGHIJKLMNOPQRST123456789012345";
    private String globalId = "123456";
    private String name = "บริษัท ร่วมสมัยการค้าไทย จำกัด";
    private String phone = "02-999-1999";
    private String contactName = "กรกต มรกตพักต์";
    private String departmentName = "ฝ่ายจัดซื้อ";

    @Test
    public void shouldGetAllInfo() {
        Delivery delivery = Delivery.builder()
                .id(this.id)
                .globalId(this.globalId)
                .name(name)
                .phone(this.phone)
                .contactName(this.contactName)
                .departmentName(this.departmentName)
                .build();

        assertEquals(this.id, delivery.getId());
        assertEquals(this.globalId, delivery.getGlobalId());
        assertEquals(this.name, delivery.getName());
        assertEquals(this.phone, delivery.getPhone());
        assertEquals(this.contactName, delivery.getContactName());
        assertEquals(this.departmentName, delivery.getDepartmentName());
    }
}
