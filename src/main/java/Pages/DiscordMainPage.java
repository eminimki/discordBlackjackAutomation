package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DiscordMainPage extends AbstractClass{
    WebDriver driver;
    public DiscordMainPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@aria-label=' MrAdem']")
    private WebElement mrademServerIcon;
    public void clickOnServerIcon(){
        clickMethod(mrademServerIcon);
    }
}
