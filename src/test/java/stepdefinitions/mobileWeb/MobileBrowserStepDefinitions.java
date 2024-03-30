package stepdefinitions.mobileWeb;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.Actions;
import pages.LidlPage;
import pages.ObiletPage;
import utils.BrowserDriver;
import utils.ReusableMethods;

public class MobileBrowserStepDefinitions {

    ObiletPage obiletPage=new ObiletPage();
    LidlPage lidlPage=new LidlPage();
    TouchAction action=new TouchAction<>(BrowserDriver.getBrowserDriver());
    @Given("Kullanici {string} adresine gider")
    public void kullanici_adresine_gider(String url) {
        BrowserDriver.getBrowserDriver().get(url);
    }

    @Given("dil olarak turkce secilir")
    public void dil_olarak_turkce_secilir() {
        obiletPage.hamburgerMenu.click();
        obiletPage.languageSelect.click();
        obiletPage.turkishLanguage.click();
    }
    @Given("para birimi olarak tl secilir")
    public void para_birimi_olarak_tl_secilir() {
        obiletPage.hamburgerMenu.click();
        obiletPage.currencySelect.click();
        obiletPage.turkishLira.click();
    }
    @Given("otobus bileti bul a tiklanir")
    public void otobus_bileti_bul_a_tiklanir() {
        obiletPage.searchButton.click();
    }
    @Given("gelen bilet fiyatlarinin {string} oldugu dogrulanir")
    public void gelen_bilet_fiyatlarinin_tl_oldugu_dogrulanir(String expected) {
        Assert.assertTrue(obiletPage.priceText.getText().contains(expected));
    }


    @Given("Kullanici cookies i reddeder")
    public void kullanici_cookies_i_reddeder() throws InterruptedException {
        Thread.sleep(3000);
        action.press(PointOption.point(new Point(555,1352))).release().perform();
    }
    @Given("sol hamburger den product bolumune tiklar")
    public void sol_hamburger_den_product_bolumune_tiklar() throws InterruptedException {
        lidlPage.lidlHamburger.click();
        Thread.sleep(2000);
        lidlPage.products.click();
        Thread.sleep(3500);
    }
    @Given("all categories bolumunden taste of the worlde tiklar")
    public void all_categories_bolumunden_taste_of_the_worlde_tiklar() {
        Actions actions=new Actions(BrowserDriver.getBrowserDriver());
        // actions.moveToElement(lidlPage.viewMore).perform();
        actions.sendKeys(lidlPage.aramaKutusu,"drinks").perform();
    }
    @Given("taste of middle east bolumunde 7adet urun oldugunu dogrular")
    public void taste_of_middle_east_bolumunde_7adet_urun_oldugunu_dogrular() {

    }

}