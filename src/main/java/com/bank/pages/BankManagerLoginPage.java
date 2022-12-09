package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class BankManagerLoginPage extends Utility {
    By addCustomerButton=By.xpath("//div[@class='border box padT20 ng-scope']//button[1]");

    public void clickOnAddCustomerButton(){
        clickOnElement(addCustomerButton);
    }

    By openAccountTab = By.xpath("//button[normalize-space()='Open Account']");
    public void clickOnOpenAccountTab() {
        clickOnElement(openAccountTab);
    }
    By customerButton=By.xpath("//div[@class='border box padT20 ng-scope']//button[3]");

    public void clickCustomerButton(){
        clickOnElement(customerButton);
}

}
