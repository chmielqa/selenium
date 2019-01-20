package Web;

import Web.Base.ChmielQaBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.assertj.core.api.Assertions.assertThat;

public class HomePage extends ChmielQaBasePage {

    @FindBy(css = "#container h2")
    private WebElement containerHeader;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage assertThatHeaderIsEqualTo(String expectedHeader) {
        assertThat(getHeader()).isEqualTo(expectedHeader);
        return this;
    }

    public String getHeader() {
        return containerHeader.getText();
    }
}
