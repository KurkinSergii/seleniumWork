import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class MainClass {

    private static String fFoxProperty = "webdriver.gecko.driver";
    private static String chromeProperty = "webdriver.chrome.driver";

    private static String fFoxPath = "src/main/resources/geckodriver.exe";
    private static String chromePath = "src/main/resources/chromedriver.exe";
        
    
    public static void main(String[] args) {
        /*System.setProperty(fFoxProperty, fFoxPath);
        WebDriver driver = new FirefoxDriver();*/

        System.setProperty(chromeProperty, chromePath);
        WebDriver driver = new ChromeDriver();
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://ebay.com/");
        WebElement link = driver.findElement(By.xpath("//a[text() = 'Электроника']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(link).click();

        //link.click();
        
    }

}
