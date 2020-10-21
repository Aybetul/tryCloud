package com.tryCloud.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage  extends BasePage{
    @FindBy(id = "user")
    private WebElement username;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "submit")
    private WebElement login_btn;

    @FindBy(id = "lost-password")
    private WebElement forgot_password;

    @FindBy(className= "avatardiv avatardiv-shown")
    private WebElement user_icon;

    @FindBy(xpath = "//li[@data-id='logout']//a")
    private WebElement log_out;











}
