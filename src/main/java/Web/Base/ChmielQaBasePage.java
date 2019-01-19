package Web.Base;

import Web.HomePage;
import Web.StringGeneratorPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public abstract class ChmielQaBasePage extends BasePage {
    @FindBy(css = "h1")
    private WebElement pageHeader;

    @FindBy(css = "h3")
    private WebElement navHeader;

    @FindBy(css = ".nav-item #homePage")
    private WebElement navHomePage;

    @FindBy(css = ".nav-item #stringGenerator")
    private WebElement navStringGenerator;

    @FindBy(css = ".nav-item #personalDataGenerator")
    private WebElement navPersonalDataGenerator;

    public ChmielQaBasePage(WebDriver driver) {
        super(driver);
    }

    public HomePage goToHomePage() {
        navHomePage.click();
        return new HomePage(driver);
    }

    public StringGeneratorPage goToStringGenerator() {
        navStringGenerator.click();
        return new StringGeneratorPage(driver);
    }

}
