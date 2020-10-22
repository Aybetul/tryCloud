package com.tryCloud.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class CalendarPage extends BasePage {


    @FindBy(id = "new-calendar-button")
    private WebElement new_calendar;

    @FindBy(xpath = "//a[@id='new-calendar-button']//following-sibling::div//input")
    private WebElement new_calendar_name;

    @FindBy(css = "[class^='button middle ng-b']")
    private WebElement date_tab;

    @FindBy(css = "[name='title']")
    private WebElement event_name;

    @FindBy(xpath = "//textarea[@name='title']//following-sibling::select")
    private WebElement selectCalendarName;

    @FindBy(xpath = "//input[@ng-model='date']")
    private List<WebElement> date_event;

    @FindBy(xpath = "//input[@ng-model='time']")
    private List<WebElement> time_event;

    @FindBy(xpath = "//button[contains(text(),'Create')]")
    private WebElement create_btn;

    public String get_created_calendar(String calendarName){
        return driver.findElement(By.xpath("//div[text()='"+calendarName+"']")).getText();
    }

    public void clickCreate(){
        create_btn.click();
    }

    public void setStartOfEvent(){
        Date today=new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        date_event.get(0).sendKeys(formatter.format(today));
        time_event.get(0).sendKeys("12:00 PM"+Keys.ENTER);


    }
    public void setEndOfEvent(){
        Date today=new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        date_event.get(1).sendKeys(formatter.format(today));
        time_event.get(1).sendKeys("03:00 PM"+Keys.ENTER);


    }

    public void selectCalendar(String calendarName){
        Select select=new Select(selectCalendarName);
        select.selectByVisibleText(calendarName);

    }

    public void setEvent(String eventName){
        Date today=new Date();

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        driver.findElement(By.xpath("//td[@data-date='+"+formatter.format(today)+"']")).click();
        event_name.sendKeys(eventName);
        //devammmmmi????
    }

    public String getDate(){

        return date_tab.getText();
    }


    public void click_newCalendar(String btn_date){
        new_calendar.click();
    }
    public void nameCalendar(String name){
        new_calendar_name.sendKeys(name+ Keys.ENTER);
    }
    public String calendarCreated(String calendarName){
       return driver.findElement(By.xpath("//a[@title='" + calendarName + "']")).getText();
    }

    //btn_name->day,week,month
    public void click_date_btn(String btn_date){
        driver.findElement(By.xpath("//button[text()='"+btn_date+"']")).click();

    }




}
