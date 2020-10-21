package com.tryCloud.pages;

import com.tryCloud.utulities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BasePage {
   


    protected WebDriver driver= Driver.getDriver();
    protected Actions actions = new Actions(Driver.getDriver());

    protected WebDriverWait wait=new WebDriverWait(driver,15);

    public BasePage(){
        PageFactory.initElements(driver,this);
    }





    public void navigateTo(String tab_name){
        driver.findElement(By.xpath("//ul[@id='appmenu']//li[@data-id='"+tab_name+"']")).click();
    }





}
/*

Login-Sidika
Files-Sumeyya
Gallery-Seyma
Calendar-Sumeyra

 */