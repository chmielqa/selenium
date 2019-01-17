package Web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageBy {

    private WebDriver driver;
    private By pageHeaderLocator=By.cssSelector("h1");
    private By containerHeaderLocator =  By.cssSelector("#container h2");
    private By navHeaderLocator= By.cssSelector("h3");
    private By navHomePageLocator= By.cssSelector(".nav-item #homePage");
    private By navStringGenerator=By.cssSelector(".nav-item #stringGenerator");
    private By navPersonalDataGenerator=By.cssSelector(".nav-item #personalDataGenerator");

    public HomePageBy(WebDriver driver) {
        this.driver = driver;
    }

    public HomePageBy goToHomePage() {
        driver.findElement(navHomePageLocator).click();
        return new HomePageBy(driver);
    }

    public StringGeneratorPage goToStringGenerator() {
        driver.findElement(navStringGenerator).click();
        return new StringGeneratorPage(driver);
    }

    public String getHeader() {
        return driver.findElement(containerHeaderLocator).getText();
    }

}
