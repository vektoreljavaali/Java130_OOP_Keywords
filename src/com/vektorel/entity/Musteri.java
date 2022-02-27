package com.vektorel.entity;

public class Musteri extends Insan{

    public static int sayac=0;
    public String ad;
    public String soyad;

    public Musteri(){
        sayac++;
    }
    // this -> Musteri.class demek
    // miras alınan sınıfların içerikleri içinde
    // this ile çağırma yapılabilir.
    public void kaydet(String ad,String soyad){
        this.ad = ad;
        this.soyad = soyad;

        System.out.println("Müşteri kayıt edildi.");
    }
}
