package Web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StringGeneratorPage {

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

    @FindBy(css = "label[for='stringLength']")
    private WebElement stringLengthLabel;

    @FindBy(name = "stringLength")
    private WebElement stringLengthInput;

    @FindBy(css = "label[for='possibleCharacter']")
    private WebElement possibleCharactersLabel;

    @FindBy(name = "possibleCharacter")
    private WebElement possibleCharactersInput;

    @FindBy(css = "#data textarea")
    private WebElement generatedStringTextArea;

    @FindBy(css = "button")
    private WebElement submitButton;


    public StringGeneratorPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public HomePage goToHomePage() {
        navHomePage.click();
        return new HomePage(driver);
    }

    public StringGeneratorPage goToPersonalDataGenerator() {
        navPersonalDataGenerator.click();
        return new StringGeneratorPage(driver);
    }

    public void fillFieldLength(String length) {
        stringLengthInput.clear();
        stringLengthInput.sendKeys(length);
    }

    public void fillPossibleChars(String length) {
        possibleCharactersInput.clear();
        possibleCharactersInput.sendKeys(length);
    }

    public void submit() {
        submitButton.click();

    }

    public String getGeneratedString() {
        return generatedStringTextArea.getText();
    }
}
