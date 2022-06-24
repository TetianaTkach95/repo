import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URI;

import static com.codeborne.selenide.Selenide.*;

public class AutomationDemoGUI {

    public static void driverChromeSetup() throws Throwable {
        RemoteWebDriver driver;
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        capabilities.setVersion("87.0");
        capabilities.setCapability("enableVNC", true);
        driver = new RemoteWebDriver(URI.create("http://localhost:4444/wd/hub").toURL(), capabilities);
        WebDriverRunner.setWebDriver(driver);
        //driver.manage().window().maximize();
    }

    public static void openWikiInBrowser() {
        open("https://www.wikipedia.org/");
        sleep(3000);
    }

    public static void performSearch(String searchString) {
        $(By.xpath("//*[@id='searchInput']")).sendKeys(searchString);
        $(By.xpath("//*[@id='searchInput']")).pressEnter();
    }

    public static void informationDisplayed(String targetText) {
        $(By.xpath("//*[contains(text(),'" + targetText + "')]")).shouldBe(Condition.visible);
        System.out.println("Text '" + targetText + "' was found on the page.");
    }
}
