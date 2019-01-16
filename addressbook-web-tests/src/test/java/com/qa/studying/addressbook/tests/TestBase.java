package com.qa.studying.addressbook.tests;

import com.qa.studying.addressbook.appmanager.ApplicationManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {

    protected final ApplicationManager app = new ApplicationManager();

    @BeforeClass(alwaysRun = true)

    public void setUp() {
        app.init();
    }

    @AfterClass(alwaysRun = true)

    public void tearDown(){
        app.stop();
    }

}
