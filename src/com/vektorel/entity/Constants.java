package com.vektorel.entity;

public class Constants {
    /**
     * Final
     * final değişkenler değiştirilemez.
     * final değişkenkere değer atamak zorunludur.
     * DIKKAT!! ataması yapılmayan final değişkenler
     * sınıf kullanılmadan ağa kaldırılmak istebnildiğinde
     * yani constructor da değer ataması yapılabilir.
     * DIKKAT!!! final değişkenine bir kere değer
     * atandığında bir daha değiştirilemez.
     */

    public  final double PI = 3.14d;
    public  final String URL = "www.google.com";
    public  final String FILE_NAME;

    /**
     * Normal kullanımda boş cont.
     *  test için paramtereli kullan
     */
    public Constants(){
        this.FILE_NAME = "Ahmet";
        //this.PI = 55;
    }

    public Constants(String file_name){
        this.FILE_NAME = file_name;
    }

    public void urlDegistir(String url){
      //  this.URL = url;
    }

}
