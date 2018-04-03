package th.ac.kmitl.soa.group9.taxInvoice.models.interpreter;

import lombok.Builder;

@Builder
public class IncludedNote {
    private String subject;
    private String content;

    public IncludedNote() {
    }

    public IncludedNote(String subject,
                        String content) {
        this.subject = subject;
        this.content = content;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
