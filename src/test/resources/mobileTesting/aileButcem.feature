@ab
Feature: aile butcem uygulamasi fonksiyonlari test edilir
  Background: KULLANICILAR UYGULAMAYA GIRIS YAPMAK BU ADIMLARI YAZMAK ZORUNDALAR

    * ilk ekran ayarlarini yapin ve ardindan login sayfasina "Giriş Yap" ulasin
    * "testfort108@gmail.com" ve "t108t108" bilgilerini girerek kullanici bilgileriyle giris yapin
    * uygulamaya kullanici bilgileriyle giris yapildigini dogrulayin

  Scenario Outline: Aile butcem uygulamasindaki gorevler yerine getirilir

    * sol kisimdaki menuden 110 142 "Hesabım" bolumune gidin
    * hesabim sayfasindaki bilgileri degistirerek "<isim>" "<soyisim>" "<sehir>" "<yas>" "<meslek>" degisikleri kaydedin ve dogrulayin
    * Kullanici uygulamayi kapatir

    Examples:
      | isim |soyisim|sehir|yas|meslek|
      | Murat |Altin|Antalya|30|Hakim|
      | Nevzat |Kerim|Berlin|23|Doktor|