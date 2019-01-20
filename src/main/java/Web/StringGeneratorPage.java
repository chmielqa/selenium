package Web;

import Web.Base.ChmielQaBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

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

    public StringGeneratorPage fillFieldLength(String length) {
        stringLengthInput.clear();
        stringLengthInput.sendKeys(length);
        return this;
    }

    public StringGeneratorPage fillPossibleChars(String length) {
        possibleCharactersInput.clear();
        possibleCharactersInput.sendKeys(length);
        return this;
    }


    public StringGeneratorPage submit() {
        submitButton.click();
        return this;
    }


    public StringGeneratorPage assertThatGeneratedStringLengthIsEqualTo(int expectedLength) {
        assertThat(getGeneratedString().length()).isEqualTo(expectedLength);
        return this;
    }

    public String getGeneratedString() {
        return generatedStringTextArea.getText();
    }
}
