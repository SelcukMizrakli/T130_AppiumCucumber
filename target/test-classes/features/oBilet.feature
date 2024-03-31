@obilet
Feature: Kullanici mobile browser uzerinden testlerini gerceklestirir

  Scenario: Kullanici O bilet sayfasindaki gorevleri yerine getir
    * Kullanici "https://www.obilet.com/en" adresine gider
    * dil olarak turkce secilir
    * para birimi olarak tl secilir
    * otobus bileti bul a tiklanir
    * gelen bilet fiyatlarinin "TL" oldugu dogrulanir
