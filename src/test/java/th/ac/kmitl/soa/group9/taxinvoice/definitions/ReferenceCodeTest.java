package th.ac.kmitl.soa.group9.taxinvoice.definitions;

import org.junit.jupiter.api.Test;

import static com.google.common.truth.Truth.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ReferenceCodeTest {

    @Test
    public void shouldGetCorrectReferenceCode() {
        assertEquals(ReferenceCode.INVOICE_NUMBER, ReferenceCode.parse("IV"));
        assertEquals(ReferenceCode.DOCUMENT_REFERENCE_NUMBER, ReferenceCode.parse("LC"));
        assertEquals(ReferenceCode.SERIAL_NUMBER, ReferenceCode.parse("LS"));
        assertEquals(ReferenceCode.ORDER_NUMBER, ReferenceCode.parse("ON"));
        assertEquals(ReferenceCode.ITEM_NUMBER, ReferenceCode.parse("SE"));
        assertEquals(ReferenceCode.PREVIOUS_TAX_INVOICE_NUMBER, ReferenceCode.parse("ALT"));
        assertEquals(ReferenceCode.DEBIT_NOTE_NUMBER, ReferenceCode.parse("DL"));
        assertEquals(ReferenceCode.CREDIT_NOTE_NUMBER, ReferenceCode.parse("CD"));
        assertEquals(ReferenceCode.MUTUAL_REFERENCE_NUMBER, ReferenceCode.parse("ZZZ"));
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenParsingNotExistedCode() {
        IllegalArgumentException e = assertThrows(
                IllegalArgumentException.class, () -> ReferenceCode.parse("123"));
        assertThat(e).hasMessageThat().contains("Parsing not existed code");
    }
}