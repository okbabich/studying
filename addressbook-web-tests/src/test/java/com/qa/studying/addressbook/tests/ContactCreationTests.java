package com.qa.studying.addressbook.tests;

import com.qa.studying.addressbook.model.ContactData;
import org.testng.annotations.*;

public class ContactCreationTests extends TestBase {


  @Test
  public void testContactCreation() throws Exception {
    app.initContactCreation();
    app.fillContactForm(new ContactData("Petya", "Petechkin", "Kharkiv", "0968574123", "petya@gmail.com"));
    app.gotoHomePage();
  }
}