package th.ac.kmitl.soa.group9.taxinvoice.definitions;

public enum DocumentCode {

    DEBIT_NOTE("80", "ใบเพิ่มหนี้ (Debit Note)"),
    CREDIT_NOTE("81", "ใบลดหนี้ (Credit Note)"),
    INVOICE("380", "ใบแจ้งหนี้ (Invoice)"),
    TAX_INVOICE("388", "ใบกำกับภาษี (Tax Invoice)"),
    RECEIPT("T01", "ใบรับ (Receipt)"),
    INVOICE_AND_TAX_INVOICE("T02", "ใบแจ้งหนี้/ใบกํากับภําษี (Invoice/ Tax Invoice)"),
    RECEIPT_TAX_INVOICE("T03", "ใบเสร็จรับเงิน/ใบกํากับภาษี (Receipt/ Tax Invoice)"),
    DELIVERY_AND_TAX_INVOICE("T04", "ใบส่งของ/ใบกํากับภําษี (Delivery order/ Tax Invoice)"),
    ABBREVIATED_TAX_INVOICE("T05", "ใบกํากับภําษีอย่ํางย่อ (Abbreviated Tax Invoice)"),
    RECEIPT_AND_ABBREVIATED_TAX_INVOICE("T06", "ใบเสร็จรับเงิน/ใบกํากับภําษีอย่างย่อ (Receipt/Abbreviated Tax Invoice)"),
    CANCELLATION_NOTE("T07", "ใบแจ้งยกเลิก (Cancellation Note)");

    private String code;
    private String description;

    DocumentCode(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
