package th.ac.kmitl.soa.group9.taxinvoice.interpreterwrappers;

import org.junit.jupiter.api.Test;
import th.ac.kmitl.soa.group9.taxinvoice.forms.AddressForm;
import th.ac.kmitl.soa.group9.taxinvoice.forms.DeliveryForm;
import th.ac.kmitl.soa.group9.taxinvoice.models.interpreter.Delivery;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeliveryWrapperTest {

    private String id = "ABCDEFGHIJKLMNOPQRST123456789012345";
    private String globalId = "123456";
    private String name = "บริษัท ร่วมสมัยการค้าไทย จำกัด";
    private String phone = "02-999-1999";
    private String contactName = "กรกต มรกตพักต์";
    private String departmentName = "ฝ่ายจัดซื้อ";
    private AddressForm addressForm = AddressForm.builder().build();

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

        Delivery delivery = DeliveryWrapper.builder()
                .deliveryForm(deliveryForm)
                .build()
                .getModel();

        assertEquals(deliveryForm.getId(), delivery.getId());
        assertEquals(deliveryForm.getGlobalId(), delivery.getGlobalId());
        assertEquals(deliveryForm.getName(), delivery.getName());
        assertEquals(deliveryForm.getPhone(), delivery.getPhone());
        assertEquals(deliveryForm.getContactName(), delivery.getContactName());
        assertEquals(deliveryForm.getDepartmentName(), delivery.getDepartmentName());
    }
}
