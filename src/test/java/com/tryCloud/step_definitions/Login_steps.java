package com.tryCloud.step_definitions;

import com.tryCloud.pages.LoginPage;
import com.tryCloud.utulities.BrowserUtilities;
import com.tryCloud.utulities.ConfigurationReader;
import com.tryCloud.utulities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Alert;

public class Login_steps {

    LoginPage loginPage = new LoginPage();


    @Given("user is on login page")
    public void user_is_on_login_page() {
        String url = ConfigurationReader.getProperty("qa1");
        Driver.getDriver().get(url);
    }

    @When("user enters {string} and {string}")
    public void user_enters_and(String username, String password) {
       username = ConfigurationReader.getProperty("username");
       password = ConfigurationReader.getProperty("password");
        loginPage.login(username, password);
    }

    @Then("user should log in")
    public void user_should_log_in() {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals("Verify title","Files - Trycloud",actualTitle);

    }

    @Then("user should log out")
    public void user_should_log_out() {
        loginPage.logout();
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains("Trycloud"));
    }

//Login with valid credentials (@Login_valid)
    @When("user enters username and password")
    public void user_enters_username_and_password() {
        loginPage.login("User1", "Userpass123");
    }

//Scenario Outline: login as a invalid user
    @Then("user should not log in")
    public void user_should_not_log_in() {
    Assert.assertTrue(loginPage.getError_message().isDisplayed());
    }


    //@Login_invalid
    //  Scenario Outline: login as a invalid user
    @When("user enters invalid {string} and {string}")
    public void user_enters_invalid_and(String string, String string2) {

        System.out.printf("Login with user name %s and %s password\n", string, string2);
        loginPage.login(string, string2);
    }
//
////W.i.P==> work in progress
    @Then("validate {string} error message should displayed")
    public void validate_error_message_should_displayed(String string) {
    String expected_message = "Please fill out this field.";
       String actual_message= loginPage.get_alertText();
        System.out.println(actual_message);
       // Assert.assertEquals(expected_message,actual_message);
    }




}
