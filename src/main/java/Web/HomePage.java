package Web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private WebDriver driver;

    @FindBy(css = "h1")
    private WebElement pageHeader;

    @FindBy(css = "#container h2")
    private WebElement containerHeader;

    @FindBy(css = "h3")
    private WebElement navHeader;

    @FindBy(css = ".nav-item #homePage")
    private WebElement navHomePage;

    @FindBy(css = ".nav-item #stringGenerator")
    private WebElement navStringGenerator;

    @FindBy(css = ".nav-item #personalDataGenerator")
    private WebElement navPersonalDataGenerator;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public HomePage goToHomePage() {
        navHomePage.click();
        return new HomePage(driver);
    }

    public StringGeneratorPage goToStringGenerator() {
        navStringGenerator.click();
        return new StringGeneratorPage(driver);
    }

    public String getHeader() {
        return containerHeader.getText();
    }
}
