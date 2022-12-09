package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class CustomerLoginPage extends Utility {
    By selectYourNameDropDown = By.id("userSelect");
    By customerLogInButton = By.cssSelector("button[type='submit']");
    By customerLogOutButton = By.xpath("//button[normalize-space()='Logout']");
    By yourNameLabel = By.xpath("//label[normalize-space()='Your Name :']");

    public void selectYourNameFromDropDown(String fullName){
        sendTextToElement(selectYourNameDropDown, fullName);
    }

    public void clickOnTheLoginButton (){
        clickOnElement(customerLogInButton);
    }



    By verifyLogoutTab = By.xpath("//button[contains(text(),'Logout')]");

        public void verifyLogoutTab(){
            isDisplayedMethod(verifyLogoutTab);
        }

    public void clickOnLogOutButton(){
        clickOnElement(customerLogOutButton);
    }

   public String verifyYourNameLabel(){
        return getTextFromElement(yourNameLabel);
        //verificationMethodUsingWait("Your Name :", yourNameLabel, 100);
   }
   // }


}
