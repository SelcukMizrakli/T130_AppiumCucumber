package stepdefinitions.mobileStep;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.AileButcemPage;
import utils.Driver;
import utils.ReusableMethods;

import java.time.Duration;

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
    @Given("{string} sayfasinda gelir periyodu {string} secilir")
    public void gelik_ekle_sayfasinda_gelir_periyodu_secilir(String gelirPeriyodu) {
        page.gelirPeriyodu.click();
        ReusableMethods.scrollWithUiScrollableAndClick(gelirPeriyodu);
    }







    @Given("anasayfadaki arti butonuna tiklayin")
    public void anasayfadaki_arti_butonuna_tiklayin() {
        page.plusButton.click();
    }
    @Given("{string} Butonuna text uzerinden Tiklanir")
    public void gelir_ekle_butonuna_text_uzerinden_tiklanir(String eklemeSecenekleri) {
        ReusableMethods.scrollWithUiScrollableAndClick(eklemeSecenekleri);
    }
    @Given("{string} sayfasinda aciklama kismina {string} deger girilir")
    public void gelir_ekle_sayfasinda_aciklama_kismina_ılk_gelir_degeri_deger_girilir(String sayfaBilgisi,String aciklamaDegeri) {
        page.aciklamaKutusu.sendKeys(aciklamaDegeri);
    }
    @Given("{string} sayfasinda Gelir Tipi {string} secilir")
    public void gelir_ekle_sayfasinda_gelir_tipi_gelir_tipi_düzensiz_secilir(String sayfaBilgisi,String gelirTipi) {
        page.gelirTipiKutusu.click();
        ReusableMethods.scrollWithUiScrollableAndClick(gelirTipi);
    }

    @Given("{string} sayfasinda Kategori {string} secilir")
    public void gelir_ekle_sayfasinda_kategori_serbest_gelir_secilir(String sayfaBilgisi,String kategori) {
        page.kategoriKutusu.click();
        ReusableMethods.scrollWithUiScrollableAndClick(kategori);

    }
    @Given("{string} sayfasinda Tarih belirlemesi ve kac ay ilerleme {int} secimi gun {string} yapilir")
    public void gelir_ekle_sayfasinda_tarih_belirlemesi_ve_gun_secimi_yapilir(String sayfaBilgisi,int forBitis,String gun) {
        page.tarihKaydirmaMethodu(forBitis,gun);

    }
    @Given("{string} sayfasinda Tutar bilgisi {string} girilir")
    public void gelir_ekle_sayfasinda_tutar_bilgisi_girilir(String sayfaBilgisi,String tutar) {
        page.tutarKutusu.sendKeys(tutar);
    }
    @Given("basariyla eklendigini dogrulayin")
    public void basariyla_eklendigini_dogrulayin() {
        Assert.assertTrue( page.gelirEklediText.isDisplayed());
    }

}