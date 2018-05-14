package th.ac.kmitl.soa.group9.taxinvoice.forms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SenderFormTest {

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

        assertEquals(this.id, senderForm.getId());
        assertEquals(this.globalId, senderForm.getGlobalId());
        assertEquals(this.name, senderForm.getName());
    }
}
