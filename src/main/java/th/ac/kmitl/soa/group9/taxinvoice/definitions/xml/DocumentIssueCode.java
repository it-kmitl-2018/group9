package th.ac.kmitl.soa.group9.taxinvoice.definitions.xml;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
public enum DocumentIssueCode {

    PRODUCT_PRICE_INCREASED("DBNG01", "มีการเพิ่มราคาค่าสินค้า(สินค้าเกินกว่าจำนวนที่ตกลงกัน)"),
    PRODUCT_PRICE_UNDERRATED("DBNG02", "คำนวณราคาสินค้า ผิดพลาดต่ำกว่าที่เป็นจริง"),
    OTHER_PRODUCT_ISSUE_DEBIT_NOTE("DBNG99", "เหตุอื่น (ระบุสาเหตุ)"),
    SERVICE_CHARGE_INCREASED("DBNS01", "การเพิ่มราคาค่าบริการ (บริการเกินกว่าข้อกำหนดที่ตกลงกัน)"),
    SERVICE_CHARGE_UNDERRATED("DBNS02", "คำนวณราคาค่าบริการ ผิดพลาดต่ำกว่าที่เป็นจริง"),
    OTHER_SERVICE_ISSUE_DEBIT_NOTE("DBNS99", "เหตุอื่น (ระบุสาเหตุ)"),
    PRODUCT_PRICE_DISCOUNTED("DCNG01", "ลดราคาสินค้าที่ขาย (สินค้าผิดข้อกำหนดที่ตกลงกัน)"),
    PRODUCT_DAMAGED("DCNG02", "สินค้าชำรุดเสียหาย"),
    INSUFFICIENT_PRODUCT_AMOUNT("DCNG03", "สินค้าขาดจำนวนตามที่ตกลงซื้อขาย"),
    PRODUCT_PRICE_OVERRATED("DCNG04", "คำนวณราคาสินค้าผิดพลาดสูงกว่าที่เป็นจริง"),
    PRODUCT_RETURNED("DCNG05", "รับคืนสินค้า (ไม่ตรงตามคำพรรณนา)"),
    OTHER_PRODUCT_ISSUE_CREDIT_NOTE("DCNG99", "เหตุอื่น (ระบุสาเหตุ)"),
    SERVICE_CHARGE_DISCOUNTED("DCNS01", "ลดราคาค่าบริการ (บริการผิดข้อกำหนดที่ตกลงกัน)"),
    INSUFFICIENT_SERVICE_CHARGE("DCNS02", "ค่าบริการขาดจำนวน"),
    SERVICE_CHARGE_OVERRATED("DCNS03", "คำนวณราคาค่าบริการผิดพลาดสูงกว่าที่เป็นจริง"),
    SERVICE_CANCELLED("DCNS04", "บอกเลิกสัญญาบริการ"),
    OTHER_SERVICE_ISSUE_CREDIT_NOTE("DCNS99", "เหตุอื่น (ระบุสาเหตุ)"),
    WRONG_NAME_TAX_INVOICE("TIVC01", "ชื่อผิด"),
    WRONG_ADDRESS_TAX_INVOICE("TIVC02", "ที่อยู่ผิด"),
    OTHER_ISSUE_TAX_INVOICE("TIVC99", "เหตุอื่น (ระบุสาเหตุ)"),
    WRONG_NAME_RECEIPT("RCTC01", "ชื่อผิด"),
    WRONG_ADDRESS_RECEIPT("RCTC02", "ที่อยู่ผิด"),
    ALL_PRODUCT_RETURNED_OR_SERVICE_CANCELLED("RCTC03", "รับคืนสินค้า / ยกเลิกบริการ ทั้งจำนวน (ระบุจำนวนบาท)"),
    SOME_PRODUCT_RETURNED_OR_SERVICE_CANCELLED("RCTC04", "รับคืนสินค้า / ยกเลิกบริการ บางส่วนจำนวน (ระบุจำนวนบาท)"),
    OTHER_ISSUE_RECEIPT("RCTC99", "เหตุอื่น (ระบุสาเหตุ)");

    private String code;
    private String description;

    DocumentIssueCode(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public static Map<String, DocumentIssueCode> mapper = new HashMap<>();
    static {
        for (DocumentIssueCode documentIssueCode : DocumentIssueCode.values()) {
            mapper.put(documentIssueCode.getCode(), documentIssueCode);
        }
    }

    public static DocumentIssueCode parse(String code) {
        DocumentIssueCode codeEnum = mapper.get(code);

        if (codeEnum == null) {
            throw new IllegalArgumentException("Parsing not existed code " + code);
        }

        return mapper.get(code);
    }
}
