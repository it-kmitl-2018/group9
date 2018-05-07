package th.ac.kmitl.soa.group9.taxinvoice.definitions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReferenceCodeTest {

    private final String INVOICE_NUMBER_CODE = "IV";
    private final String DOCUMENT_REFERENCE_NUMBER_CODE = "LC";
    private final String SERIAL_NUMBER_CODE = "LS";
    private final String ORDER_NUMBER_CODE = "ON";
    private final String ITEM_NUMBER_CODE = "SE";
    private final String PREVIOUS_TAX_INVOICE_NUMBER_CODE = "ALT";
    private final String DEBIT_NOTE_NUMBER_CODE = "DL";
    private final String CREDIT_NOTE_NUMBER_CODE = "CD";
    private final String MUTUAL_REFERENCE_NUMBER_CODE = "ZZZ";

    @Test
    public void shouldGetCorrectCode() {
        assertEquals(ReferenceCode.INVOICE_NUMBER.getRefCode(), INVOICE_NUMBER_CODE);
        assertEquals(ReferenceCode.DOCUMENT_REFERENCE_NUMBER.getRefCode(), DOCUMENT_REFERENCE_NUMBER_CODE);
        assertEquals(ReferenceCode.SERIAL_NUMBER.getRefCode(), SERIAL_NUMBER_CODE);
        assertEquals(ReferenceCode.ORDER_NUMBER.getRefCode(), ORDER_NUMBER_CODE);
        assertEquals(ReferenceCode.ITEM_NUMBER.getRefCode(), ITEM_NUMBER_CODE);
        assertEquals(ReferenceCode.PREVIOUS_TAX_INVOICE_NUMBER.getRefCode(), PREVIOUS_TAX_INVOICE_NUMBER_CODE);
        assertEquals(ReferenceCode.DEBIT_NOTE_NUMBER.getRefCode(), DEBIT_NOTE_NUMBER_CODE);
        assertEquals(ReferenceCode.CREDIT_NOTE_NUMBER.getRefCode(), CREDIT_NOTE_NUMBER_CODE);
        assertEquals(ReferenceCode.MUTUAL_REFERENCE_NUMBER.getRefCode(), MUTUAL_REFERENCE_NUMBER_CODE);
    }
}