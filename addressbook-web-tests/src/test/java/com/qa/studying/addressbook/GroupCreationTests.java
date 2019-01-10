package com.qa.studying.addressbook;

import org.testng.annotations.*;

public class GroupCreationTests extends TestBase {


  @Test
  public void testGroupCreation() {

    gotoGroupPage();
    initGroupCreation();
    fillGroupForm(new GroupData("test2", "test5", "test8"));
    submitGroupCreation();
    returnToGroupPage();
  }

}
