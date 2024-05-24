@migrosyemekiki
Feature: Migros yemek - Musteri Siteye Uye Olmadan Siparis Verebilmeli
  @migrosregister
  Scenario: TC01 | Indirim kuponu test edilir(60 TL ve 40 TL indirim kuponu goruntulenmeli)
    Given migros uygulamasina giris yapilir
    And bildirim ve giris kismi düzenlenir
    And teslimat adresini belirle sekmesine tiklanir
    And uye olmadan devam et sekmesine tiklanir
    And isaretledigim konumu ekle butonuna tiklanir
    When il, ilce, mahalle, cadde, bina, kat, daire, adres tarifi, adres basligi, ad soyad eklenir
    And evet adresim dogru butonuna tiklanir
    When alisveris sayfasina gidilmeli
    And sepet e tiklanir, alisverise basla butonuna tiklanir
    Then sayfaya yonlendirildigi dogrulanire




  #given data ve url düzenlemesi, bir data kaydedilecekse, düzenlenecekse, örnegin siteye gidilir
  #eylem kisimlari when ile, tiklanir, secme metin girme
  #and her seyden sonra kullanilabilir, joker eleman
  #then den sonra dogrulama yapilirsa yine and yazilir, when den sonra gorunus acisindan and kullanmak daha güzel durur
  #ayni sayfada isleme devam edilirse when ile devam edilebilir, birbiriyle baglantili isleri tekrar when acarak yapariz
  #then assertionda kullanilir












