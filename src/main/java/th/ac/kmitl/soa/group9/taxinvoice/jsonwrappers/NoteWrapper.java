package th.ac.kmitl.soa.group9.taxinvoice.jsonwrappers;

import th.ac.kmitl.soa.group9.taxinvoice.models.interpreter.IncludedNote;
import th.ac.kmitl.soa.group9.taxinvoice.models.json.JsonNote;

public class NoteWrapper {

    public IncludedNote includedNote;

    public NoteWrapper(IncludedNote includedNote) {
        this.includedNote = includedNote;
    }

    private JsonNote getModelClass(){
        JsonNote jsonNote = JsonNote.builder()
                .subject(includedNote.getSubject())
                .content(includedNote.getContent())
                .build();
        return jsonNote;
    }
}
