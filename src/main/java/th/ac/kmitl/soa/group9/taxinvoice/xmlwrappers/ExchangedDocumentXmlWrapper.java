package th.ac.kmitl.soa.group9.taxinvoice.xmlwrappers;

import th.ac.kmitl.soa.group9.taxinvoice.models.interpreter.ExchangedDocument;
import th.ac.kmitl.soa.group9.taxinvoice.models.interpreter.IncludedNote;
import th.ac.kmitl.soa.group9.taxinvoice.models.xml.ExchangedDocumentXml;

public class ExchangedDocumentXmlWrapper {

    public ExchangedDocument exchangedDocument;

    public ExchangedDocumentXmlWrapper(ExchangedDocument exchangedDocument) {
        this.exchangedDocument = exchangedDocument;
    }

    public ExchangedDocumentXml getModelClass(){
        IncludedNote note = IncludedNote.builder()
                .subject(exchangedDocument.getIncludedNote().getSubject())
                .content(exchangedDocument.getIncludedNote().getContent())
                .build();
        ExchangedDocumentXml exchangedDocumentXml = ExchangedDocumentXml.builder()
                .id(exchangedDocument.getId())
                .name(exchangedDocument.getName())
                .typeCode(exchangedDocument.getTypeCode())
                .issueDateTime(exchangedDocument.getIssueDateTime())
                .purpose(exchangedDocument.getPurpose())
                .purposeCode(exchangedDocument.getPurposeCode())
                .globalId(exchangedDocument.getGlobalId())
                .creationDateTime(exchangedDocument.getCreationDateTime())
                .subject(note.getSubject())
                .content(note.getContent())
                .build();
        return exchangedDocumentXml;
    }
}
