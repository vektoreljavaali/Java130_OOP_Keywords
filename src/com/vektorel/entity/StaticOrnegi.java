package com.vektorel.entity;

public class StaticOrnegi {

    String ad;

    public StaticOrnegi(){
        System.out.println("Sınıf Constructor Çalıştı");
    }

    static {
        System.out.println("Burası da neresi ????");
    }
}
