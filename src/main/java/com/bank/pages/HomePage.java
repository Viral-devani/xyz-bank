package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
 By customerloginbutton=By.xpath(" //button[contains(text(),'Customer Login')]");

    public void clickOnCustomerLoginButton(){
     clickOnElement(customerloginbutton);
    }
    By bankManagerLogin=By.xpath("//button[contains(text(),'Bank Manager Login')]");
    public void clickOnBankManagerLogin(){
        clickOnElement(bankManagerLogin);

    }
    By homeButton = By.xpath("//button[contains(text(),'Home')]");
      public void clickOnHomeButton(){
          clickOnElement(homeButton);
      }
}
