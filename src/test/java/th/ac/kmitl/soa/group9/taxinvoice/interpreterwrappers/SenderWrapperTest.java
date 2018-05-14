package th.ac.kmitl.soa.group9.taxinvoice.interpreterwrappers;

import org.junit.jupiter.api.Test;
import th.ac.kmitl.soa.group9.taxinvoice.forms.SenderForm;
import th.ac.kmitl.soa.group9.taxinvoice.models.interpreter.Sender;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SenderWrapperTest {

    private String id = "ABCDEFGHIJKLMNOPQRST123456789012345";
    private String globalId = "123456";
    private String name = "บริษัท ร่วมสมัยการค้าไทย จำกัด";

    @Test
    public void shouldGetAllInfo() {
        SenderForm senderForm = SenderForm.builder()
                .id(this.id)
                .globalId(this.globalId)
                .name(name)
                .build();

        Sender sender = SenderWrapper.builder()
                .senderForm(senderForm)
                .build()
                .getModel();

        assertEquals(senderForm.getId(), sender.getId());
        assertEquals(senderForm.getGlobalId(), sender.getGlobalId());
        assertEquals(senderForm.getName(), sender.getName());
    }
}
