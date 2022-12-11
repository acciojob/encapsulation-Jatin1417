package com.driver.test;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

import com.driver.RWOnly;

public class TestCases {
    
   public static void main(String args[]){
    RWOnly r = new RWOnly();
    r.set("sahil chaudhari");
    System.out.print(r.get());
   }

    
}
     
