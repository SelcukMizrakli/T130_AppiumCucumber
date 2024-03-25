package stepdefinitions.mobileStep;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.AileButcemPage;
import utils.Driver;
import utils.ReusableMethods;

public class aileButcemStep {

    AndroidDriver<AndroidElement> driver= Driver.getAndroidDriver();
    AileButcemPage page=new AileButcemPage();

    @Given("ilk ekran ayarlarini yapin ve ardindan login sayfasina {string} ulasin")
    public void ilk_ekran_ayarlarini_yapin_ve_ardindan_login_sayfasina_ulasin(String girisYap) {
        page.ilkEkranAyarlari();
        ReusableMethods.scrollWithUiScrollableAndClick(girisYap);
    }
    @Given("{string} ve {string} bilgilerini girerek kullanici bilgileriyle giris yapin")
    public void mail_ve_password_bilgilerini_girerek_kullanici_bilgileriyle_giris_yapin(String mail,String password) {
        page.girisYapMethod(mail,password);
    }
    @Given("uygulamaya kullanici bilgileriyle giris yapildigini dogrulayin")
    public void uygulamaya_kullanici_bilgileriyle_giris_yapildigini_dogrulayin() {
        Assert.assertTrue(page.girisYapildiYazisi.isDisplayed());
    }
    @Given("sol kisimdaki menuden {int} {int} {string} bolumune gidin")
    public void sol_kisimdaki_menuden_hesabim_bolumune_gidin(int x1Koordinati,int y1Koordinati,String menuSecenekler) throws InterruptedException {
        ReusableMethods.wait(4);
        ReusableMethods.koordinatTiklamaMethodu(x1Koordinati,y1Koordinati);
        ReusableMethods.scrollWithUiScrollableAndClick(menuSecenekler);

    }
    @Given("hesabim sayfasindaki bilgileri degistirerek {string} {string} {string} {string} {string} degisikleri kaydedin ve dogrulayin")
    public void hesabim_sayfasindaki_bilgileri_degistirerek_degisikleri_kaydedin(String isim,String soyisim,String sehir,String yas,String meslek) {
        page.bilgileriDegistirmeVeKaydetmeMethodu(isim,soyisim,sehir,yas,meslek);
        page.bilgiDegistirmeAssert(isim,soyisim,sehir,yas,meslek);
    }

    @Given("Kullanici uygulamayi kapatir")
    public void kullanici_uygulamayi_kapatir() {
        Driver.quitAppiumDriver();
    }
}