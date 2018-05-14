package th.ac.kmitl.soa.group9.taxinvoice.models.interpreter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SenderTest {

    private String id = "ABCDEFGHIJKLMNOPQRST123456789012345";
    private String globalId = "123456";
    private String name = "บริษัท ร่วมสมัยการค้าไทย จำกัด";

    @Test
    public void shouldGetAllInfo() {
        Sender sender = Sender.builder()
                .id(this.id)
                .globalId(this.globalId)
                .name(name)
                .build();

        assertEquals(this.id, sender.getId());
        assertEquals(this.globalId, sender.getGlobalId());
        assertEquals(this.name, sender.getName());
    }
}
