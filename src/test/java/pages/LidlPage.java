package pages;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserDriver;
import utils.Driver;

import java.time.Duration;

public class LidlPage {
    public LidlPage(){
        PageFactory.initElements(new AppiumFieldDecorator(BrowserDriver.getBrowserDriver(), Duration.ofSeconds(15)), this);
    }

    @FindBy(xpath = "//*[@text='reject all']")
    public WebElement cookies;

    @FindBy(xpath = "//*[@alt='hamburger-menu description']")
    public WebElement lidlHamburger;

    @FindBy(xpath = "//*[text()='products']")
    public WebElement products;

    @FindBy(xpath = "//*[@arial-label='all Categories4588items']")
    public WebElement allCategories;

    @FindBy(xpath = "(//*[text()='view more'])[1]")
    public WebElement viewMore;

    @FindBy(xpath = "//*[@data-test='search-bar']")
    public WebElement aramaKutusu;
}