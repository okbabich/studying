package com.qa.studying.sandbox;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PointTest {

    Point point1;
    Point point2;

    @BeforeTest
    public void before() {
        point1 = new Point();
        point2 = new Point();
    }

    @Test
    public void testDistance(){

        point1.setX(1);
        point1.setY(1);
        point2.setX(1);
        point2.setY(1);

        Assert.assertTrue(point1.distance(point2)==0);
    }
}

//need to write additional tests