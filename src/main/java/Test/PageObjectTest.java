package Test;

import Core.DriverType;
import Core.WebDriverManager;
import Web.HomePage;
import Web.StringGeneratorPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PageObjectTest {

    private WebDriverManager driverManager;
    private WebDriver driver;

    @BeforeTest
    public void beforeTest() {
        driverManager = new WebDriverManager(DriverType.CHROME);
    }

    @BeforeMethod
    public void beforeMethod() {
        driver = driverManager.getDriver();
    }

    @AfterMethod
    public void afterMethod() {
        driverManager.quitDriver();
    }

    @Test
    public void shouldLengthOfGeneratedStringBeCorrect() {
        int length=20;
        driver.get("http://localhost:5000/sel");
        HomePage page = new HomePage(driver);
        StringGeneratorPage stringGeneratorPage=page.goToStringGenerator();
        stringGeneratorPage.fillFieldLength(String.valueOf(length));
        stringGeneratorPage.fillPossibleChars("abcd");
        stringGeneratorPage.submit();
        assertThat(stringGeneratorPage.getGeneratedString().length()).isEqualTo(length);

    }

    @Test
    public void shouldHomePageHaveCorrectText() {
        driver.get("http://localhost:5000/sel");
        HomePage page = new HomePage(driver);
        assertThat(page.getHeader()).isEqualTo("Strona główna");
    }
}
