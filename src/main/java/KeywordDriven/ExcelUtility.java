package KeywordDriven;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

public class ExcelUtility {
    static XSSFWorkbook wb;
    static XSSFSheet sheet;

    public static void setExcel(String path, int sheetNum) {
        try {
            FileInputStream fis = new FileInputStream(new File(path));
            wb = new XSSFWorkbook(fis);
            sheet = wb.getSheetAt(sheetNum);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static int getNumberOfRows() {
        int data = sheet.getPhysicalNumberOfRows();
        return data;
    }

    public static String getdata(int rowNum, int cellNum) {
        String data = sheet.getRow(rowNum).getCell(cellNum).getStringCellValue();
        return data;
    }
}
