package th.ac.kmitl.soa.group9.taxinvoice.models.json;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JsonNoteTest {

    private String subject;
    private String content;

    @Test
    public void shouldGetAllInfo() {
        JsonNote jsonNote = JsonNote.builder()
                .content(this.content)
                .subject(this.subject)
                .build();

        assertEquals(this.content, jsonNote.content);
        assertEquals(this.subject, jsonNote.subject);
    }
}