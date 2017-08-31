import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Класс <class>TestClass</class>
 *
 * @author Sergei Kurkin
 */
public class TestClass {

    @Test
    public void testGoogleSearch() {
        // Optional, if not specified, WebDriver will search your path for chromedriver.
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.get("https://ebay.com/");
        WebElement link = driver.findElement(By.xpath("//a[text() = 'Электроника']"));
        wait.until(ExpectedConditions.elementToBeClickable(link));
        Actions actions = new Actions(driver);
        actions.moveToElement(link).click();
    }
}
