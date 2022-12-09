package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class OpenAccountPage extends Utility {
    By customerNameDropDown = By.id("userSelect");
    By currencyDropDown = By.xpath("//select[@id='currency']");
    By processButton = By.xpath(" //button[contains(text(),'Process')]");


    public void searchForTheCustomerByName(String customerName) {
        clickOnElement(customerNameDropDown);
        sendTextToElement(customerNameDropDown, customerName);

    }

    public void selectPoundFromCurrency() {
        selectByIndexFromDropDown(currencyDropDown, 2);
    }
    public void clickOnTheProcessButton() {
        clickOnElement(processButton);
    }


    public String getTextFromAlertAndVerifyIt() {
        return getTextFromAlert();


    }
    public void clickOnOKButtonOfTheAlert(){
        acceptAlert();
    }

}
