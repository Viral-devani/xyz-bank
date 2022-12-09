package com.bank.resources.testsuite;

import com.bank.pages.*;
import com.bank.resources.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BankTest extends BaseTest {
    /*
    1.bankManagerShouldAddCustomerSuccessfully.
    click On "Bank Manager Login" Tab
	click On "Add Customer" Tab
	enter FirstName
	enter LastName
	enter PostCode
	click On "Add Customer" Button
	popup display
	verify message "Customer added successfully"
	click on "ok" button on popup.



   */
    HomePage homePage = new HomePage();

    AddCustomerPage addcustomer = new AddCustomerPage();
    BankManagerLoginPage bankmanager = new BankManagerLoginPage();
    OpenAccountPage openAccountPage = new OpenAccountPage();
    CustomerLoginPage customerLoginPage = new CustomerLoginPage();
    CustomerPage customerPage = new CustomerPage();
/*
 /*
    1.bankManagerShouldAddCustomerSuccessfully.
    click On "Bank Manager Login" Tab
	click On "Add Customer" Tab
	enter FirstName
	enter LastName
	enter PostCode
	click On "Add Customer" Button
	popup display
	verify message "Customer added successfully"
	click on "ok" button on popup.
 */

    @Test
    public void bankManagerShouldAddCustomerSuccessfully() {
        homePage.clickOnBankManagerLogin();
        bankmanager.clickOnAddCustomerButton();
        addcustomer.enterFirstName("John");
        addcustomer.enterLastName("Smith");
        addcustomer.enterCustomersPostCode("SW13NW");
        addcustomer.clickOnTheAddCustomerButton();
        addcustomer.getPopUpText();
        Assert.assertEquals(addcustomer.getPopUpText(), "Customer added successfully with customer id :6", "Message is not displyed");
        addcustomer.clickOnOKButtonOfTheAlert();
        addcustomer.clickOnTheAddCustomerButton();
    }/*
2. bankManagerShouldOpenAccountSuccessfully.
    click On "Bank Manager Login" Tab
    click On "Open Account" Tab
    Search customer that created in first test
    Select currency "Pound"
    click on "process" button
    popup displayed
    verify message "Account created successfully"
    click on "ok" button on popup.
    */

    @Test
    public void bankManagerShouldOpenAccountSuccessfully() {
        homePage.clickOnBankManagerLogin();
        bankmanager.clickOnOpenAccountTab();
        openAccountPage.searchForTheCustomerByName("Harry");
        openAccountPage.selectPoundFromCurrency();
        openAccountPage.clickOnTheProcessButton();
        openAccountPage.getTextFromAlertAndVerifyIt();
        Assert.assertEquals(openAccountPage.getTextFromAlertAndVerifyIt(), "Account created successfully with account Number :1016", "Account not created successfully");
        openAccountPage.clickOnOKButtonOfTheAlert();
    }
    /*
    3. customerShouldLoginAndLogoutSuceessfully.
	click on "Customer Login" Tab
	search customer that you created.
	click on "Login" Button
	verify "Logout" Tab displayed.
	click on "Logout"
	verify "Your Name" text displayed.
     */

    @Test
    public void customerShouldLoginAndLogoutSuceessfully() {
        homePage.clickOnCustomerLoginButton();
        customerLoginPage.selectYourNameFromDropDown("Harry");
        customerLoginPage.clickOnTheLoginButton();
        customerLoginPage.verifyLogoutTab();
        customerLoginPage.clickOnLogOutButton();
        customerLoginPage.verifyYourNameLabel();
        Assert.assertEquals(customerLoginPage.verifyYourNameLabel(), "Your Name :", "Your Name :");
    }
    /*
    4. customerShouldDepositMoneySuccessfully.
	click on "Customer Login" Tab
	search customer that you created.
	click on "Login" Button
	click on "Deposit" Tab
	Enter amount 100
	click on "Deposit" Button
	verify message "Deposit Successful"

     */

    @Test
    public void customerShouldDepositMoneySuccessfully() {
        homePage.clickOnCustomerLoginButton();
        customerLoginPage.selectYourNameFromDropDown("harry");
        customerLoginPage.clickOnTheLoginButton();
        customerPage.clickOnDepositTab();
        customerPage.enterAmountToDeposit("500");
        customerPage.clickOnDepositButton();
    }
/*
5. customerShouldWithdrawMoneySuccessfully
	click on "Customer Login" Tab
	search customer that you created.
	click on "Login" Button
	click on "Withdrawl" Tab
	Enter amount 50
	click on "Deposit" Button
	verify message "Transaction Successful"
 */
    @Test
    public void customerShouldWithdrawMoneySuccessfully() {
        homePage.clickOnHomeButton();
        homePage.clickOnCustomerLoginButton();
        customerLoginPage.selectYourNameFromDropDown("Harry");
        customerLoginPage.clickOnTheLoginButton();
        customerPage.clickOnWithdrawlButton();
        customerPage.enterAmountToBeWithdrawn("50");
        customerPage.clickOnWithdrawalSubmitButton();
        customerPage.depositMessage();
        Assert.assertEquals(customerPage.depositMessage(), "Transaction Failed. You can not withdraw amount more than the balance.", "Transaction Successful");

    }

}


