package com.vektorel;

import com.vektorel.entity.Deneme;
import com.vektorel.entity.StaticOrnegi;

public class RunnerStaticOrnek {

    public static void main(String[] args) {
        System.out.println("Static örnek oluşturma öncesi");
        StaticOrnegi ornek = new StaticOrnegi();
        new Deneme();
        System.out.println("Static örnek oluşturma sonrası");
        // Garbage Collector - Çöptoplayıcıları
    }
}
