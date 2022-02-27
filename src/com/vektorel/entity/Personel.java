package com.vektorel.entity;

import java.util.UUID;

public class Personel {
    private String id;
    public String ad;
    public String telefon;

    public String getId(){
        return id;
    }

    public Personel(){
        System.out.println("Boş constructor çalıştı");
    }

    public Personel(String ad){
        System.out.println("Parametreli const. çalıştı..: ");
        System.out.print(ad);
        /// Benzersiz rast gele id üretir.
        this.id = UUID.randomUUID().toString();
    }

    public Personel(String ad, String adres){

    }

    public Personel(String ad, int yas){

    }



}
