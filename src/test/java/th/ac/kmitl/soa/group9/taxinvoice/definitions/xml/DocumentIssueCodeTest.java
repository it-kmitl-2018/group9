package th.ac.kmitl.soa.group9.taxinvoice.definitions.xml;

import org.junit.jupiter.api.Test;

import static com.google.common.truth.Truth.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class DocumentIssueCodeTest {

    @Test
    public void shouldGetCorrectDocumentIssueCode() {
        assertEquals(DocumentIssueCode.PRODUCT_PRICE_INCREASED, DocumentIssueCode.parse("DBNG01"));
        assertEquals(DocumentIssueCode.PRODUCT_PRICE_UNDERRATED, DocumentIssueCode.parse("DBNG02"));
        assertEquals(DocumentIssueCode.OTHER_PRODUCT_ISSUE_DEBIT_NOTE, DocumentIssueCode.parse("DBNG99"));
        assertEquals(DocumentIssueCode.SERVICE_CHARGE_INCREASED, DocumentIssueCode.parse("DBNS01"));
        assertEquals(DocumentIssueCode.SERVICE_CHARGE_UNDERRATED, DocumentIssueCode.parse("DBNS02"));
        assertEquals(DocumentIssueCode.OTHER_SERVICE_ISSUE_DEBIT_NOTE, DocumentIssueCode.parse("DBNS99"));
        assertEquals(DocumentIssueCode.PRODUCT_PRICE_DISCOUNTED, DocumentIssueCode.parse("DCNG01"));
        assertEquals(DocumentIssueCode.PRODUCT_DAMAGED, DocumentIssueCode.parse("DCNG02"));
        assertEquals(DocumentIssueCode.INSUFFICIENT_PRODUCT_AMOUNT, DocumentIssueCode.parse("DCNG03"));
        assertEquals(DocumentIssueCode.PRODUCT_PRICE_OVERRATED, DocumentIssueCode.parse("DCNG04"));
        assertEquals(DocumentIssueCode.PRODUCT_RETURNED, DocumentIssueCode.parse("DCNG05"));
        assertEquals(DocumentIssueCode.OTHER_PRODUCT_ISSUE_CREDIT_NOTE, DocumentIssueCode.parse("DCNG99"));
        assertEquals(DocumentIssueCode.SERVICE_CHARGE_DISCOUNTED, DocumentIssueCode.parse("DCNS01"));
        assertEquals(DocumentIssueCode.INSUFFICIENT_SERVICE_CHARGE, DocumentIssueCode.parse("DCNS02"));
        assertEquals(DocumentIssueCode.SERVICE_CHARGE_OVERRATED, DocumentIssueCode.parse("DCNS03"));
        assertEquals(DocumentIssueCode.SERVICE_CANCELLED, DocumentIssueCode.parse("DCNS04"));
        assertEquals(DocumentIssueCode.OTHER_SERVICE_ISSUE_CREDIT_NOTE, DocumentIssueCode.parse("DCNS99"));
        assertEquals(DocumentIssueCode.WRONG_NAME_TAX_INVOICE, DocumentIssueCode.parse("TIVC01"));
        assertEquals(DocumentIssueCode.WRONG_ADDRESS_TAX_INVOICE, DocumentIssueCode.parse("TIVC02"));
        assertEquals(DocumentIssueCode.OTHER_ISSUE_TAX_INVOICE, DocumentIssueCode.parse("TIVC99"));
        assertEquals(DocumentIssueCode.WRONG_NAME_RECEIPT, DocumentIssueCode.parse("RCTC01"));
        assertEquals(DocumentIssueCode.WRONG_ADDRESS_RECEIPT, DocumentIssueCode.parse("RCTC02"));
        assertEquals(DocumentIssueCode.ALL_PRODUCT_RETURNED_OR_SERVICE_CANCELLED, DocumentIssueCode.parse("RCTC03"));
        assertEquals(DocumentIssueCode.SOME_PRODUCT_RETURNED_OR_SERVICE_CANCELLED, DocumentIssueCode.parse("RCTC04"));
        assertEquals(DocumentIssueCode.OTHER_ISSUE_RECEIPT, DocumentIssueCode.parse("RCTC99"));
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenParsingNotExistedCode() {
        IllegalArgumentException e = assertThrows(
                IllegalArgumentException.class, () -> DocumentIssueCode.parse("123"));
        assertThat(e).hasMessageThat().contains("Parsing not existed code");
    }
}