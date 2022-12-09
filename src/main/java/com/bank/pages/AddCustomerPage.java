package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class AddCustomerPage extends Utility {

    By firstName = By.xpath("//input[@placeholder='First Name']");
    By lastName = By.xpath("//input[@placeholder='Last Name']");
    By postCode = By.xpath("//input[@placeholder='Post Code']");
    By addCustomerTab = By.xpath("//button[@type='submit']");

    public void enterFirstName(String fName) {
        sendTextToElement(firstName, fName);
    }

    public void enterLastName(String lName){

        sendTextToElement(lastName, lName);
    }

    public void enterCustomersPostCode(String pcode){
        sendTextToElement(postCode, pcode);
    }

    public void clickOnTheAddCustomerButton(){
        clickOnElement(addCustomerTab);
    }
    public String getPopUpText(){
       return getTextFromAlert();

    }
    public void clickOnOKButtonOfTheAlert(){
        acceptAlert();
    }

}
