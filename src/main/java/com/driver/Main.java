package com.driver;

public class Main {
    public static void main(String args[]){
        RWOnly r = new RWOnly();

        //r.name = "Jatin";
       // System.out.print(r.name);
       //The field RWOnly.name is not visible
       // The field RWOnly.name is not visible
       r.set("Jatin");
       System.out.print(r.get());
    }
}