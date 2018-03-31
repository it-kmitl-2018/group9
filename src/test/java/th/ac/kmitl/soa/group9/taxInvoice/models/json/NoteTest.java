package th.ac.kmitl.soa.group9.taxInvoice.models.json;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NoteTest {

    private String subject;
    private String content;

    @Test
    public void shouldGetAllInfo() {
        Note note = Note.builder()
                .content(this.content)
                .subject(this.subject)
                .build();

        assertEquals(this.content, note.content);
        assertEquals(this.subject, note.subject);
    }
}