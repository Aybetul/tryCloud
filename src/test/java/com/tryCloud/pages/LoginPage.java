package com.tryCloud.pages;

<<<<<<< HEAD
public class LoginPage {
=======
import com.tryCloud.utulities.Driver;
import org.junit.rules.ExpectedException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends PageBase {
    //*
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "user")
    private WebElement username;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "submit")
    private WebElement login_btn;

    @FindBy(id = "lost-password")
    private WebElement forgot_password;


    @FindBy(xpath = "//header/div[2]/div[3]/div[1]/div[1]/img[1]")
    private WebElement user_icon;


    @FindBy(xpath = "//li[@data-id='logout']//a")
    private WebElement log_out;

    @FindBy(xpath = "//p[contains(text(),'Wrong password.')]")
    private WebElement error_message;

    public WebElement getError_message() {
        wait.until(ExpectedConditions.visibilityOf(error_message));
        return error_message;
    }

    //*
    public void login(String username, String password) {
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        login_btn.click();
    }

    //*
    public void logout() {
        user_icon.click();
        log_out.click();
    }

    public String get_alertText() {
       return driver.findElement(By.id("sp_amount")).getAttribute("validationMessage");

}


>>>>>>> refs/remotes/origin/master

}
