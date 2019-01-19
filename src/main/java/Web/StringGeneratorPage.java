package Web;

import Web.Base.ChmielQaBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StringGeneratorPage extends ChmielQaBasePage {

    @FindBy(css = "#container h2")
    private WebElement containerHeader;

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
        super(driver);
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
