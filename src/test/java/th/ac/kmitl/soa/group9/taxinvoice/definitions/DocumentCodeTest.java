package th.ac.kmitl.soa.group9.taxinvoice.definitions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DocumentCodeTest {

    private final String DEBIT_NOTE_CODE = "80";
    private final String CREDIT_NOTE_CODE = "81";
    private final String INVOICE_CODE = "380";
    private final String TAX_INVOICE_CODE = "388";
    private final String RECEIPT_CODE = "T01";
    private final String INVOICE_AND_TAX_INVOICE_CODE = "T02";
    private final String RECEIPT_TAX_INVOICE_CODE = "T03";
    private final String DELIVERY_AND_TAX_INVOICE_CODE = "T04";
    private final String ABBREVIATED_TAX_INVOICE_CODE = "T05";
    private final String RECEIPT_AND_ABBREVIATED_TAX_INVOICE_CODE = "T06";
    private final String CANCELLATION_NOTE_CODE = "T07";

    @Test
    public void shouldHaveTheCorrectCode() {
        assertEquals(DocumentCode.DEBIT_NOTE.getCode(), DEBIT_NOTE_CODE);
        assertEquals(DocumentCode.CREDIT_NOTE.getCode(), CREDIT_NOTE_CODE);
        assertEquals(DocumentCode.INVOICE.getCode(), INVOICE_CODE);
        assertEquals(DocumentCode.TAX_INVOICE.getCode(), TAX_INVOICE_CODE);
        assertEquals(DocumentCode.RECEIPT.getCode(), RECEIPT_CODE);
        assertEquals(DocumentCode.INVOICE_AND_TAX_INVOICE.getCode(), INVOICE_AND_TAX_INVOICE_CODE);
        assertEquals(DocumentCode.RECEIPT_TAX_INVOICE.getCode(), RECEIPT_TAX_INVOICE_CODE);
        assertEquals(DocumentCode.DELIVERY_AND_TAX_INVOICE.getCode(), DELIVERY_AND_TAX_INVOICE_CODE);
        assertEquals(DocumentCode.ABBREVIATED_TAX_INVOICE.getCode(), ABBREVIATED_TAX_INVOICE_CODE);
        assertEquals(DocumentCode.RECEIPT_AND_ABBREVIATED_TAX_INVOICE.getCode(), RECEIPT_AND_ABBREVIATED_TAX_INVOICE_CODE);
        assertEquals(DocumentCode.CANCELLATION_NOTE.getCode(), CANCELLATION_NOTE_CODE);
    }
}