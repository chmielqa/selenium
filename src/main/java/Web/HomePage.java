package Web;

import Web.Base.ChmielQaBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends ChmielQaBasePage {

    @FindBy(css = "#container h2")
    private WebElement containerHeader;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public String getHeader() {
        return containerHeader.getText();
    }
}
