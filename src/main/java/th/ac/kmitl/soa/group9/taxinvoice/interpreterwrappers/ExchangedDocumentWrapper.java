package th.ac.kmitl.soa.group9.taxinvoice.interpreterwrappers;

import th.ac.kmitl.soa.group9.taxinvoice.forms.TaxInvoiceForm;
import th.ac.kmitl.soa.group9.taxinvoice.models.interpreter.ExchangedDocument;
import th.ac.kmitl.soa.group9.taxinvoice.models.interpreter.IncludedNote;

import java.sql.Timestamp;

public class ExchangedDocumentWrapper {

    public TaxInvoiceForm taxInvoiceForm;

    public ExchangedDocumentWrapper(TaxInvoiceForm taxInvoiceForm) {
        this.taxInvoiceForm = taxInvoiceForm;
    }

    public ExchangedDocument getModel() {
        IncludedNote includedNote = IncludedNote.builder()
                .subject(this.taxInvoiceForm.getSubject())
                .content(this.taxInvoiceForm.getContent())
                .build();
        ExchangedDocument exchangedDocument = ExchangedDocument.builder()
                .id(this.taxInvoiceForm.getId())
                .name(this.taxInvoiceForm.getName())
                .typeCode(this.taxInvoiceForm.getTypeCode())
                .issueDateTime(this.taxInvoiceForm.getIssueDateTime())
                .purpose(this.taxInvoiceForm.getPurpose())
                .purposeCode(this.taxInvoiceForm.getPurposeCode())
                .globalId(this.taxInvoiceForm.getGlobalId())
                .creationDateTime(new Timestamp(System.currentTimeMillis()))
                .includedNote(includedNote)
                .build();

        return exchangedDocument;
    }
}
