package APACHEPOI;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class _03_NewExcelWrite {
    public static void main(String[] args) throws IOException {
        //ortada excel yok ilk basta hafizada olusturmak lazim. Dosya olarak bu excel yok. Hafizada olusturup kaydedecez.
        //hafizada woorkbook olustur icinde hafizada sheet olustur
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Sayfa1");

        Row yeniSatir = sheet.createRow(0);
        Cell hucre = yeniSatir.createCell(0);
        hucre.setCellValue("Merhaba Dunya"); //buraya kadar hafizada olusturduk

        //kaydet
        String path="src/test/java/ApachePOI/resource/NewExcel.xlsx"; //buraya adi biz verdik biz olusturuyoruz
        FileOutputStream outputStream = new FileOutputStream(path);
        workbook.write(outputStream);
        workbook.close();
        System.out.println("Islem basari ile tamamlandi");

    }
}
