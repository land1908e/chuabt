package com.t3h.bai2;

public class Song extends Audio {
    String artist;//casi
    String album;

    //dinh nghia lai phuong thuc play
    @Override
    void play() {
        System.out.println("Play Song");
    }
    @Override
    void showInfo(){
        super.showInfo();
        System.out.println("Artist"+artist);
        System.out.println("Album"+album);
    }
}
