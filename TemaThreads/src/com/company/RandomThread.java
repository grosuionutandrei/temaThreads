package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomThread implements Runnable {
    private String name;
    private int random;

    public RandomThread (String name){
        this.name=name;
    }
    public int getRandom(){
        return random;
    }

    @Override
    public void run() {
   Random r = new Random();
   int rand = r.nextInt(11);
   random = rand;
        System.out.println("Random number is "  + rand);

    }

    @Override
    public String toString() {
        return "RandomThread{" +
                "name='" + name + '\'' +
                '}';
    }
}
