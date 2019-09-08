package com.t3h.bai2;

public abstract class Audio {
    String name;
    String type;
    int duration;//thoi luong
    String quality;//chat luong

    abstract void play();
    void showInfo(){
        System.out.println("Name"+name);
        System.out.println("TypeL"+type);
        System.out.println("Duration"+duration);
        System.out.println("Quality"+quality);
    }
}
