package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ServerPage extends AbstractClass{
    WebDriver driver;
    public ServerPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@href= '/channels/943515742467399680/943520187368497202']")
    private WebElement casinoChannelIcon;
    public void clickOnChannelIcon(){
        clickMethod(casinoChannelIcon);
    }

    @FindBy(xpath = "//*[contains(@aria-label, 'casino kanalına mesaj gönder')]")
    private WebElement casinoChannelTextArea;
    public void typeCasinoChannelText(String command){
        sendKeysMethod(casinoChannelTextArea,command);
    }

    @FindBy(xpath = "//*[contains(text(), 'Claim all available kits')]")
    private WebElement claimallCommandTextArea;
    public void clickOnClaimAllCommandLine(){
        clickMethod(claimallCommandTextArea);
        pressEnter(casinoChannelTextArea);
    }

    @FindBy(xpath = "//*[contains(text(), 'Spin the wheel to get some chips!')]")
    private WebElement spinCommandTextArea;
    public void clickOnSpinCommandLine(){
        clickMethod(spinCommandTextArea);
        pressEnter(casinoChannelTextArea);
    }


}
