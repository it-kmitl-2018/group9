package th.ac.kmitl.soa.group9.taxinvoice.forms;

import org.junit.jupiter.api.Test;
import th.ac.kmitl.soa.group9.taxinvoice.definitions.TypeCode;

import java.sql.Timestamp;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaxInvoiceFormTest {

    private String id = "RDTIV0575526000058001";
    private String name = TypeCode.TAX_INVOICE.getDescription();
    private String typeCode = TypeCode.TAX_INVOICE.getTypeCode();
    private Timestamp issueDateTime = new Timestamp(System.currentTimeMillis());
    private String purpose = "คำนวณราคาค่าบริการผิดพลาดสูงกว่าที่เป็นจริง";
    private String purposeCode = "DCNS03";
    private String globalId = "ABCDEFGHIJKLMNOPQRST123456789012345";
    private String subject = "หมายเหตุ";
    private String content = "ค่าบริการเพิ่มเติม";
    private String sellerId = "ABCDEFGHIJKLMNOPQRST123456789012345";
    private String sellerGlobalId = "123456";
    private String sellerName = "บริษัท ร่วมสมัยการค้าไทย จำกัด";
    private String sellerTaxRegId = "0575526009099";
    private String sellerBranchId = "00000";
    private String sellerEmail = "tax@rstmarket.co.th";
    private String sellerBuilding = "อื้อจือเหลียง";
    private String sellerBuildingNum = "968/1";
    private String sellerSoi = "ศาลาแดง 1";
    private String sellerVillage = "ศาลาแดงวิลล่า";
    private String sellerMoo = "3";
    private String sellerStreet = "สีลม";
    private String sellerCitySub = "101701";
    private String sellerCity = "1017";
    private String sellerCountrySub = "10";
    private String sellerCountry = "TH";
    private String sellerPostCode = "10310";

    @Test
    public void shouldGetAllInfo() {
        TaxInvoiceForm taxInvoiceForm = new TaxInvoiceForm();

        taxInvoiceForm.setId(this.id);
        taxInvoiceForm.setName(this.name);
        taxInvoiceForm.setTypeCode(this.typeCode);
        taxInvoiceForm.setIssueDateTime(this.issueDateTime);
        taxInvoiceForm.setPurpose(this.purpose);
        taxInvoiceForm.setPurposeCode(this.purposeCode);
        taxInvoiceForm.setGlobalId(this.globalId);
        taxInvoiceForm.setSubject(this.subject);
        taxInvoiceForm.setContent(this.content);

        taxInvoiceForm.setSellerId(this.sellerId);
        taxInvoiceForm.setSellerGlobalId(this.sellerGlobalId);
        taxInvoiceForm.setSellerName(this.sellerName);
        taxInvoiceForm.setSellerTaxRegId(this.sellerTaxRegId);
        taxInvoiceForm.setSellerBranchId(this.sellerBranchId);
        taxInvoiceForm.setSellerEmail(this.sellerEmail);
        taxInvoiceForm.setSellerBuilding(this.sellerBuilding);
        taxInvoiceForm.setSellerBuildingNum(this.sellerBuildingNum);
        taxInvoiceForm.setSellerSoi(this.sellerSoi);
        taxInvoiceForm.setSellerVillage(this.sellerVillage);
        taxInvoiceForm.setSellerMoo(this.sellerMoo);
        taxInvoiceForm.setSellerStreet(this.sellerStreet);
        taxInvoiceForm.setSellerCitySub(this.sellerCitySub);
        taxInvoiceForm.setSellerCity(this.sellerCity);
        taxInvoiceForm.setSellerCountrySub(this.sellerCountrySub);
        taxInvoiceForm.setSellerCountry(this.sellerCountry);
        taxInvoiceForm.setSellerPostCode(this.sellerPostCode);

        assertEquals(this.id, taxInvoiceForm.getId());
        assertEquals(this.name, taxInvoiceForm.getName());
        assertEquals(this.typeCode, taxInvoiceForm.getTypeCode());
        assertEquals(this.issueDateTime, taxInvoiceForm.getIssueDateTime());
        assertEquals(this.purpose, taxInvoiceForm.getPurpose());
        assertEquals(this.purposeCode, taxInvoiceForm.getPurposeCode());
        assertEquals(this.globalId, taxInvoiceForm.getGlobalId());
        assertEquals(this.subject, taxInvoiceForm.getSubject());
        assertEquals(this.content, taxInvoiceForm.getContent());

        assertEquals(this.sellerId, taxInvoiceForm.getSellerId());
        assertEquals(this.sellerGlobalId, taxInvoiceForm.getSellerGlobalId());
        assertEquals(this.sellerName, taxInvoiceForm.getSellerName());
        assertEquals(this.sellerTaxRegId, taxInvoiceForm.getSellerTaxRegId());
        assertEquals(this.sellerBranchId, taxInvoiceForm.getSellerBranchId());
        assertEquals(this.sellerEmail, taxInvoiceForm.getSellerEmail());
        assertEquals(this.sellerBuilding, taxInvoiceForm.getSellerBuilding());
        assertEquals(this.sellerBuildingNum, taxInvoiceForm.getSellerBuildingNum());
        assertEquals(this.sellerSoi, taxInvoiceForm.getSellerSoi());
        assertEquals(this.sellerVillage, taxInvoiceForm.getSellerVillage());
        assertEquals(this.sellerMoo, taxInvoiceForm.getSellerMoo());
        assertEquals(this.sellerStreet, taxInvoiceForm.getSellerStreet());
        assertEquals(this.sellerCitySub, taxInvoiceForm.getSellerCitySub());
        assertEquals(this.sellerCity, taxInvoiceForm.getSellerCity());
        assertEquals(this.sellerCountrySub, taxInvoiceForm.getSellerCountrySub());
        assertEquals(this.sellerCountry, taxInvoiceForm.getSellerCountry());
        assertEquals(this.sellerPostCode, taxInvoiceForm.getSellerPostCode());
    }
}
