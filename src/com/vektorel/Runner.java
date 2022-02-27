package com.vektorel;

import com.vektorel.entity.Musteri;

public class Runner {
    public static void main(String[] args) {

        Musteri mst = new Musteri();

        mst.ad = "Ahmet";
        mst.soyad = "TAŞ";
       // mst.sayac = 12;
        //--------------------------
        Musteri mst2 = new Musteri();
        mst2.ad = "Dursun";
        mst2.soyad = "TAKAN";
       // mst2.sayac = 43;
        /**
         * Static değişkenlerin new lenerek erişilmesine gerek yoktur.
         */
        //Musteri.sayac = 567;
        //--------------------------
        System.out.println("Müşteri1..: ");
        System.out.print(mst.ad+ " "+mst.soyad); // Ahmet TAŞ
        System.out.println("sayaç..: "+mst.sayac); // 12
        System.out.println();

        System.out.println("Müşteri2..: ");
        System.out.print(mst2.ad+ " "+mst2.soyad); // Dursun TAKAN
        System.out.println("sayaç..: "+mst2.sayac);// 43
    }
}
