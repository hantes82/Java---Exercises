package com.company;

/**
 * Created by kondz on 07.03.2017.
 */
public class Vehicle {
    public String engineInfo = "szybki";
    protected int cena = 200;
    public void printinfo() {
        System.out.println(engineInfo+" "+cena);
    }
}
