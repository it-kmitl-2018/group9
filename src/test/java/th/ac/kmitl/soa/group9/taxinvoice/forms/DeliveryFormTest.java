package th.ac.kmitl.soa.group9.taxinvoice.forms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeliveryFormTest {

    private String id = "ABCDEFGHIJKLMNOPQRST123456789012345";
    private String globalId = "123456";
    private String name = "บริษัท ร่วมสมัยการค้าไทย จำกัด";
    private String phone = "02-999-1999";
    private String contactName = "กรกต มรกตพักต์";
    private String departmentName = "ฝ่ายจัดซื้อ";

    @Test
    public void shouldGetAllInfo() {
        DeliveryForm deliveryForm = DeliveryForm.builder()
                .id(this.id)
                .globalId(this.globalId)
                .name(name)
                .phone(this.phone)
                .contactName(this.contactName)
                .departmentName(this.departmentName)
                .build();

        assertEquals(this.id, deliveryForm.getId());
        assertEquals(this.globalId, deliveryForm.getGlobalId());
        assertEquals(this.name, deliveryForm.getName());
        assertEquals(this.phone, deliveryForm.getPhone());
        assertEquals(this.contactName, deliveryForm.getContactName());
        assertEquals(this.departmentName, deliveryForm.getDepartmentName());
    }
}
