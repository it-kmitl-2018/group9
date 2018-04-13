package th.ac.kmitl.soa.group9.taxinvoice.models.json;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TaxInvoiceTest {

    private String number = "INV-178324672";
    private Trader seller = Trader.builder().build();
    private Trader buyer = Trader.builder().build();
    private String transactionDate = "2017-12-18 12:24:00";
    private JsonNote jsonNote = JsonNote.builder().build();
    private List<Item> items = new ArrayList<>();

    @Test
    public void shouldGetAllInfo() {
        TaxInvoice taxInvoice = TaxInvoice.builder()
                .number(this.number)
                .seller(this.seller)
                .buyer(this.buyer)
                .transactionDate(this.transactionDate)
                .jsonNote(this.jsonNote)
                .items(this.items)
                .build();

        assertEquals(this.number , taxInvoice.number);
        assertEquals(this.seller , taxInvoice.seller);
        assertEquals(this.buyer , taxInvoice.buyer);
        assertEquals(this.transactionDate , taxInvoice.transactionDate);
        assertEquals(this.jsonNote, taxInvoice.jsonNote);
        assertEquals(this.items , taxInvoice.items);
    }
}