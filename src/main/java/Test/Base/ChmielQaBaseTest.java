package Test.Base;

import Web.HomePage;
import org.testng.annotations.BeforeMethod;

public class ChmielQaBaseTest extends BaseTest {
    protected HomePage homePage;

    @BeforeMethod
    public void beforeMethod() {
        driver = driverManager.getDriver();
        driver.get("https://chmielqa.herokuapp.com/");
        homePage = new HomePage(driver);
    }

}
