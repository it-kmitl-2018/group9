package th.ac.kmitl.soa.group9.taxinvoice.interpreterwrappers;

import lombok.Builder;
import th.ac.kmitl.soa.group9.taxinvoice.forms.DeliveryForm;
import th.ac.kmitl.soa.group9.taxinvoice.models.interpreter.Delivery;

@Builder
public class DeliveryWrapper {

    private DeliveryForm deliveryForm;

    public Delivery getModel() {
        Delivery delivery = Delivery.builder()
                .id(this.deliveryForm
                        .getId())
                .globalId(this.deliveryForm
                        .getGlobalId())
                .name(this.deliveryForm
                        .getName())
                .phone(this.deliveryForm
                        .getPhone())
                .contactName(this.deliveryForm
                        .getContactName())
                .departmentName(this.deliveryForm
                        .getDepartmentName())
                .build();
        return delivery;
    }
}
