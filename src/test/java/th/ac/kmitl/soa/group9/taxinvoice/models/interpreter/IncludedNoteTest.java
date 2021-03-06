package th.ac.kmitl.soa.group9.taxinvoice.models.interpreter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IncludedNoteTest {
    private String subject = "หมายเหตุ";
    private String content = "";

    @Test
    public void shouldGetAllInfo() {
        IncludedNote includedNote = new IncludedNote();
        includedNote.setSubject(this.subject);
        includedNote.setContent(this.content);

        assertEquals(this.subject, includedNote.getSubject());
        assertEquals(this.content, includedNote.getContent());
    }
}
