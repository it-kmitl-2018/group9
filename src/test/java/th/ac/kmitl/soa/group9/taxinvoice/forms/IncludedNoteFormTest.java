package th.ac.kmitl.soa.group9.taxinvoice.forms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IncludedNoteFormTest {

    private String subject = "หมายเหตุ";
    private String content = "โปรดตรวจสอบข้อมูลอีกครั้ง";

    @Test
    public void shouldGetAllInfo() {
        IncludedNoteForm includedNoteForm = IncludedNoteForm.builder()
                .subject(this.subject)
                .content(this.content)
                .build();

        assertEquals(this.subject, includedNoteForm.getSubject());
        assertEquals(this.content, includedNoteForm.getContent());
    }
}
