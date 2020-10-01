package com.tryCloud.pages;

import com.tryCloud.utulities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageBase {


    protected WebDriver driver= Driver.getDriver();
    protected WebDriverWait wait=new WebDriverWait(driver,15);
    public PageBase(){
        PageFactory.initElements(driver,this);
    }
}
