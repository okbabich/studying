package com.qa.studying.addressbook.appmanager;

import com.qa.studying.addressbook.model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GroupHelper extends HelperBase{

    public GroupHelper(WebDriver driver) {
        super(driver);
    }

    public void initGroupCreation() {
        click(By.name("new"));
    }

    public void fillGroupForm(GroupData groupData) {
        type(By.name("group_name"), groupData.getName());
        type(By.name("group_header"), groupData.getHeader());
        type(By.name("group_footer"), groupData.getFooter());
    }


    public void submitGroupCreation() {
        click(By.name("submit"));
    }

    public void selectGroup(){
        click(By.name("selected[]"));
    }

    public void deleteSelectedGroups(){
        click(By.name("delete"));
    }

/*   public void deleteSelectedGroups(){
       click(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='test2'])[1]/following::input[2]"));
    }
*/

}
