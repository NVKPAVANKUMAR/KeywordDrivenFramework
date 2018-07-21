package KeywordDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actionkeywords {

    private static WebDriver driver;
    private static JavascriptExecutor executor;

    public static void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "driverjars/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public static void navigate() {
        driver.get("http://www.way2testing.com");
    }

    public static void click_df() throws InterruptedException {
        WebElement seleniumTutorialLink = driver.findElement(By.xpath("//*[@alt=\"selenium-testing-tutorials\"]"));
        executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].scrollIntoView(true);", seleniumTutorialLink);
        executor.executeScript("arguments[0].setAttribute('style',arguments[1])",
                seleniumTutorialLink, "background : yellow; border: 4px solid red");
        Thread.sleep(2000);
        seleniumTutorialLink.click();
    }

    public static void closeBrowser() {
        driver.quit();
    }


}
