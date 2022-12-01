package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends AbstractClass{
    WebDriver driver;
    public LoginPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "uid_5")
    private WebElement emailTextArea;
    public void typeEmail(String email){
        sendKeysMethod(emailTextArea,email);
    }

    @FindBy(id = "uid_8")
    private WebElement passwordTextArea;
    public void typePassword(String password){
        sendKeysMethod(passwordTextArea,password);
    }

    @FindBy(xpath = "//*[@id='app-mount']/div[2]/div/div[1]/div/div/div/div/form/div[2]/div/div[1]/div[2]/button[2]")
    private WebElement loginButton;
    public void clickOnLoginButton(){
        clickMethod(loginButton);
    }
}
