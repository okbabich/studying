package com.qa.studying.addressbook;

import org.testng.annotations.*;

public class ContactCreationTests extends TestBase {


  @Test
  public void testContactCreation() throws Exception {
    initContactCreation();
    fillContactForm(new ContactData("Vadim", "Didenko", "Kharkiv", "0968574123", "vadim@gmail.com"));
    gotoHomePage();
  }
}