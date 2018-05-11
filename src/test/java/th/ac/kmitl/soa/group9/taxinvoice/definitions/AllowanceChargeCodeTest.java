package th.ac.kmitl.soa.group9.taxinvoice.definitions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AllowanceChargeCodeTest {

    @Test
    public void shouldGetCorrectChargeCode() {
        assertEquals(AllowanceChargeCode.STAMP_DUTY, AllowanceChargeCode.parse(28));
        assertEquals(AllowanceChargeCode.BANK_CHARGES, AllowanceChargeCode.parse(30));
        assertEquals(AllowanceChargeCode.MINIMUM_COMMISSION, AllowanceChargeCode.parse(52));
        assertEquals(AllowanceChargeCode.TRANSFER_CHARGES, AllowanceChargeCode.parse(55));
        assertEquals(AllowanceChargeCode.MISCELLANEOUS_CHARGES, AllowanceChargeCode.parse(57));
        assertEquals(AllowanceChargeCode.FOREIGN_EXCHANGE_CHARGES, AllowanceChargeCode.parse(58));
        assertEquals(AllowanceChargeCode.SPECIAL_AGREEMENT_CHARGE, AllowanceChargeCode.parse(65));
        assertEquals(AllowanceChargeCode.SAMPLE_DISCOUNT, AllowanceChargeCode.parse(66));
        assertEquals(AllowanceChargeCode.RUSH_DELIVERY_SURCHARGE, AllowanceChargeCode.parse(77));
        assertEquals(AllowanceChargeCode.LOADING_CHARGE, AllowanceChargeCode.parse(82));
        assertEquals(AllowanceChargeCode.WAREHOUSING_CHARGE, AllowanceChargeCode.parse(85));
        assertEquals(AllowanceChargeCode.REDUCTION_FROM_USUAL_PRICE, AllowanceChargeCode.parse(95));
        assertEquals(AllowanceChargeCode.CHARGE_FOR_INSURANCE, AllowanceChargeCode.parse(96));
    }

    @Test
    public void shouldGetNullWhenParsingNotExistedCode() {
        assertNull(AllowanceChargeCode.parse(123));
    }
}