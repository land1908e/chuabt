package com.t3h.bai2;

public class Main {
    public static void main(String[] args) {
        Song song=new Song();
        song.name="YYYY";
        updateName(song);
        System.out.println(song.name);

    }
    public static void updateName(Song testSong){
        testSong.name="test";
    }
}
