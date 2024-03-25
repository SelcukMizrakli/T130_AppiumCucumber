package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;
import utils.ReusableMethods;

import java.time.Duration;

public class AileButcemPage {
    public   AileButcemPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAndroidDriver(), Duration.ofSeconds(15)), this);
    }

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[1]")
    public MobileElement emailBox;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[2]")
    public MobileElement passwordBox;

    @FindBy(xpath = "//*[@text='Başarıyla giriş yapıldı.']")
    public MobileElement girisYapildiYazisi;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[1]")
    public MobileElement isimBox;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[2]")
    public MobileElement soyisimBox;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[3]")
    public MobileElement sehirBox;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[4]")
    public MobileElement yasBox;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[5]")
    public MobileElement meslekBox;

    public void ilkEkranAyarlari(){
        ReusableMethods.wait(3);
        for (int i=0; i<6; i++){
            ReusableMethods.ekranKaydirmaMethodu(951,1001,750,117,1001);
        }
    }

    public void girisYapMethod(String mail,String sifre){
        emailBox.sendKeys(mail);
        passwordBox.sendKeys(sifre);
        ReusableMethods.scrollWithUiScrollableAndClick("Giriş Yap");

    }

    public void bilgileriTemizlemeMethodu(){
        isimBox.clear();
        soyisimBox.clear();
        sehirBox.clear();
        yasBox.clear();
        meslekBox.clear();
    }

    public void bilgileriDegistirmeVeKaydetmeMethodu(String isim,String soyIsim,String sehir,String yas,String meslek){
        bilgileriTemizlemeMethodu();
        isimBox.sendKeys(isim);
        soyisimBox.sendKeys(soyIsim);
        sehirBox.sendKeys(sehir);
        yasBox.sendKeys(yas);
        meslekBox.sendKeys(meslek);
        ReusableMethods.scrollWithUiScrollableAndClick("Kaydet");
    }

    public void bilgiDegistirmeAssert(String isim,String soyisim,String sehir,String yas,String meslek){
        Assert.assertTrue(isimBox.getText().contains(isim));
        Assert.assertTrue(soyisimBox.getText().contains(soyisim));
        Assert.assertTrue(sehirBox.getText().contains(sehir));
        Assert.assertTrue(yasBox.getText().contains(yas));
        Assert.assertTrue(meslekBox.getText().contains(meslek));
    }
}