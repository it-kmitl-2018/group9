package th.ac.kmitl.soa.group9.taxinvoice.interpreterwrappers;

import lombok.Builder;
import th.ac.kmitl.soa.group9.taxinvoice.forms.SenderForm;
import th.ac.kmitl.soa.group9.taxinvoice.models.interpreter.Sender;

@Builder
public class SenderWrapper {

    private SenderForm senderForm;

    public Sender getModel() {
        Sender sender = Sender.builder()
                .id(this.senderForm
                        .getId())
                .globalId(this.senderForm
                        .getGlobalId())
                .name(this.senderForm
                        .getName())
                .build();
        return sender;
    }
}
