package com.example.helloworld;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Hello {

    public static void main(String[] args){
    Phone iPhone = new Phone("iPhone 11", 5, 8, 8);
    Phone pixel = new Phone("Pixel", 5);
    pixel.setMemoryRam(10);

    System.out.println(pixel.getMemoryRam());

    System.out.println(iPhone.getName());

    iPhone.setMemoryRam(10);
    iPhone.playMusic("Our wings are burning");
    iPhone.playMusic("Lamenting Kiss");

    }


}
