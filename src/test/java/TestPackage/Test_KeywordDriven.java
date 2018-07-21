package TestPackage;

import KeywordDriven.Actionkeywords;
import KeywordDriven.ExcelUtility;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_KeywordDriven {
    static String path;

    @BeforeTest
    public void setUP() {
        path = "exceldata/KeywordDriven.xlsx";
    }

    @Test
    public static void test() throws InterruptedException {

        ExcelUtility.setExcel(path, 0);
        int rowCount = ExcelUtility.getNumberOfRows();
        System.out.println(rowCount);
        for (int i = 0; i <= rowCount - 1; i++) {
            String keyword = ExcelUtility.getdata(i, 3);
            if (keyword.equalsIgnoreCase("openbrowser")) {
                Actionkeywords.openBrowser();
            } else if (keyword.equalsIgnoreCase("navigate")) {
                Actionkeywords.navigate();
            } else if (keyword.equalsIgnoreCase("click_DF")) {
                Actionkeywords.click_df();
            } else if (keyword.equalsIgnoreCase("closebrowser")) {
                Actionkeywords.closeBrowser();
            }
        }
    }


}
