package com.qa.studying.sandbox;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RectangleTest {

    Rectangle r;

    @BeforeTest
    public void before(){
        r = new Rectangle();
    }

    @Test
    public void area(){
       r.setA(3);
       r.setB(7);
        Assert.assertTrue(r.area()==21.0);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testAreaNotValidSides(){
        r.setA(3);
        r.setB(-7);
        r.area();
    }

}
