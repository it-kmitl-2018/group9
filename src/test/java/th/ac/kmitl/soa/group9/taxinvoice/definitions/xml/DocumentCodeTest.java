package th.ac.kmitl.soa.group9.taxinvoice.definitions.xml;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.google.common.truth.Truth.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class DocumentCodeTest {

    @Test
    public void shouldGetCorrectDocumentCode() {
        Assertions.assertEquals(DocumentCode.DEBIT_NOTE, DocumentCode.parse("80"));
        assertEquals(DocumentCode.CREDIT_NOTE, DocumentCode.parse("81"));
        assertEquals(DocumentCode.INVOICE, DocumentCode.parse("380"));
        assertEquals(DocumentCode.TAX_INVOICE, DocumentCode.parse("388"));
        assertEquals(DocumentCode.RECEIPT, DocumentCode.parse("T01"));
        assertEquals(DocumentCode.INVOICE_AND_TAX_INVOICE, DocumentCode.parse("T02"));
        assertEquals(DocumentCode.RECEIPT_TAX_INVOICE, DocumentCode.parse("T03"));
        assertEquals(DocumentCode.DELIVERY_AND_TAX_INVOICE, DocumentCode.parse("T04"));
        assertEquals(DocumentCode.ABBREVIATED_TAX_INVOICE, DocumentCode.parse("T05"));
        assertEquals(DocumentCode.RECEIPT_AND_ABBREVIATED_TAX_INVOICE, DocumentCode.parse("T06"));
        assertEquals(DocumentCode.CANCELLATION_NOTE, DocumentCode.parse("T07"));
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenParsingNotExistedCode() {
        IllegalArgumentException e = assertThrows(
                IllegalArgumentException.class, () -> DocumentCode.parse("123"));
        assertThat(e).hasMessageThat().contains("Parsing not existed code");
    }
}