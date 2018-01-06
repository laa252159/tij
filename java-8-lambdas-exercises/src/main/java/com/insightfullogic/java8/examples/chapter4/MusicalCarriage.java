package com.insightfullogic.java8.examples.chapter4;

// BEGIN body
public class MusicalCarriage
        implements Carriage, Jukebox {

    public static void main(String[] args) {
        MusicalCarriage m = new MusicalCarriage();
        m.rock();
    }

    @Override
    public String rock() {
        System.out.println(Carriage.super.rock() + " !!!");
        return Carriage.super.rock();
    }

}
// END body
