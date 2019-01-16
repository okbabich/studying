package com.qa.studying.addressbook.tests;

import com.qa.studying.addressbook.model.GroupData;
import org.testng.annotations.*;

public class GroupCreationTests extends TestBase {


  @Test
  public void testGroupCreation() {

    app.gotoGroupPage();
    app.initGroupCreation();
    app.fillGroupForm(new GroupData("test2", "test5", "test8"));
    app.submitGroupCreation();
    app.returnToGroupPage();
  }

}
