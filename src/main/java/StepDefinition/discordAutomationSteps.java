package StepDefinition;

import Pages.DiscordMainPage;
import Pages.LoginPage;
import Pages.ServerPage;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class discordAutomationSteps {
    private WebDriver driver;
    LoginPage loginPage = new LoginPage();
    DiscordMainPage discordMainPage = new DiscordMainPage();
    ServerPage serverPage = new ServerPage();


    @Given("open discord login page")
    public void open_discord_login_page() {
        driver= Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("http://discord.com/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    @Given("type email {string}")
    public void type_email(String email) {
        loginPage.typeEmail(email);
    }
    @Given("type password {string}")
    public void type_password(String password) {
        loginPage.typePassword(password);
    }
    @Given("click login button")
    public void click_login_button() {
        loginPage.clickOnLoginButton();
    }
    @Given("choose server")
    public void choose_server() {
        discordMainPage.clickOnServerIcon();
    }
    @Given("choose casino channel")
    public void choose_casino_channel() {
        //serverPage.clickOnChannelIcon();
        driver.get("https://discord.com/channels/943515742467399680/943520187368497202");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Given("send bot commands")
    public void send_bot_commands() {
        String claimallCommand = "/claimall";
        String spinCommand = "/spin";
        serverPage.waitASome(5000);
        for (int hours = 0 ; hours <= 5 ; hours++){
            serverPage.typeCasinoChannelText(claimallCommand);
            serverPage.clickOnClaimAllCommandLine();

            for (int per5minutes=0; per5minutes <= 11; per5minutes++){
                serverPage.typeCasinoChannelText(spinCommand);
                serverPage.clickOnSpinCommandLine();
                serverPage.waitASome(300000);
            }
        }
    }

}
