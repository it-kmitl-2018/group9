package th.ac.kmitl.soa.group9.taxinvoice.jsonwrappers;

import org.junit.Test;
import th.ac.kmitl.soa.group9.taxinvoice.models.interpreter.IncludedNote;

import static org.junit.Assert.assertEquals;

public class NoteWrapperTest {

    private String subject = "หมายเหตุ";
    private String content = "";
    private IncludedNote includedNote;

    @Test
    public void shouldGetAllInfo(){
        includedNote = IncludedNote.builder()
                .subject(subject)
                .content(content)
                .build();
        NoteWrapper noteWrapper = new NoteWrapper(includedNote);

        assertEquals(this.includedNote, noteWrapper.includedNote);
    }
}
