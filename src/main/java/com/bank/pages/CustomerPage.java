package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class CustomerPage extends Utility{
    By depositTab = By.xpath("//button[normalize-space()='Deposit']");
    By amountToDeposit = By.cssSelector("input[placeholder='amount']");
    By depositButton = By.cssSelector("button[type='submit']");
    By withdrawalButton = By.xpath("//button[normalize-space()='Withdrawl']");
    By amountToBeWithdrawn = By.xpath("(//input[@placeholder='amount'])[1]");
    By depositMessage = By.xpath("//span[@class='error ng-binding']");
    By submitWithdrawalButton = By.cssSelector("button[type='submit']");

    public void clickOnDepositTab(){
        clickOnElement(depositTab);
    }

    public void enterAmountToDeposit(String depositAmount){
        sendTextToElement(amountToDeposit, depositAmount);
    }

    public void clickOnDepositButton(){
        clickOnElement(depositButton);
    }

    public void clickOnWithdrawlButton(){
        clickOnElement(withdrawalButton);
    }

    public void enterAmountToBeWithdrawn(String withdrawAmount){
        sendTextToElement(amountToBeWithdrawn,withdrawAmount );
    }

    public String depositMessage(){
        return getTextFromElement(depositMessage);
        }

        //verificationMethodUsingWait("Deposit Successful", transactionSuccessfulMessage, 100);


    public void clickOnWithdrawalSubmitButton(){
        clickOnElement(submitWithdrawalButton);
    }

   // public void verifyTheWithdrawalTransactionSuccessfulMessage(){
        //verificationMethodUsingWait("Transaction Successful", transactionSuccessfulMessage, 100);
    }

