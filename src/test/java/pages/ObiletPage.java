package pages;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserDriver;
import utils.Driver;

import java.time.Duration;

public class ObiletPage {
    public ObiletPage(){
        PageFactory.initElements(new AppiumFieldDecorator(BrowserDriver.getBrowserDriver(), Duration.ofSeconds(15)), this);
    }


    @FindBy(xpath = "//*[@aria-label='Menü']")
    public WebElement hamburgerMenu;

    @FindBy(xpath = "//*[@class='language']")
    public WebElement languageSelect;

    @FindBy(xpath = "(//*[@data-language='tr-TR'])[1]")
    public WebElement turkishLanguage;

    @FindBy(xpath = "//*[@title='Currency Select']")
    public WebElement currencySelect;

    @FindBy(xpath = "(//*[@data-code='TRY'])[1]")
    public WebElement turkishLira;

    @FindBy(xpath = "//*[@id='search-button']")
    public WebElement searchButton;

    @FindBy(xpath = "//span[@class='amount-sign']")
    public WebElement priceText;
}